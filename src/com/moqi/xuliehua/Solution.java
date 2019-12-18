package com.moqi.xuliehua;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        //判断AB两个子树为不为空
        if (root1 == null && root2 == null) {
            return false;
        }
        //判断A根节点包含B A左子树包含B A又子树包含B
        return isSubtree(root1,root2)||isSubtree(root1.left,root2)||isSubtree(root1.right,root2);
    }

    public static boolean isSubtree(TreeNode root1, TreeNode root2) {
        //关键，顺序不能反
        if (root2 == null)
            return true;
        if (root1 == null) {
            return false;
        }
        //这里一定不要直接比较他们两个地址是否相同。
        if (root1.val == root2.val) {
            return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
        }
        return false;
    }
}