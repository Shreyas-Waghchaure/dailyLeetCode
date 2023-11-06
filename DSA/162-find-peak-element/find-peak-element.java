class Solution {
    public int findPeakElement(int[] nums) {
        
        int i=0,j=nums.length-1;
        int max=0;
        while(i<j){
            int mid = (i+j)/2;
            if(nums[mid]<nums[mid+1]){
                max=mid;
                i = mid+1;
            }else{
                j=mid;
            }
           
        }
              
       return i; 
    }
}