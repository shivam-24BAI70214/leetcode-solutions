class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen=1;
        int currLen=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                currLen++;
                maxLen=Math.max(maxLen,currLen);
            }
            else if(nums[i]>=nums[i+1]){
                currLen=1;
            }
        }
        currLen=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                currLen++;
                maxLen=Math.max(maxLen,currLen);
            }
            else if(nums[i]<=nums[i+1]){
                currLen=1;
            }
        }
        return maxLen;
    }
}