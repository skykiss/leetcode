package sametree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: october
 * @Date: 2019/11/5 21:04
 * @Description: 102二叉树的层次遍历
 */
public class Solution102 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 使用深度遍历 + 层级
     * 遍历到某个地方的时候直接添加到对应位置
     */

    class Solution {
        List<List<Integer>> list = new ArrayList<>();
        public List<List<Integer>> levelOrder(TreeNode root) {
            pre(root, 0);
            return list;
        }

        private void pre(TreeNode root, int depth){
            if (root == null) return;
            if (depth >= list.size() || list.get(depth) == null){
                list.add(new ArrayList<>());        //  我觉得此地方还是有问题  可能出现溢出
            }
            list.get(depth).add(root.val);
            pre(root.left, depth+ 1 );
            pre(root.right, depth + 1);
        }
    }
}
