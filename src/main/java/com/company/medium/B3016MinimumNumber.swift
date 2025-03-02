/**
 *  * <a href="https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii">3016. Minimum Number of Pushes to Type Word II</a>
 *  * Runtime: 229ms, beats: 100.00%; Memory: 16.50MB, beats: 100.00%
 *
 * @author Mike Kostenko on 06/08/2024
 */

class B3016MinimumNumber {
    func minimumPushes(_ word: String) -> Int {
        var dicS = [Character: Int]()
        for ch in word {
            dicS[ch, default: 0] += 1
        }
        var count = 0
        let sortedDic = dicS.sorted { $0.1 > $1.1}
        var lap = 1
        for value in sortedDic {
            print(value.0)
            if lap <= 8 {
                lap += 1
                count += value.1
                continue
            } else if lap <= 16 {
                lap += 1
                count += value.1 * 2
                continue
            } else if lap <= 24 {
                lap += 1
                count += value.1 * 3
            } else {
                lap += 1
                count += value.1 * 4
            }
        }
        return count
    }
}