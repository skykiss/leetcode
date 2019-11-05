package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/3 15:04
 * @Description:
 */
public class Solution141 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 使用双指针 一个快指针 一个慢指针 如果有环状 快指针肯定会追上慢指针 加入快指针遇到null则直接返回false
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) return false;
            ListNode slow = head;
            ListNode fast = head.next;
            while(slow != fast){
                if (fast == null || fast.next == null){   // 因为快指针是一次跳两个节点 所以需要判断当前节点和下一个节点是否为null
                    return false;
                }
                slow = slow.next; // 向后移动一个
                fast = fast.next.next;  // 向后移动两个
            }
            return true;
        }
    }

}
