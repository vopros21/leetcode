//<a href="https://leetcode.com/problems/minimum-increment-to-make-array-unique/">945. Minimum Increment to Make Array Unique</a>
//Runtime: 351ms, beats: 66.67; Memory: 20.13MB, beats: 33.33%

class B945MinimumIncrement {
    func minIncrementForUnique(_ nums: [Int]) -> Int {
        if nums.count == 1 {
            return 0
        }
        var sorted = nums.sorted()
		print(sorted)
        var current = sorted[0]
        var res = 0
        for i in 1..<nums.count {
            if sorted[i] <= current {
                res += current - sorted[i] + 1
                sorted[i] = current + 1
            }
            current = sorted[i]
			print(sorted)
        }
        return res
    }
}

let b945 = B945MinimumIncrement()
print(b945.minIncrementForUnique([1, 2, 2])) // 1
print(b945.minIncrementForUnique([3, 2, 1, 2, 1, 7])) // 6