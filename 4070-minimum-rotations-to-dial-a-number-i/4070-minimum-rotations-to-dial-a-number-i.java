class Solution {
    public int minRotations(String s) {
        int minRotation=0;
        int fst=s.charAt(0)-'0';
        minRotation+=Math.min(fst,10-fst);
        for(int i=0;i<s.length()-1;i++){
            int a=s.charAt(i)-'0';
            int b=s.charAt(i+1)-'0';
            minRotation+=Math.min(Math.abs(a-b),10-Math.abs(a-b));
        }
        return minRotation;
    }
}