/**
 *  * <a href="https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/">3217. Delete Nodes From Linked List Present in Array</a>
 *  * Runtime: 897ms, beats: 47.06%; Memory: 27.34MB, beats: 31.37%
 *
 * @author Mike Kostenko on 06/09/2024
 */

class Solution {
    func modifiedList(_ nums: [Int], _ head: ListNode?) -> ListNode? {
        let s = Set(nums)
        var newH = head
        while s.contains(newH!.val) {
            newH = newH!.next
        }
        var cur = newH
        while cur!.next != nil {
            if !s.contains(cur!.next!.val) {
                cur = cur!.next
            } else {
                cur!.next = cur!.next!.next
            }
        }
        return newH
    }
}