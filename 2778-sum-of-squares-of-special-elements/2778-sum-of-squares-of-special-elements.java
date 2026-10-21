class Solution {
    public int sumOfSquares(int[] nums) {
       int n=nums.length;
       int sos=0;
       for(int i=1;i*i<=n;i++){
        if(n%i==0){
            sos+=nums[i-1]*nums[i-1];
            int pairedDivisor=n/i;
            if(pairedDivisor!=i){
                sos+=nums[pairedDivisor-1]*nums[pairedDivisor-1];
            }
        }
       } 
       return sos;
    }
}