import java.util.Arrays;
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int minMov=0;
        int median=nums[nums.length/2];
        for(int num:nums){
            minMov+=Math.abs(num-median);
        }
        return minMov;
    }
}