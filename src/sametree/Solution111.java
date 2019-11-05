package sametree;

/**
 * @Author: october
 * @Date: 2019/11/5 16:00
 * @Description:
 */
public class Solution111 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 叶子节点指的左右都没有节点
     */
    class Solution {

        int min = Integer.MAX_VALUE, current = 0;

        public int minDepth(TreeNode root) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) return 1;
            int min = Integer.MAX_VALUE;
            if (root.left != null){
                min = Math.min(min, minDepth(root.left));
            }
            if (root.right != null){
                min = Math.min(min, minDepth(root.right));
            }
            return min + 1;
        }


    }


}
