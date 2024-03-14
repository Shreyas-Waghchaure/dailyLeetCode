class Solution {
    public String reverseWords(String s) {
       
    
        String s1="";
        String[] str =s.trim().split("\\s+");
        
        for(int i=str.length-1;i>=0;i--){
            s1 += str[i] + " ";
        }
     return s1.trim();  
    }
}