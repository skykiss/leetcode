package sametree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: october
 * @Date: 2019/11/5 18:25
 * @Description:
 */
public class Solution113 {

    public static void main(String[] args) {
        Solution113 solution113 = new Solution113();
        Solution solution = solution113.new Solution();
        TreeNode node = solution113.new TreeNode(1);
        node.left = solution113.new TreeNode(2);
        node.right  = solution113.new TreeNode(3);
        solution.pathSum(node, 4);
        System.out.println("");
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 用数组保存遍历后值 当回到上个节点之前记得删除
     * 注意：：：： List是引用类型 添加进数组修改还是会改变 需要拷贝一份
     */
    class Solution {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            if (root == null) return list;
            sum -= root.val;
            inner.add(root.val);  // 入列表
            if (root.left == null && root.right == null){
                if (sum == 0){
                    list.add(new ArrayList<>(inner));  // 记得拷贝一份
                }

            }
            if (root.left != null)  pathSum(root.left, sum);
            if (root.right != null)  pathSum(root.right, sum);
            inner.remove(inner.size()-1);  //从列表中删除
            return list;
        }
    }

}
