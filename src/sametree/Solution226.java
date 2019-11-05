package sametree;

/**
 * @Author: october
 * @Date: 2019/11/5 17:14
 * @Description: 226. 翻转二叉树
 */
public class Solution226 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 很简单的二叉树反转
     * 把两个子节点转换 然后递归下去
     */
//    class Solution {
//        public TreeNode invertTree(TreeNode root) {
//            if (root == null) return null;
//            TreeNode temp = root.left;
//            root.left = root.right;
//            root.right = temp;
//            invertTree(root.left);
//            invertTree(root.right);
//            return root;
//        }
//    }

    class Solution{
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            //先转换子节点的更优美
            TreeNode right = invertTree(root.right);
            TreeNode left = invertTree(root.left);
            root.left = right;
            root.right = left;
            return root;
        }
    }

}
