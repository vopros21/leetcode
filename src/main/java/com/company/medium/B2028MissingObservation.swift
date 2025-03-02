/**
 * <a href="https://leetcode.com/problems/find-missing-observations/">2028. Find Missing Observations</a>
 * Runtime: 753ms, beats: 50%; Memory: 26.96MB, beats: 50%
 *
 * @author Mike Kostenko on 05/09/2024
 */

 class Solution {
    func missingRolls(_ rolls: [Int], _ mean: Int, _ n: Int) -> [Int] {
        var res = [Int]()
        var cou = rolls.count + n
        var summ = cou * mean
        var unknown = summ - rolls.reduce(0, +)
        if n * 6 < unknown || n > unknown {
            return res
        }
        cou = n
        while unknown > 0 && cou > 0 {
            if unknown <= 6 && cou == 1 {
                res.append(unknown)
                return res
            }
            res.append(unknown / cou)
            if let last = res.last {
                unknown -= last
            }
            cou -= 1
        }
        return res
    }
}