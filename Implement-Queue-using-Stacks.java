1class MyQueue {
2    Deque<Integer> q;
3    public MyQueue() {
4        this.q=new ArrayDeque<>();
5    }
6    
7    public void push(int x) {
8        q.addLast(x);
9    }
10    
11    public int pop() {
12        return q.poll();
13    }
14    
15    public int peek() {
16        return q.peek();
17    }
18    
19    public boolean empty() {
20        return (q.size()==0) ;
21    }
22}
23
24/**
25 * Your MyQueue object will be instantiated and called as such:
26 * MyQueue obj = new MyQueue();
27 * obj.push(x);
28 * int param_2 = obj.pop();
29 * int param_3 = obj.peek();
30 * boolean param_4 = obj.empty();
31 */