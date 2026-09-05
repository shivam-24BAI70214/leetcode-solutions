class Solution {
    public int firstStableIndex(int[] nums, int k) {
      int n=nums.length;
        int[] mini=new int[n];
        int[] maxi=new int[n];
        maxi[0]=nums[0];
        for(int i=1;i<n;i++){
            maxi[i]=Math.max(nums[i],maxi[i-1]);
        }
        mini[n-1]=nums[n-1];
        for(int j=n-2;j>=0;j--){
            mini[j]=Math.min(nums[j],mini[j+1]);
        }
        for(int i=0;i<n;i++){
            if(maxi[i]-mini[i]<=k){
                return i;
            }
        }
        return -1;  
    }
}