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
17    // List<Deque<TreeNode>> bfs1(TreeNode root){
18    //     if(root.left!=null ) bfs.add(root.left);
19    //     if(root.right!=null) bfs.add(root.right);
20    //     if(root.left!=null ) T
21    // }
22    public List<List<Integer>> levelOrder(TreeNode root) {
23            List<List<Integer>> l = new ArrayList<>();
24            Deque<TreeNode> bfs = new ArrayDeque<>();
25            if(root == null) return new ArrayList<>();
26            bfs.add(root);
27            while(bfs.size()>0){
28                List<Integer> a= new ArrayList<>();
29                int n= bfs.size();
30                for(int i=0;i<n;i++){
31                    TreeNode n1 = bfs.poll();
32                    a.add(n1.val);
33                    if(n1.left!=null){
34                        bfs.add(n1.left);
35                    }
36                    if(n1.right!=null){
37                        bfs.add(n1.right);
38                    }
39                }
40                l.add(a);
41            }
42            return l;
43    }
44}