class Solution {
    public int longestSubarray(int[] nums) {
        
        int curr=0;
        int prev=0;
        int ans=0;
        boolean flag=false;
        
        for(int i:nums){
            if(i==1){
                curr++;
            }else{
              
                ans = Math.max(ans,curr+prev);
                prev=curr;
                curr=0;
                flag=true;
                
            }
        }
        
        ans = Math.max(ans,curr+prev);
        
        if(flag){
            return ans;
        }else{
            return ans-1;
        }
        
    }
}