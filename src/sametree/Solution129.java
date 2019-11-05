package sametree;

/**
 * @Author: october
 * @Date: 2019/11/6 00:10
 * @Description: 129. 求根到叶子节点数字之和
 */
public class Solution129 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 退出节点时候记得减去之前加上的值
     */
    class Solution {

        int sum = 0, allSum = 0;
        public int sumNumbers(TreeNode root) {
            getSum(root);
            return allSum;
        }

        private void getSum(TreeNode root){
            if (root == null) return;
            sum = sum*10 + root.val;
            if (root.left == null && root.right == null) allSum += sum;
            if(root.left != null) getSum(root.left);
            if(root.right != null) getSum(root.right);
            sum = (sum-root.val) / 10;
        }

    }

}
