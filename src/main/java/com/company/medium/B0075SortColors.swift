/**
 * <a href="https://leetcode.com/problems/sort-colors">75. Sort Colors</a>
 * Runtime: 0ms, beats: 100%; Memory: 16.19MB, beats: 18.90%
 *
 * @author Mike Kostenko on 12/06/2024
 */

class Solution {
    func sortColors(_ nums: inout [Int]) {
        var zero = 0
        var one = 0
        var two = 0
        for i in nums {
            if i == 0 {
                zero += 1
            } else if i == 1 {
                one += 1
            } else {
                two += 1
            }
        }
        for i in 0..<nums.count {
            if zero > 0 {
                nums[i] = 0
                zero -= 1
            } else if one > 0 {
                nums[i] = 1
                one -= 1
            } else {
                nums[i] = 2
            }
        }
    }
}