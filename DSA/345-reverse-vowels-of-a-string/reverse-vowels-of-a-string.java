class Solution {
    public boolean isVowel(char s){
        s= Character.toLowerCase(s);
        return s == 'a'|| s == 'e'||s == 'i'|| s =='o'||s == 'u';
    }
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        
       int i=0;
        int j= str.length-1;
        
        while(i<j){
            
            if(isVowel(str[i])&&isVowel(str[j])){
                
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }else if(!isVowel(str[i])){
                i++;
            }else{
                j--;
            }
            
            
        }
        
        return String.valueOf(str);
    }
}