package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/3 16:48
 * @Description:
 */
public class Solution876 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 找中点 使用快慢指针
     */
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode fast, slow;
            fast = head;
            slow = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

}
