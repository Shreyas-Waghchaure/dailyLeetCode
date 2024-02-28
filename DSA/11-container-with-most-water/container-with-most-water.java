class Solution {
    public int maxArea(int[] arr) {
        int i=0, j = arr.length-1;
        int maxArea=0;
        while(i<j){
            int area = (j-i) * Math.min(arr[i],arr[j]);
            
            if(area>maxArea){
                maxArea = area;
            }
            
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
            
        }
        return maxArea;
    }
}