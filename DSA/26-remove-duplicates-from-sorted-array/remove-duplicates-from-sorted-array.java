class Solution {
    public int removeDuplicates(int[] nums) {
    //     int count = 0;
    //     int[] arr;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j = i;j<nums.length;j++){
    //             if(nums[i]!=nums[j]){
    //                 nums[i] = arr[i];
    //         }
    //         nums.set(i,arr[i]);
    //         }
    //     }
    //         return arr.length;
    // }

        int in=1;
          if(nums.length<2)
                return nums.length;
        for(int i=1;i<nums.length;i++){
          
            if(nums[i] != nums[in-1]){
                nums[in++] = nums[i];
            }
        }
       return in; 
    }
}