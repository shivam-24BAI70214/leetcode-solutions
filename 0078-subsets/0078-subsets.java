class Solution {
    public static List<List<Integer>> subset(int[] nums,int index,List<Integer> curr,List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(curr));
            return result;
        }
        curr.add(nums[index]);
        subset(nums,index+1,curr,result);
        curr.remove(curr.size()-1);
        return subset(nums,index+1,curr,result);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int index=0;
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        return subset(nums,index,curr,result);
    }
}