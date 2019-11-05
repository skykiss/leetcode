package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/3 16:56
 * @Description:
 */
public class Solution24 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 递归的三个要素:
     *  返回值
     *  调用单元做了什么
     *  终止条件
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == head) return null; // 递归结束条件
            ListNode next = head.next;   // 获取头节点 和头结点的下一个节点
            head.next = swapPairs(next.next);   // 把头节点指向之后的值
            next.next = head;  // 把本来头结点的下一个节点指向头节点
            return next; // 把现在next当作头节点返回
        }
    }

}
