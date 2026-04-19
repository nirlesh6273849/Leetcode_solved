1class Solution {
2    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
3        if (root == null) return null;
4
5        if (p.val < root.val && q.val < root.val) {
6            return lowestCommonAncestor(root.left, p, q);
7        }
8        if (p.val > root.val && q.val > root.val) {
9            return lowestCommonAncestor(root.right, p, q);
10        }
11
12        return root;
13    }
14}