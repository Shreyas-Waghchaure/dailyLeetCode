class Solution {

    public String common(String s1, String s2){
        int n = Math.min(s1.length(),s2.length());
        String res="";
        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                res +=s1.charAt(i);
            }
            else{
                break;
            }
        }
        return res;
    }
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];

        for(int i=0;i<strs.length;i++){
            res = common(res,strs[i]);
        }
        return res;
    }
}