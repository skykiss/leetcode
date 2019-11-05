package linkedlist;



/**
 * @Author: october
 * @Date: 2019/11/5 12:14
 * @Description:
 */
public class Solution142 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * floyd 判圈法   设起点为A 环交点为B  相遇点为C  AB之间距离为a  BC之间距离为b  环的的长度为l  A到相遇地方所走距离为d
     * 慢指针  d = a + b + xl  (x为slow转的实际圈数)
     * 快指针 2d = a + b + yl (x为fast转的实际圈数， 因为快指针每次走两个节点 所以相遇所走距离是2d)
     * 做差  d = (y-x)l = kl 代表A到相遇地方走的距离是环长度倍数
     * A到环交点B的距离a = kl - nl - b k和n都是常数  所以实际距离是n圈减去b的距离 也就是n圈加上C到B的距离
     * 在找到相遇点的时候 把一个指针指向头  然后同时开始遍历 当他们相遇的时候肯定是环的交点
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast, slow;
            slow = head;
            fast = head;
            do {
                if (fast == null || fast.next == null) return null;
                fast = fast.next.next;
                slow = slow.next;
            } while (fast != slow);
            fast = head;
            while (fast != slow){
                fast = fast.next;
                slow = slow.next;
            }
            return fast;

        }
    }

}
