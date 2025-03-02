/**
 *  * <a href="https://leetcode.com/problems/add-strings/submissions/">415. Add Strings</a>
 *  * Runtime: 9ms, beats: 83.93%; Memory: 16.76MB, beats: 14.29%
 *
 * @author Mike Kostenko on 06/05/2024
 */
class Solution {
    func addStrings(_ num1: String, _ num2: String) -> String {
		var result = ""
		var i = num1.count - 1
		var j = num2.count - 1
		var carry = 0
		let arr1 = Array(num1)
		let arr2 = Array(num2)
		while i >= 0 || j >= 0 {
			var sum = carry
			if i >= 0 {
				sum += Int(String(arr1[i]))!
				i -= 1
			}
			if j >= 0 {
				sum += Int(String(arr2[j]))!
				j -= 1
			}
			carry = sum / 10
			result = String(sum % 10) + result
		}
		if carry > 0 {
			result = String(carry) + result
		}
		return result

    }
}