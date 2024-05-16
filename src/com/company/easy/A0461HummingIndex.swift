class Solution {
    func hammingDistance(_ x: Int, _ y: Int) -> Int {
        var x1 = x
        var y1 = y
        var count = 0
        while max(x1, y1) > 0 {
            if x1 % 2 != y1 % 2 {
                count += 1
            }
            x1 = x1 / 2
            y1 /= 2
        }
        return count
    }
}

// add tests


		let s = Solution()
		assert(s.hammingDistance(1, 4) == 2)
		assert(s.hammingDistance(3, 1) == 1)