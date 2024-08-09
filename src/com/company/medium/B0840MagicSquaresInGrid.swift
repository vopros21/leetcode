/**
 * <a href="https://leetcode.com/problems/magic-squares-in-grid/">840. Magic Squares In Grid</a>
 * Runtime: 0ms, beats: 100%; Memory: 15.71MB, beats: 100.00%
 *
 * @author Mike Kostenko on 09/08/2024
 */

class B0840MagicSquaresInGrid {
    func numMagicSquaresInside(_ grid: [[Int]]) -> Int {
        if grid.count < 3 {
            return 0
        }
        for row in grid {
            if row.count < 3 {
                return 0
            }
        }
        var cm = 0
        for i in 1..<grid.count - 1 {
            for j in 1..<grid[i].count - 1 {
                if isMagic(grid, i, j) {
                    cm += 1
                }
            }
        }
        return cm
    }

    func isMagic(_ grid:[[Int]], _ i:Int, _ j:Int) -> Bool {
        var digits = Set<Int>()
        for k in i-1...i+1 {
            for m in j-1...j+1 {
                if digits.contains(grid[k][m]) || grid[k][m] > 9 || grid[k][m] < 1 {
                    return false
                } else {
                    digits.insert(grid[k][m])
                }
            }
        }
        var sums = [Int](repeating: 0, count: 8)
        sums[0] = grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1]
        sums[1] = grid[i][j - 1] + grid[i][j] + grid[i][j + 1]
        sums[2] = grid[i + 1][j - 1] + grid[i + 1][j] + grid[i + 1][j + 1]

        sums[3] = grid[i - 1][j - 1] + grid[i][j - 1] + grid[i + 1][j - 1]
        sums[4] = grid[i - 1][j] + grid[i][j] + grid[i + 1][j]
        sums[5] = grid[i - 1][j + 1] + grid[i][j + 1] + grid[i + 1][j + 1]

        sums[6] = grid[i - 1][j - 1] + grid[i][j] + grid[i + 1][j + 1]
        sums[7] = grid[i - 1][j + 1] + grid[i][j] + grid[i + 1][j - 1]
        
   

        return sums.dropFirst().allSatisfy({ $0 == sums.first })
    }
}