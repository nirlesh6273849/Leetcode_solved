1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode rotateRight(ListNode head, int k) {
13        if(k==0||head==null) return head;
14        int n=0;
15        ListNode h=head;
16        while(h!=null){
17            n++; 
18            h=h.next;
19        }
20        if(n==1) return head;
21        int r=k%n;
22        if(r==0) return head;
23        h=head;
24        for(int i=0;i<n-r;i++){
25            h=h.next;
26        }
27        ListNode ne=head;
28        ListNode pudhu= h;
29        while(pudhu.next!=null) pudhu=pudhu.next;
30        for(int i=0;i<n-r;i++){
31            pudhu.next=ne;
32            ne=ne.next;
33            pudhu=pudhu.next;
34        }
35        pudhu.next=null;
36        return h;
37
38    }
39}