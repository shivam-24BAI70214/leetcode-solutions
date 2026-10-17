class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        int h=haystack.length();
        int n=needle.length();
        for(int i=0;i<=h-n;i++){
            boolean matching=true;
            for(int j=0;j<n;j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    matching=false;
                    break;
                }
            }
            if(matching){
                return i;
            }
        }
        return -1;
    }
}