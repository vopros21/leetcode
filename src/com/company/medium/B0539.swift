/**
 * <a href="https://leetcode.com/problems/minimum-time-difference/">539. Minimum Time Difference</a>
 * Runtime: 39ms, beats: 44.44%; Memory: 17.15MB, beats: 44.44%
 *
 * @author Mike Kostenko on 16/09/2024
 */

class Solution {
    func findMinDifference(_ timePoints: [String]) -> Int {
        var s = [Int]()
        for point in timePoints {
			var hours = point.split(separator: ":")[0]
			var minutes = point.split(separator: ":")[1]
            let time = Int(hours)! * 60 + Int(minutes)!
            s.append(time)
        }
        s.sort()
        s.append(s[0] + 1440)
        var m = 1440
        for i in 1..<s.count {
            m = min(m, s[i] - s[i - 1])
            if m == 0 {
                break
            }
        }
        return m
    }
}

let s = Solution()
print(s.findMinDifference(["23:59", "00:00"])) // 1