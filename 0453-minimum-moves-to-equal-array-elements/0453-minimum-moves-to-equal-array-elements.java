class Solution {
    public int minMoves(int[] nums) {
       int minMov=0;
       int min=nums[0];
       for(int num:nums){
        min=Math.min(min,num);
       }
       for(int num:nums){
        minMov+=num-min;
       }
       return minMov; 
    }
}