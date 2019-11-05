package sametree;

/**
 * @Author: october
 * @Date: 2019/11/5 14:36
 * @Description:
 */
public class Solution104 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    /**
     * 节点的高度 = Max(左子树的高度，右子树的高度) + 1
     * 以此类推，最后一个左或右节点高度为0 再反过来相加回去即可
     * 时间复杂度：O(n)
     * 空间复杂度
     * 最坏情况下 O(n) 退化为单链表
     * 最好情况下 O(logn) 为平衡二叉树且高度为logn
     */

    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            else {
                int leftHeight = maxDepth(root.left);
                int rightHeight = maxDepth(root.right);
                return Math.max(leftHeight, rightHeight) + 1;
            }
        }

    }

}
