package com.talveen.leetcode.problems;

/**
 * Date: 2/5/2024
 * Time: 11:07 AM
 * URL:https://leetcode.com/problems/diameter-of-binary-tree/description/
 */
public class Prob543 {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
         public TreeNode(int val, TreeNode left, TreeNode right){
             this.val = val;
             this.left = left;
             this.right = right;
         }
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(15);
        TreeNode l2 = new TreeNode(7);
        TreeNode p1 = new TreeNode(20, l1,l2);
        TreeNode l3 = new TreeNode(9);
        TreeNode root = new TreeNode(-10, p1,l3);
        Prob543 prob543 =new Prob543();
        System.out.println(prob543.findHeight(root));
    }

    private int findHeight(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        int currentDiameter = leftHeight+rightHeight+1;
        int diameter = 0;
        diameter = Math.max(currentDiameter, diameter);
        return Math.max(leftHeight, rightHeight)+1;
    }
}
