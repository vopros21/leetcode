/**
 *  * <a href="https://leetcode.com/problems/reverse-prefix-of-word/">2000. Reverse Prefix of Word</a>
 *  * Runtime: 3ms, beats: 80.39%; Memory: 16.21MB, beats: 27.45%
 *
 * @author Mike Kostenko on 1/05/2024
 */

func reversePrefix(_ word: String, _ ch: Character) -> String {
	if let index = word.firstIndex(of: ch) {
		
		let prefix = String(word.prefix(through: index))
		let reversedPrefix = String(prefix.reversed())
		return reversedPrefix + word.suffix(from: word.index(after: index))
	}
	return word
}

let inputString = "Hello, World!"
let character: Character = ","
let result = reversePrefix(inputString, character)
print(result) // Output: olleH, World!