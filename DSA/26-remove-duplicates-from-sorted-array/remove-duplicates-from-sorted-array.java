class Solution {
    public int removeDuplicates(int[] arr) {
        int left =1;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[left] = arr[i];
                left++;
            }
        }
        return left;
    }
}