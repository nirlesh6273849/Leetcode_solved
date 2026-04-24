1class Solution {
2    public ListNode reverseList(ListNode head) {
3        ListNode node = null;
4
5        while (head != null) {
6            ListNode temp = head.next;
7            head.next = node;
8            node = head;
9            head = temp;
10        }
11
12        return node;        
13    }
14}