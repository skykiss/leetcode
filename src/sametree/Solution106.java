package sametree;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: october
 * @Date: 2019/11/5 22:39
 * @Description:
 */
public class Solution106 {

    public static void main(String[] args) {
        Solution106 solution106 = new Solution106();
        Solution solution = solution106.new Solution();
        int[] in = {9, 3, 15, 20, 7};
        int[] post = {9,15,7,20,3};
        TreeNode treeNode = solution.buildTree(in, post);
        System.out.println("");
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 和105差不多 递归构建子树
     *
     */
    class Solution {
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            // 构造一个hash表来提升查询位置的效率
            Map<Integer, Integer> inMap = new HashMap<>();
            for (int i = 0; i < postorder.length; i++) {
                inMap.put(inorder[i], i);
            }
            return buildTree(postorder, 0, postorder.length-1, 0, inMap);
        }

        private TreeNode buildTree(int[] postorder, int postStart, int postEnd, int inStart, Map<Integer, Integer> inMap){
            if (postStart > postEnd) return null;
            TreeNode root = new TreeNode(postorder[postEnd]);
            int rootIndex = inMap.get(postorder[postEnd]);
            int endLen = rootIndex - inStart; // 算出子树的长度 就可以求出右子树的长度
            // postStart--> 开始位置  postEnd 结束位置==postStart+endLen-1  inStart为上一个传进来的
            root.left = buildTree(postorder, postStart, postStart+endLen-1, inStart, inMap);
            // postStart--> 开始位置（左子树往右+1）  postEnd 结束位置==postStart-1（不包含最后的根节点）  inStart为根节点在中序数组中的下一个位置
            root.right = buildTree(postorder, postStart+endLen, postEnd-1, rootIndex+1, inMap);
            return root;
        }
    }

}
