package sametree;

/**
 * @Author: october
 * @Date: 2019/11/5 15:50
 * @Description:
 */
public class Solution110 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     *  自底部向顶部， 比较当前左子树和右子树高度差别 大于1则返回-1  否则反正高度 直到到根节点
     *
     */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return depth(root) != -1;
        }

        public int depth(TreeNode root){
            if (root == null) return 0;
            int leftHeight = depth(root.left);
            if (leftHeight == -1) return -1;
            int rightHeight = depth(root.right);
            if (rightHeight == -1) return -1;
            return Math.abs(leftHeight-rightHeight) > 1 ? -1 : Math.max(leftHeight, rightHeight) + 1;
        }

    }


}
