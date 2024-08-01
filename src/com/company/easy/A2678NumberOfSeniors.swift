/**
 *  * <a href="https://leetcode.com/problems/number-of-senior-citizens">2678. Number of Senior Citizens</a>
 *  * Runtime: 18ms, beats: 96.55%; Memory: 16.12MB, beats: 82.76%
 *
 * @author Mike Kostenko on 01/08/2024
 */

 class A2678NumberOfSeniors {
    func countSeniors(_ details: [String]) -> Int {
        var count = 0
        for s in details {
            let age = Int(s.suffix(4).prefix(2)) ?? 0
            count += age > 60 ? 1 : 0
        }
        return count
    }
}