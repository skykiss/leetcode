package sametree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: october
 * @Date: 2019/11/5 19:16
 * @Description:
 */
public class Solution94 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 前序遍历： 根 —> 左 -> 右
     * 中序遍历: 左 -> 根 -> 右
     * 后续遍历：左 -> 右 -> 根
     *
     */
    class Solution {
        ArrayList<Integer> list = new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null) return list;
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
            return list;
        }
    }

}
