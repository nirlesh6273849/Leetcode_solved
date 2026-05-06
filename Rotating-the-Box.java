1class Solution {
2    public char[][] rotateTheBox(char[][] boxGrid) {
3        int r=boxGrid.length,c=boxGrid[0].length;
4        char[][] b= new char[c][r];
5        for(int i=0;i<c;i++)
6            Arrays.fill(b[i],'.');
7        for(int i=0;i<r;i++){
8            int bottom=c-1;
9            for(int j=c-1;j>-1;j--){
10                if(boxGrid[i][j]=='#'){
11                    b[bottom--][r-1-i]='#';
12                }
13                else if(boxGrid[i][j]=='*'){
14                    b[j][r-1-i]='*';
15                    bottom=j-1;
16
17                }
18            }
19        }
20        return b;
21    }
22}