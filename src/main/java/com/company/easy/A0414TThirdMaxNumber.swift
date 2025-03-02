/**
 *  * <a href="https://leetcode.com/problems/third-maximum-number/">414. Third Maximum Number</a>
 *  * Runtime: 10ms, beats: 86.17%; Memory: 15.77MB, beats: 63.83%
 *
 * @author Mike Kostenko on 06/05/2024
 */

class Solution {
	func thirdMax(_ nums: [Int]) -> Int {
		var numsSet = Set(nums)
			
		if numsSet.count < 3 {
			return numsSet.max()!
		} else {
			numsSet.remove(numsSet.max()!)
			numsSet.remove(numsSet.max()!)
			return numsSet.max()!
		}
	}
}
