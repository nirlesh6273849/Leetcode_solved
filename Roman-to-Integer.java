1class Solution {
2    public int romanToInt(String s) {
3        HashMap<Character,Integer> h= new HashMap<>();
4        h.put('I',1);
5        h.put('V',5);
6        h.put('X',10);
7        h.put('C',100);
8        h.put('M',1000);
9        h.put('L',50);
10        h.put('D',500);
11        int sum=0;
12        int i=0;
13        int len=s.length();
14        int prevval=Integer.MAX_VALUE;
15        while(i<len){
16            int curval= h.get(s.charAt(i));
17            if(prevval<curval){
18                sum-=prevval;
19                sum+=curval-prevval;
20            }
21            else{
22                sum+=curval;
23            }
24            prevval=curval;
25            i+=1;
26        }
27        return sum;
28    }
29}