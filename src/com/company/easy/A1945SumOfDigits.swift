/**
 * <a href="https://leetcode.com/problems/sum-of-digits-of-string-after-convert/">1945. Sum of Digits of String After Convert</a>
 * Runtime: 0ms, beats: 100%; Memory: 16.36MB, beats: 66.67%
 * @author Mike Kostenko on 03/09/2024
 */

 class Solution {
    let dic = ["a": "1", "b": "2", "c": "3", "d": "4", "e": "5", "f": "6", "g": "7", "h": "8", "i": "9", "j": "10", "k": "11", "l": "12", "m": "13", "n": "14", "o": "15", "p": "16", "q": "17", "r": "18", "s": "19", "t": "20", "u": "21", "v": "22", "w": "23", "x": "24", "y": "25", "z": "26"]
    func getLucky(_ s: String, _ k: Int) -> Int {
        var original = ""
        for c in s {
            original.append(dic[String(c)]!)
        }
        if k == 0 {
            return Int(original)!
        }
        var res = ""
        var cou = 0
        while cou < k {
            var sum = 0
            for i in original {
                if let d = Int(String(i)) {
                    sum += d
                }
            }
            res = String(sum)
            original = res
            cou += 1
        }
        return Int(res)!
    }
}