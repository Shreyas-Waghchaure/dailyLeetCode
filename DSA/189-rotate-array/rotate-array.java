class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        
        swapping(0,nums.length-1,nums);
        swapping(0,k-1,nums);
        swapping(k,nums.length-1,nums);
        
    }
    public static void swapping(int l,int r,int[] arr){
        while(l<r){
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
        l++;
        r--;
        
        }
    }
}