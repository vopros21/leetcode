//<a href="https://leetcode.com/problems/boats-to-save-people/">881. Boats to Save People</a>
//Runtime: 2013ms, beats: 7.69; Memory: 17.70MB, beats: 46.15%

class Solution {
    func numRescueBoats(_ people: [Int], _ limit: Int) -> Int {
        let sortedPeople = people.sorted()
		var count = 0
		var left = 0
		var right = sortedPeople.count - 1
		var currentLimit = limit
		while left <= right {
			if sortedPeople[left] + sortedPeople[right] <= currentLimit {
				currentLimit -= sortedPeople[left]
				left += 1
				if sortedPeople[left] + sortedPeople[right] > currentLimit {
					right -= 1
					count += 1
					currentLimit = limit
				}
				continue
			}
			right -= 1
			count += 1
			currentLimit = limit
		}
        return count
    }
}

let s = Solution()
var people = [3, 2, 2, 1]
var limit = 3
assert(s.numRescueBoats(people, limit) == 3) // 3

people = [5, 4, 2, 1, 1, 1, 1, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1]
limit = 5
print(s.numRescueBoats(people, limit))
assert(s.numRescueBoats(people, limit) == 6) // 6

people = [3, 5, 3, 4]
limit = 5
assert(s.numRescueBoats(people, limit) == 4) // 4

people = [2, 4]
limit = 5
assert(s.numRescueBoats(people, limit) == 2) // 2

people = [1, 2]
limit = 3
assert(s.numRescueBoats(people, limit) == 1) // 1