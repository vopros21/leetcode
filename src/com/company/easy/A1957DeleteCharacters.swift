/**
 *  * <a href="https://leetcode.com/problems/delete-characters-to-make-fancy-string/">1957. Delete Characters to Make Fancy String</a>
 *  * Runtime: 393ms, beats: 100.00%; Memory: 20.32MB, beats: 35.29%
 *
 * @author Mike Kostenko on 1/11/2024
 */

 class Solution {
    func makeFancyString(_ s: String) -> String {
        if s.count < 3 {
            return s
        }
        var res = String(s.prefix(2))
        var prev = res.last!
        var prev1 = res.first!
        for c in s.suffix(s.count - 2) {
            if c == prev && c == prev1 {
                continue
            }
            prev1 = prev
            prev = c
            res += String(c)
        }
        return res
    }
}
