/**
 *  * <a href="https://leetcode.com/problems/sort-the-people/">2418. Sort the People</a>
 *  * Runtime: 89ms, beats: 17.24%; Memory: 16.82MB, beats: 82.76%
 *
 * @author Mike Kostenko on 22/07/2024
 */

class Solution {
    func sortPeople(_ names: [String], _ heights: [Int]) -> [String] {
        let combined = zip(names, heights).sorted{ $0.1 > $1.1 }
    	return combined.map { $0.0 }
    }
}