class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        int l = 0;
        int r = arr.length-1;
        
        while(arr[l]+arr[r] != target){
            
            if(arr[l]+arr[r]<target) 
                l++;
            else
                r--;         
            
        }
        
        return new int[]{l+1,r+1};
        
    }
}