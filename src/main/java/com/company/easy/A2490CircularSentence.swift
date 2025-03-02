/**
 *  * <a href="https://leetcode.com/problems/circular-sentence/">2490. Circular Sentence</a>
 *  * Runtime: 2ms, beats: 100.00%; Memory: 18.02MB, beats: 33.33%
 *
 * @author Mike Kostenko on 02/11/2024
 */

 class Solution {
    func isCircularSentence(_ sentence: String) -> Bool {
        if sentence.count < 2 {
            return true
        }
        if sentence.first! != sentence.last! {
            return false
        }
        let words = Array(sentence.split(separator: " "))
        for i in 1..<words.count {
            if words[i-1].last! != words[i].first! {
                return false
            }
        }
        return true
    }
}