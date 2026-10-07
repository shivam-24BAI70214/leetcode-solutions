class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxStr=0;
        int maxLeft=0;
        int maxRight=0;
        for(int i=0;i<n;i++){
            int left=i;
            int right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                int length=right-left+1;
                if(length>maxStr){
                    maxLeft=left;
                    maxRight=right;
                    maxStr=length;
                }
                left--;
                right++;
            }
            left=i;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                int length=right-left+1;
                if(length>maxStr){
                    maxLeft=left;
                    maxRight=right;
                    maxStr=length;
                }
                left--;
                right++;
            }
        }
        return s.substring(maxLeft,maxRight+1);
    }
}