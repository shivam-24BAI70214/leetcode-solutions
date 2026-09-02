class Solution {
    public boolean uniformArray(int[] nums1) {
       int n=nums1.length;
       int even_count=0;
       int odd_count=0;
       for(int i=0;i<nums1.length;i++){
        if(nums1[i]%2==0){
            even_count++;
        }
        else{
            odd_count++;
        }
       }
       if(even_count==n || odd_count==n){
        return true;
       }
       if(odd_count>=2){
        return true;
       }
       if(even_count>0 && odd_count>0){
        return true;
       }
       return false;
    }
}