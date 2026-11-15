class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int[] prefixSum=new int[n+1];
        for(int i=0;i<n;i++){
            prefixSum[i+1]=prefixSum[i]+nums.get(i);
        }
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=l;i<=n;i++){
            int add=prefixSum[i-l];
            map.put(add,map.getOrDefault(add,0)+1);
            if(i-r-1>=0){
                int remove=prefixSum[i-r-1];
                if(map.get(remove) == 1){
                    map.remove(remove);
                } 
                else{
                    map.put(remove,map.get(remove)-1);
                }
            }
            Integer prev=map.lowerKey(prefixSum[i]);
            if(prev!=null){
                ans=Math.min(ans,prefixSum[i]-prev);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}