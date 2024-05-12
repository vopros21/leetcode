/**
 *  * <a href="https://leetcode.com/problems/largest-local-values-in-a-matrix/">2373. Largest Local Values in a Matrix</a>
 *  * Runtime: 48ms, beats: 199.00%; Memory: 16.30MB, beats: 66.67%
 *
 * @author Mike Kostenko on 12/05/2024
 */

class Solution {
    func largestLocal(_ grid: [[Int]]) -> [[Int]] {
        let n = grid.count
        // var res = [[Int]](
        //     repeating: [Int](repeating: 0, count: n - 2),
        //     count: n - 2)
        var res:[[Int]] = []
        for i in 1..<(n - 1) {
            res.append([])
            for j in 1..<(n - 1) {
                let maxN = max(grid[i-1][j-1], grid[i][j-1], grid[i+1][j-1],
                grid[i-1][j], grid[i][j], grid[i+1][j],
                grid[i-1][j+1], grid[i][j+1], grid[i+1][j+1])
                res[i - 1].append(maxN)
            }
        }
        return res
    }
}

var grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
print(Solution().largestLocal(grid)) // [[9, 9], [8, 6]]