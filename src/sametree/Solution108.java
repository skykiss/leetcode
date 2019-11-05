package sametree;

/**
 * @Author: october
 * @Date: 2019/11/5 15:32
 * @Description:
 */
public class Solution108 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 使用二分来创建
     */
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return toBST(nums, 0, nums.length);
        }

        private TreeNode toBST(int[] nums, int l, int r){
            if (l == r) return null;
            int mid = (l+r) >>> 1;  //向右移动1 相当于除2
            TreeNode root = new TreeNode(nums[mid]);
            root.left = toBST(nums, l, mid);
            root.right = toBST(nums, mid+1, r);
            return root;
        }

    }

}
