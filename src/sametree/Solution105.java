package sametree;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: october
 * @Date: 2019/11/5 22:19
 * @Description:
 */
public class Solution105 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            Map<Integer, Integer> inMap = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                inMap.put(inorder[i], i);
            }
            return buildTree(preorder, 0, preorder.length-1, 0, inMap);
        }

        private TreeNode buildTree(int[] pre, int preStart, int preEnd, int inStart, Map<Integer, Integer> inMap){
            // 递归停止条件
            if (preStart > preEnd) return null;
            TreeNode root = new TreeNode(pre[preStart]);
            // 得到根节点的位置
            int rootIndex = inMap.get(pre[preStart]);
            // 左节点的长度
            int leftLen = rootIndex - inStart;
            // postStart--> 开始位置（+1 是因为第一个是根节点）  postEnd 结束位置=》postStart+1+endLen-1==postStart+endLen
            // inStart为上一个传进来的
            root.left = buildTree(pre, preStart+1, preStart+leftLen, inStart, inMap);
            // postStart--> 开始位置（左子树往右+1）  postEnd 结束位置==postEnd inStart为根节点在中序数组中的下一个位置
            root.right = buildTree(pre, preStart+leftLen+1, preEnd, rootIndex+1, inMap);
            return root;
        }
        
    }

}
