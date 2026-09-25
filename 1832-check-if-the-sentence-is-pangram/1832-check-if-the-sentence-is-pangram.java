class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] check=new boolean[26];
        if(sentence.length()<26){
            return false;
        }
        for(int i=0;i<sentence.length();i++){
            int index=sentence.charAt(i)-'a';
            check[index]=true;
        }
        for(int i=0;i<check.length;i++){
            if(check[i] != true){
                return false;
            }
        }
        return true;
    }
}