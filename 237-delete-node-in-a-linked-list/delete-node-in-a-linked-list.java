/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        while(curr.next != null){
            int data = curr.val;
            curr.val = curr.next.val;
            curr.next.val = data;
            if(curr.next.next == null){
                curr.next = null;
                return;
            }

            curr = curr.next;
        }
    }
}