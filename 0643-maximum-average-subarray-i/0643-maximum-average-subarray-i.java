class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double currAvg=0;
        for(int i=0;i<k;i++){
            currAvg+=nums[i];
        }
        double maxAvg=currAvg;
        for(int i=k;i<n;i++){
            currAvg-=nums[i-k];
            currAvg+=nums[i];
            maxAvg=Math.max(currAvg,maxAvg);
        }
        return maxAvg/k;
    }
}