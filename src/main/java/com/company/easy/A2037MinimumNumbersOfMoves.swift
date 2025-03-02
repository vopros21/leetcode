/**
 *  * <a href="https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/">2037. Minimum Number of Moves to Seat Everyone</a>
 *  * Runtime: 14ms, beats: 50.00%; Memory: 15.70MB, beats: 100.00%
 *
 * @author Mike Kostenko on 13/06/2024
 */

class MinimumMoves {
	func minMovesToSeat(_ seats: [Int], _ students: [Int]) -> Int {
        let sortSeats = seats.sorted()
		let sortStud = students.sorted()
		var result = 0
		for i in 0..<seats.count {
			result += abs(sortSeats[i] - sortStud[i])
		}
		return result
    }
}
assert(MinimumMoves().minMovesToSeat([3,1,5], [2,7,4]) == 4)
assert(MinimumMoves().minMovesToSeat([4,1,5,9], [1,3,2,6]) == 7)
assert(MinimumMoves().minMovesToSeat([2,2,6,6], [1,3,2,6]) == 4)
assert(MinimumMoves().minMovesToSeat([1,2,3,4], [1,1,1,1]) == 6)