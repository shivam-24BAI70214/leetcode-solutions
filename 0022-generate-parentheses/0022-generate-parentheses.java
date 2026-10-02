class Solution {
    public static void Para(StringBuilder currParaList,int openBrac,int closeBrac,List<String> result,int n){
        if(openBrac==n && closeBrac==n){
            result.add(currParaList.toString());
            return;
        }
        if(openBrac<n){
            currParaList.append('(');
            Para(currParaList,openBrac+1,closeBrac,result,n);
            currParaList.deleteCharAt(currParaList.length()-1);
        }
        if(closeBrac<openBrac){
            currParaList.append(')');
            Para(currParaList,openBrac,closeBrac+1,result,n);
            currParaList.deleteCharAt(currParaList.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder currParaList=new StringBuilder();
        List<String> result=new ArrayList<>();
        int openBrac=0;
        int closeBrac=0;
        Para(currParaList,openBrac,closeBrac,result,n);
        return result;
    }
}