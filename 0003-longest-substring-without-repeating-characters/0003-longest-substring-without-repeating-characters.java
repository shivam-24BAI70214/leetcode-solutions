class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        for(int i=0;i<s.length();i++){
         StringBuilder sb=new StringBuilder();
         for(int j=i;j<s.length();j++){
            if(sb.toString().contains(s.charAt(j)+"")){
                break;
            }
            sb.append(s.charAt(j));
            count=Math.max(count,sb.length());
            }
        }
       return count;
    }
}