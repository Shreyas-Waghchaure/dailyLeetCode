class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int i = m;     
       for(int num:nums2){
           nums1[i] = num;
           i++;
       }
        
        Arrays.sort(nums1);
        
    }
}