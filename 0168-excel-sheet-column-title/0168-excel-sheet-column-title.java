class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int mod=columnNumber%26;
            result.append((char)('A'+mod));
            columnNumber/=26;
        }
        return result.reverse().toString();
    }
}