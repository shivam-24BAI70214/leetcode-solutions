class Solution {
    public int countCommas(int n) {
        int comma=0;
        int basecase=1000;
        while(n>=basecase){
            comma+=(n-basecase+1);
            basecase=basecase*1000;
        }
        return comma; 
    }
}