class Solution {
    public int minMoves(int[] nums) {
        int minMov=0;
        int max=nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        for(int num:nums){
            minMov+=max-num;
        }
        return minMov;
    }
}