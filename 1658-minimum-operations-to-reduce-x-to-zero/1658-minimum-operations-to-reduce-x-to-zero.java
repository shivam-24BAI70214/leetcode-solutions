class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum=0;
        int reqSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        reqSum=totalSum-x;
        if(reqSum==0){
            return nums.length;
        }
        if(reqSum<0){
            return -1;
        }
        int left=0;
        int currSum=0;
        int maxLen=-1;
        for(int right=0;right<nums.length;right++){
            currSum+=nums[right];
            while(currSum>reqSum && left<=right){
                currSum-=nums[left];
                left++;
            }
            if(currSum==reqSum){
                maxLen=Math.max(maxLen,right-left+1);
            }
        }
        return maxLen==-1?-1:nums.length-maxLen;
    }
}