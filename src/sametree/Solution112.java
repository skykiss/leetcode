package sametree;

/**
 * @Author: october
 * @Date: 2019/11/5 17:04
 * @Description:
 */
public class Solution112 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 递归求解 每到一个节点 sum减去节点值 当到达叶子节点等于0的时候代表可以
     */
    class Solution {

        public boolean hasPathSum(TreeNode root, int sum) {
            if (root == null) return false;
            sum -= root.val;   // 减去该节点的值
            if (root.left == null && root.right == null){   //判断是否是叶子节点
                return sum == 0;
            }
            else{
                return hasPathSum(root.left, sum) && hasPathSum(root.right, sum);  // 递归求解
            }
        }
    }

}
