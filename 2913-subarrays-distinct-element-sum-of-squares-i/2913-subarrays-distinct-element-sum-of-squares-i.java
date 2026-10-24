class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            int[] arr=new int[101];
            int distinct=0;
            for(int j=i;j<n;j++){
                int num=nums.get(j);
                if(arr[num]==0){
                    distinct++;
                }
                arr[num]++;
                sum+=distinct*distinct;
            }
        }
        return sum;
    }
}