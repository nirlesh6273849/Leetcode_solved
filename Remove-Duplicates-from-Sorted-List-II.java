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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode dummy = new ListNode(0, head);
14        ListNode prev = dummy;
15        ListNode cur = head; 
16        while (cur != null) {
17            while (cur.next != null && cur.val == cur.next.val) {
18                cur = cur.next;                    
19            }
20            if (prev.next == cur) {
21                prev = cur;  
22            } else {
23                prev.next = cur.next;
24            }
25            cur = cur.next;
26        }
27
28        return dummy.next;
29    }
30}