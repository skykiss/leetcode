package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/3 19:08
 * @Description:
 */
public class Solution61 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 先遍历计算链表长度  然后k对链表长度取余 得出实际需要移动的位置
     * 使用双指针  通过slow找出需要移动首位的位置  然后把此当作头 然后fast 的下一个指向原来的头
     */
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || k == 0){
                return head;
            }
            ListNode fast, slow, count, newHead;
            int num = 0;
            fast = head;
            slow = head;
            count = head;
            while(count != null){   // 统计长度
                num ++;
                count = count.next;
            }
            k = k % num;   // 求出实际移动长度
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }
            while(fast.next != null){  // fast指针移动到最末端
                fast = fast.next;
                slow = slow.next;
            }
            fast.next = head;   // 把fast的下一个指向原来的头
            newHead = slow.next;   // 新的第一个是slow指针的下一个
            slow.next = null;   //尾巴置为null
            return newHead;
        }
    }

}
