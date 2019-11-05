package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/3 15:55
 * @Description:
 */
public class Solution203 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 在头部加一个哑节点  这样在删除头节点的时候就不会出错
     */
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            // 定义一个哑节点
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;
            dummy.next = head;
            while(current.next != null){
                if (current.next.val == val) current.next = current.next.next;
                else current = current.next;
            }
            return dummy.next;
        }
    }

}
