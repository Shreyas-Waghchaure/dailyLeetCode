class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int i=0;
        String str="";
        
        int n =Math.min(word1.length(),word2.length());
        
        for(i=0;i<n;i++){
            str += word1.charAt(i);
            str += word2.charAt(i);
        }
        while(word1.length()>i){
            str+=word1.charAt(i);
            i++;
        }
        while(word2.length()>i){
            str+=word2.charAt(i);
            i++;
        }
        
        return str;
        
    }
}