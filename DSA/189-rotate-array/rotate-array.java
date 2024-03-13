class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        swapper(0,nums.length-1,nums);
        swapper(0,k-1,nums);
        swapper(k,nums.length-1,nums);
    }
    
    public void swapper(int left,int right,int[] arr){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
   
}