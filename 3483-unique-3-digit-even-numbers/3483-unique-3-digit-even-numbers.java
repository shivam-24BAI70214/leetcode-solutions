class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq=new int[10];
        for(int digit:digits){
            freq[digit]++;
        }
        int count=0;
        for(int f=1;f<=9;f++){
            if(freq[f]==0){
                continue;
            }
            freq[f]--;
            for(int s=0;s<=9;s++){
                if(freq[s]==0){
                    continue;
                }
                freq[s]--;
                for(int t=0;t<=8;t=t+2){
                    if(freq[t]>0){
                        count++;
                    }
                }
                freq[s]++;
            }
            freq[f]++;
        }
        return count;
    }
}