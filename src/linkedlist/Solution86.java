package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/5 11:36
 * @Description:
 */
public class Solution86 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 思路是把他拆分为两条链表  大于x的在前面 小于等于x的在后面
     * 最后将两条链表合并
     * 定义哑节点作用是容易对头进行操作
     */
    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode beforeHead = new ListNode(0);
            ListNode before = beforeHead;
            ListNode afterHead = new ListNode(0);
            ListNode after = afterHead;
            while (head != null){
                if (head.val < x) {
                    before.next = head;
                    before = before.next;
                }
                else{
                    after.next = head;
                    after = after.next;
                }
                head = head.next;
            }
            after.next = null;   // 最后一个置为null
            before.next = afterHead.next;   // 链表拼接
            return beforeHead.next;
        }
    }


}
