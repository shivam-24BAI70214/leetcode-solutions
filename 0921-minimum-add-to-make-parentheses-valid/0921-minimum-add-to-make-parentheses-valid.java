class Solution {
    public int minAddToMakeValid(String s) {
        int minMoves=0;
        int bal=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                bal++;
            }
            else{
                if(bal>0){
                    bal--;
                }
                else{
                    minMoves++;
                }
            }
        }
        return bal+minMoves;
    }
}