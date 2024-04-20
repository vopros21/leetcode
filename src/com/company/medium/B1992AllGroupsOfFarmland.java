package com.company.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-all-groups-of-farmland/">1992. Find All Groups of Farmland</a>
 * Runtime: 6ms, beats: 82.13%; Memory: 60.88MB, beats: 53.61%
 *
 * @author Mike Kostenko on 20/04/2024
 */
public class B1992AllGroupsOfFarmland {
    public int[][] findFarmland(int[][] land) {
        List<int[]> arr = new ArrayList<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (land[i][j] == 1) {
                    int[] end = findRightCorner(land, i, j);
                    arr.add(new int[]{i, j, end[0], end[1]});
                    j = end[1];
                }
            }
        }

        int[][] res = new int[arr.size()][2];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }

    private int[] findRightCorner(int[][] land, int i, int j) {
        int x = i;
        int y = j;
        while (x < land.length && land[x][j] == 1) {
            x++;
        }
        while (y < land[i].length && land[i][y] == 1) {
            y++;
        }
        for (int k = i; k < x; k++) {
            for (int l = j; l < y; l++) {
                land[k][l] = 0;
            }
        }
        return new int[]{x - 1, y - 1};
    }
}
