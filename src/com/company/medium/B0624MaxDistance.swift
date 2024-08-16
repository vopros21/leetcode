/**
 * <a href="https://leetcode.com/problems/maximum-distance-in-arrays">624. Maximum Distance in Arrays</a>
 * Runtime: 816ms, beats: 50.00%; Memory: 22.64MB, beats: 50.00%
 *
 * @author Mike Kostenko on 16/08/2024
 */

class B0624MaxDistance {
	var maxDistance = 0
	func maxDistance(_ arrays: [[Int]]) -> Int {
		var minVal = arrays[0][0]
		var maxVal = arrays[0][arrays[0].count - 1]
		for i in 1..<arrays.count {
			let curMin = arrays[i][0]
			let curMax = arrays[i][arrays[i].count - 1]
			maxDistance = max(maxDistance, max(abs(curMax - minVal), abs(maxVal - curMin)))
			minVal = min(minVal, curMin)
			maxVal = max(maxVal, curMax)
		}
		return maxDistance
	}
}