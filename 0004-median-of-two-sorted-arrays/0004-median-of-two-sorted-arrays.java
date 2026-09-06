class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        int[] merged=new int[m+n];
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                merged[k]=nums1[i];
                i--;
                k--;
            }
            else{
                merged[k]=nums2[j];
                j--;
                k--;
            }
        }
        while(i>=0){
            merged[k]=nums1[i];
            i--;
            k--;
        }
        while(j>=0){
            merged[k]=nums2[j];
            j--;
            k--;
        }
        if((m+n)%2 != 0){
            int idx=(m+n)/2;
            return merged[idx];
        }
        int d=(m+n)/2;
        double median=(double)(merged[d-1]+merged[d])/2;
        return median;  
    }
}