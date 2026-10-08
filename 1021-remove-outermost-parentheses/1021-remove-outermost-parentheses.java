class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int openBrac=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(openBrac>0){
                    result.append(s.charAt(i));
                }
                openBrac++;
            }
            else{
                openBrac--;
                if(openBrac>0){
                    result.append(s.charAt(i));
                }
            }
        }
        return result.toString();
    }
}