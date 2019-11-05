package sametree;

/**
 * @Author: october
 * @Date: 2019/11/5 14:25
 * @Description:
 */
public class Solution101 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return isSameTree(root.left, root.right);
        }

        private boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;
            if (p == null || q == null) return false;
            if (p.val != q.val) return false;
            return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        }

    }


}
