1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode invertTree(TreeNode root) {
18        if(root==null) return null;
19        if(root.left==null){
20            root.left=invertTree(root.right);
21            root.right=null;
22        }
23        else if(root.right==null){
24            root.right=invertTree(root.left);
25            root.left= null;
26        }
27            else if(root.left!=null && root.right!=null){
28            TreeNode temp;
29            temp=invertTree(root.left);
30            root.left=invertTree(root.right);
31            root.right=temp;
32            }
33
34        return root;
35    }
36}