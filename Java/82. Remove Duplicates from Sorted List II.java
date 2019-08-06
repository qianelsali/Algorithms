/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode dummy = new ListNode(0);
        
        ListNode preNode = dummy;
        ListNode curNode = head;
        ListNode realNode = dummy;
        while(curNode != null){
            if((preNode==dummy || preNode.val != curNode.val) && (curNode.next == null || curNode.val != curNode.next.val)){
                realNode.next = curNode;
                realNode = curNode;
            }
            preNode = curNode;
            curNode = curNode.next;
            preNode.next = null;
        }
        return dummy.next;        
    }
}