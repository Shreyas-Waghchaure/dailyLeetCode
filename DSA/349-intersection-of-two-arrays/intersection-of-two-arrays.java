class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
        Set<Integer> set = new HashSet<>();
        
        for(int i:nums1){
            set.add(i);
        }
        
        List<Integer> arr = new ArrayList<Integer>();
    
        for(int j:nums2){
            if(set.contains(j) && !arr.contains(j)){
                arr.add(j);
            }
        }
        
        return arr.stream().mapToInt(e->e).toArray();
    }
}