import Foundation

/**
 *  * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">28. Find the Index of the First Occurrence in a String</a>
 *  * Runtime: 5ms, beats: 57.10%; Memory: 16.37MB, beats: 28.84%
 *
 * @author Mike Kostenko on 24/04/2024
 */
class Solution {
    func strStr(_ haystack: String, _ needle: String) -> Int {
        if let index = haystack.range(of: needle) {
            return haystack.distance(from: haystack.startIndex, to: index.lowerBound)
        } else {
            return -1
        }
    }
}

let haystack = "hello", needle = "ll"
let solution = Solution()
let result = solution.strStr(haystack, needle)
print(result)