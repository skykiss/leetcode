package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/3 16:16
 * @Description:
 */
public class Solution206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 两个指针分别指向当前的  和 前一个 用中间变量保存下一个 然后分别改变
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }
    }

}
