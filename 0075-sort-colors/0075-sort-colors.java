class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zp=0;
        int tp=n-1;
        int i=0;
        while(i<=tp){
            if(nums[i]==2){
                int temp=nums[tp];
                nums[tp]=nums[i];
                nums[i]=temp;
                tp--;
            }
            else if(nums[i]==0){
                int temp=nums[zp];
                nums[zp]=nums[i];
                nums[i]=temp;
                i++;
                zp++;
            }
            else{
                i++;
            }
        }
    }
}