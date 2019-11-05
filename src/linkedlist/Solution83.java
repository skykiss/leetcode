package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/3 14:49
 * @Description:
 */
public class Solution83 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode fast = head;
            while(fast != null && fast.next != null){
                if (fast.val == fast.next.val){
                    fast.next = fast.next.next;
                }
                else
                    fast = fast.next;
            }
            return head;
        }
    }
}
