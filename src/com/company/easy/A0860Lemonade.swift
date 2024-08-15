/**
 *  * <a href="https://leetcode.com/problems/lemonade-change">860. Lemonade Change</a>
 *  * Runtime: 206ms, beats: 93.33%; Memory: 19.02MB, beats: 26.67%
 *
 * @author Mike Kostenko on 15/08/2024
 */

 class A0860Lemonade {
    func lemonadeChange(_ bills: [Int]) -> Bool {
        var have5 = 0
        var have10 = 0
        for b in bills {
            if b == 5 {
                have5 += 1
                continue
            }
            if b == 10 {
                if have5 == 0 {
                    return false
                }
                have5 -= 1
                have10 += 1
                continue
            }
            if have10 == 0 {
                if have5 < 3 {
                    return false
                } else {
                    have5 -= 3
                    continue
                }
            } else {
                if have5 == 0 {
                    return false
                } else {
                    have10 -= 1
                    have5 -= 1
                }
            }
        }
        return true
    }
}