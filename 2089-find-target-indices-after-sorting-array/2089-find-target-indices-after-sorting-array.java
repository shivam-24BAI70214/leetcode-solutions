class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0;
        int frequency=0;
        for(int num:nums){
            if(num<target){
                count++;
            }
            else if(num==target){
                frequency++;
            }
        }
        List<Integer> idx=new ArrayList<>();
        for(int i=0;i<frequency;i++){
            idx.add(count+i);
        }
        return idx;
    }
}