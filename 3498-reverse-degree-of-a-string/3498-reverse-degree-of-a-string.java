class Solution {
    public int reverseDegree(String s) {
        int degree=0;
        int ascii2="a".charAt(0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=ch;
            int revidx=26-(ascii-ascii2);
            degree+=revidx*(i+1);
        }
        return degree;
    }
}