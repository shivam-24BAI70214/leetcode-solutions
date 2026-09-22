class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        for(int i=0;i<columnTitle.length();i++){
            int value=columnTitle.charAt(i)-'A'+1;
            result=26*result+value;
        }
        return result;
    }
}