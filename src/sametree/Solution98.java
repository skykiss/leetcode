package sametree;

/**
 * @Author: october
 * @Date: 2019/11/5 19:22
 * @Description:
 */
public class Solution98 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 使用max给root左边的右边子节点的设置一个上界
     * 使用min给root右边的的左边的子节点设置一个上界
     */
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return isValidBST(root, null, null);
        }

        public boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
            if (root == null) return true;
            if (min != null && root.val <= min.val) return false;
            if (max != null && root.val >= max.val) return false;
            return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
        }
    }

}
