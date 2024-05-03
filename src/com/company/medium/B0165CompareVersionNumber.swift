/**
 * <a href="https://leetcode.com/problems/compare-version-numbers/">165. Compare Version Numbers</a>
 * Runtime: 2ms, beats: 57.14%; Memory: 17.14MB, beats: 10.71%
 * @author Mike Kostenko on 03/05/2024
 */

class Solution {
    func compareVersion(_ version1: String, _ version2: String) -> Int {
        let v1 = version1.components(separatedBy: ".").map { Int($0) ?? 0 }
		let v2 = version2.components(separatedBy: ".").map { Int($0) ?? 0 }
		let n = max(v1.count, v2.count)
		for i in 0..<n {
			let a = i < v1.count ? v1[i] : 0
			let b = i < v2.count ? v2[i] : 0
			if a < b {
				return -1
			} else if a > b {
				return 1
			}
    	}
		return 0
	}
}

// Tests
let s = Solution()
assert(s.compareVersion("0.1", "1.1") == -1)
assert(s.compareVersion("1.0.1", "1") == 1)
assert(s.compareVersion("1.01", "1.001") == 0)
assert(s.compareVersion("1.0", "1.0.0") == 0)