class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] arr = new int[nums.length];
        
        int pre = 1;
        for(int i=0;i<nums.length;i++){
            arr[i] = pre;
            pre*=nums[i];
        }
        
        int post=1;
        for(int i=arr.length-1;i>=0;i--){
            arr[i] = post*arr[i];
            post *= nums[i];
        }
        
        return arr;
    }
}