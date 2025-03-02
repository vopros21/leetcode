//<a href="https://leetcode.com/problems/container-with-most-water/">11. Container With Most Water</a>
//Runtime: 212ms, beats: 88.26; Memory: 19.24MB, beats: 76.04%

class Solution {
    func maxArea(_ height: [Int]) -> Int {
		var start = 0
		var end = height.count - 1
		var volume = min(height[start], height[end]) * (end - start)
		while start < end {
			if height[start] < height[end] {
				start += 1
			} else {
				end -= 1
			}
			volume = max(volume, min(height[start], height[end]) * (end - start))
		}
        return volume
    }
}

let solution = Solution()
var input = [1,8,6,2,5,4,8,3,7]
print("Volume -> 49: \(solution.maxArea(input))") // 49
input = [1,1]
print("Volume -> 1: \(solution.maxArea(input))") // 1