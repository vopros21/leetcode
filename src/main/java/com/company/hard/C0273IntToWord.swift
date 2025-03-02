/**
 *  * <a href="https://leetcode.com/problems/integer-to-english-words">273. Integer to English Words</a>
 *  * Runtime: 6ms, beats: 71.74%; Memory: 16.33MB, beats: 21.74%
 *
 * @author Mike Kostenko on 07/08/2024
 */

class C0273IntToWord {
	private let ones = ["", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"]
	private let tens: [String] = ["", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"]
	private let teens: [String] = ["", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"]
	private let thousands: [String] = ["", "Thousand", "Million", "Billion"]

    func numberToWords(_ num: Int) -> String {
		if num == 0 {
			return "Zero"
		}
		var number = num
		var result = ""
		var i = 0
		while number > 0 {
			if number % 1000 != 0 {
				result = helper(number % 1000) + thousands[i] + " " + result
			}
			number /= 1000
			i += 1
		}
		return result.trimmingCharacters(in: .whitespacesAndNewlines)
    }

	func helper(_ num: Int) -> String {
		if num == 0 {
			return ""
		} else if num < 10 {
			return "\(ones[num])"
		} else if num < 20 && num > 10 {
			return teens[num % 10] + " "
		} else if num < 100 {
			return tens[num / 10] + " " + helper(num % 10)
		} else {
			return ones[num / 100] + " Hundred " + helper(num % 100)
		}
	}
}

let c0273IntToWord = C0273IntToWord()
// assert(c0273IntToWord.numberToWords(10) == "Ten")
print(c0273IntToWord.numberToWords(10))
print(c0273IntToWord.numberToWords(20))
print(c0273IntToWord.numberToWords(100))
print(c0273IntToWord.numberToWords(1000))