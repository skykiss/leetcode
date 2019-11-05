package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/3 15:27
 * @Description:
 */
public class Solution160 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 定义两个指针 pa  pb  然后遍历,放一个节点遍历到为null的时候则直接指向另外一个节点的头
     * 相当于  a + b = b + a  他们长度相同 如果相交的话必然同时走到尾节点 最后一段距离则会一起遍历 他们必定相遇
     * 不相交则他们会同时走到尾节点 不会相遇
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode pa, pb;
            if (headA == null || headB == null) return null;   //有一个节点为null 则直接退出
            pa = headA; pb = headB;
            while (pa != pb){   //退出两个条件 1 相遇 2 同时为null
                pa = pa == null ? headB : pa.next;
                pb = pb == null ? headA : pb.next;
            }
            return pa;
        }
    }

}
