package sametree;

import linkedlist.Solution142;

/**
 * @Author: october
 * @Date: 2019/11/5 17:42
 * @Description:
 */
public class Solution235 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * BST的特点
     * 1. 节点 NN 左子树上的所有节点的值都小于等于节点 NN 的值
     * 2. 节点 NN 右子树上的所有节点的值都大于等于节点 NN 的值
     * 3. 左子树和右子树也都是 BST
     *
     * 所以最近公共祖先满足以下要求
     * 当两个节点都小于root时候在左边
     * 当两个节点都大于root的时候在右边
     * 一个大于一个小于则代表这个节点就是最近公共祖先
     */
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (p.val < root.val && q.val < root.val){
                return lowestCommonAncestor(root.left, p, q);
            }
            else if(p.val > root.val && q.val > root.val){
                return lowestCommonAncestor(root.right, p, q);
            }
            else{
                return root;
            }
        }
    }
}
