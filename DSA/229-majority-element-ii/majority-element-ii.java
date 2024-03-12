class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> mejorityElem = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int threshold = nums.length/3;
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int elem = entry.getKey();
            int count = entry.getValue();
            
            if(count >threshold){
                mejorityElem.add(elem);
            }
        }
        
        return mejorityElem;
    }
}