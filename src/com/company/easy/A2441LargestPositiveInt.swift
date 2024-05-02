/**
 *  * <a href="https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/">2441. Largest Positive Integer That Exists With Its Negative</a>
 *  * Runtime: 32ms, beats: 100.00%; Memory: 16.16MB, beats: 18.18%
 *
 * @author Mike Kostenko on 02/05/2024
 */

class Solution {
    func findMaxK(_ nums: [Int]) -> Int {
        let sorted: [Int] = nums.sorted().reversed()
        var i = 0
        while i < sorted.count && sorted[i] > 0{
            if sorted.contains(-sorted[i]) {
                return sorted[i]
            }
			i += 1
        }
        return -1
    }
}

var sol = Solution()
print(sol.findMaxK([648,674,610])) // -1
