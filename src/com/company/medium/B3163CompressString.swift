/**
 *  * <a href="https://leetcode.com/problems/string-compression-iii/">3163. String Compression III</a>
 *  * Runtime: 103ms, beats: 100.00%; Memory: 18.69MB, beats: 100.00%
 *
 * @author Mike Kostenko on 04/11/2024
 */

 class Solution {
    func compressedString(_ word: String) -> String {
        var comp = ""
        var count = 0
        var prevC = word.first!
        for c in word {
            if c == prevC && count < 9 {
                count += 1
            } else {
                comp = "\(comp)\(count)\(prevC)"
                count = 1
                prevC = c
            }
        }
        comp = "\(comp)\(count)\(word.last!)"
        return comp
    }
}