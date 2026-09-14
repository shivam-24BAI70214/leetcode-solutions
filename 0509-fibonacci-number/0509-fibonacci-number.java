class Solution {
    public static int cal(int n,int[] memo){
        if(n<=1){
            return n;
        }
        if(memo[n]!=0){
            return memo[n];
        }
        memo[n]=cal(n-1,memo)+cal(n-2,memo);
        return memo[n];
    }
    public int fib(int n) {
       int[] memo=new int[n+1];
       return cal(n,memo);
    }
}