package sametree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: october
 * @Date: 2019/11/5 21:36
 * @Description:
 */
public class Solution103 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 和102题目类似 使用DFS
     * 根据层级做判断 是加在头部 还是尾部
     */
    class Solution {

        List<List<Integer>> list = new ArrayList<>();

        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            pre(root, 0);
            return list;
        }

        private void pre(TreeNode root, int depth){
            if (root == null) return;
            if (depth >= list.size() || list.get(depth) == null){
                list.add(new LinkedList<>());        //  我觉得此地方还是有问题  可能出现溢出
            }
            LinkedList<Integer> linkedList = (LinkedList<Integer>) list.get(depth);
            if(depth % 2 == 0) linkedList.addLast(root.val);
            else linkedList.addFirst(root.val);
            pre(root.left, depth+ 1 );
            pre(root.right, depth + 1);
        }
    }

}
