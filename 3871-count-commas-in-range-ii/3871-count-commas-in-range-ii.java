class Solution {
    public long countCommas(long n) {
        long comma=0;
        long base=1000;
        while(n>=base){
            comma=comma+(n-base+1);
            base=base*1000;
        }
        return comma;  
    }
}