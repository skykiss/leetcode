package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/3 23:15
 * @Description:
 */
public class Solution92 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    class Solution {
        public ListNode reverseBetween(ListNode head, int m, int n) {
            ListNode fast, slow, dummy = head;
            fast = dummy;
            slow = dummy;
            for (int i = 0; i < (m-n); i++) {
                fast = fast.next;
            }
            return null;
        }
    }

}
