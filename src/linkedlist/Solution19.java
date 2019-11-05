package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/3 11:52
 * @Description:
 */
public class Solution19 {

    public class ListNode {
        int val;
        ListNode next;
         ListNode(int x) { val = x; }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next= head;
            ListNode slow = dummy;
            ListNode fast = dummy;
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }
            while(fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;

            return dummy.next;
        }
    }

}
