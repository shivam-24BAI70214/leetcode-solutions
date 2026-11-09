class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int farElement=0;
        Arrays.sort(arr2);
        for(int num:arr1){
            int left=0;
            int right=arr2.length;
            while(left<right){
                int mid=left+(right-left)/2;
                if(arr2[mid]<num-d){
                    left=mid+1;
                }
                else{
                    right=mid;
                }
            }
            if(left==arr2.length || arr2[left]>num+d){
                farElement++;
            }
        }
        return farElement;
    }
}