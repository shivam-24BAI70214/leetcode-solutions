class Solution {
    public static void rev(char[] s,int left,int right){
        if(left>=right){
            return;
        }
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        rev(s,left+1,right-1);
    }
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        rev(s,left,right);
    }
}