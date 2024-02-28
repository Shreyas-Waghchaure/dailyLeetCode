class Solution {
    public int[] twoSum(int[] arr, int target) {
    
        Map<Integer,Integer> sol = new HashMap<>();
        
        for(int i = 0;i<arr.length;i++){
            
            int b = target - arr[i];
            
            if(sol.containsKey(b)){
                return new int[] {sol.get(b),i};
            }
            sol.put(arr[i],i);
        }
        return null;
    }
}
