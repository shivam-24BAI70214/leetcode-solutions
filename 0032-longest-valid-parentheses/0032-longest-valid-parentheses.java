class Solution {
    public int longestValidParentheses(String s) {
        if(s==null || s.isBlank()){
            return 0;
        }
        int paraCount=0;
        int openBrac=0;
        int closeBrac=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                openBrac++;
            }
            else{
                closeBrac++;
            }
            if(openBrac==closeBrac){
                paraCount=Math.max(paraCount,2*closeBrac);
            }
            else if(closeBrac>openBrac){
                closeBrac=0;
                openBrac=0;
            }
        }
        closeBrac=0;
        openBrac=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                openBrac++;
            }
            else{
                closeBrac++;
            }
            if(openBrac==closeBrac){
                paraCount=Math.max(paraCount,2*openBrac);
            }
            else if(openBrac>closeBrac){
                closeBrac=0;
                openBrac=0;
            }
        }
        return paraCount;
    }
}