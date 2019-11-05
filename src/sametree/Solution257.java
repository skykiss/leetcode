package sametree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: october
 * @Date: 2019/11/5 17:54
 * @Description:
 */
public class Solution257 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 依次遍历 如果到达叶子节点就加入列表
     */
    class Solution {
        List<String> list = new ArrayList<>();
        public List<String> binaryTreePaths(TreeNode root) {
            getPath(root, "");
            return list;
        }

        private void getPath(TreeNode root, String path){
            if (root == null) return;
            if (path.equals("")) path += root.val;
            else path = path +  "->" + root.val;
            if (root.left == null && root.right == null){
                list.add(path);
                return;
            }
            if (root.left != null)  getPath(root.left, path);
            if (root.right != null) getPath(root.right, path);
        }

    }

}
