/**
 *  * <a href="https://leetcode.com/problems/sort-array-by-increasing-frequency/">1636. Sort Array by Increasing Frequency</a>
 *  * Runtime: 17ms, beats: 25.00%; Memory: 16.19MB, beats: 50.00%
 *
 * @author Mike Kostenko on 23/07/2024
 */

 class A1636SortArrayDecreasing {
	func frequencySort(_ nums: [Int]) -> [Int] {
        let mappedItems = nums.map { ($0, 1) }
        let counts = Dictionary(mappedItems, uniquingKeysWith: +)
        return nums.sorted {
            counts[$0]! < counts[$1]! || (counts[$0]! == counts[$1]! && $0 > $1)
        }
    }
 }

 