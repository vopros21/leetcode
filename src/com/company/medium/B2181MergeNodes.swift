/**
 *  * <a href="https://leetcode.com/problems/merge-nodes-in-between-zeros/">2181. Merge Nodes in Between Zeros</a>
 *  * Runtime: 933ms, beats: 13.33%; Memory: 34.30MB, beats: 46.67%
 *
 * @author Mike Kostenko on 06/05/2024
 */

class B2181MergeNodes {
    func mergeNodes(_ head: ListNode?) -> ListNode? {
        var sum = 0
        var newHead = ListNode(0)
        var newCur = newHead
        var current = head!.next
        while current != nil {
            sum += current!.val
            if current!.val == 0 {
                if newHead.val == 0 {
                    newHead.val = sum
                } else {
                newCur.next = ListNode(sum)
                
                newCur = newCur.next!
                }
                sum = 0
            }
            current = current!.next
        }
        return newHead
    }
}