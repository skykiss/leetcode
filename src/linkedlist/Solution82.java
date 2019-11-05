package linkedlist;

/**
 * @Author: october
 * @Date: 2019/11/3 21:49
 * @Description:
 */
public class Solution82 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 使用快慢指针  正常情况下 慢指针在快指针前面， 当快指针遇到满足条件时候一直遍历 ，直到到达不符合条件的地方 然后慢指针指向那里
     */

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode dummy = new ListNode(0);  // 哑节点
            dummy.next = head;
            ListNode fast, slow;
            fast = head;
            slow = dummy;
            while (fast != null){     // 一直遍历到最后一个节点
                if (fast.next != null && fast.next.val != fast.val){  // 如果值不相同  则会移动慢指针
                    if (slow.next == fast){
                        slow = fast;
                    }
                    else{
                        slow.next = fast.next;
                    }
                }
                else if (fast.next == null && slow.next != fast) slow.next = null;   // 特判 因为如果直接到最后一个node 则不会进入上面那个条件  需要进行特殊处理
                fast = fast.next;   // 移动快指针
            }
            return dummy.next;
        }
    }
}
