/**
 *  * <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">350. Intersection of Two Arrays II</a>
 *  * Runtime: 12ms, beats: 8.29%; Memory: 16.20MB, beats: 45.08%
 *
 * @author Mike Kostenko on 06/05/2024
 */

class A350IntersectionOfTwoArrays {
    func intersect(_ nums1: [Int], _ nums2: [Int]) -> [Int] {
        var target = nums2
        var res: [Int] = []
        for i in 0..<nums1.count {
            if target.contains(nums1[i]) {
                res.append(nums1[i])
                target[target.index(of: nums1[i])!] = -1
            }
        }
        return res
    }
}