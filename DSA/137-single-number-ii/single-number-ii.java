class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> sol = new HashMap<>();
    	int cnt =1;
    	for(int i=0;i<nums.length;i++) {
    		if(sol.containsKey(nums[i])) {
    			sol.put(nums[i], cnt+1);
    		}else {
    			sol.put(nums[i],cnt);
    		}
    	}
    	for(int num : sol.keySet()) {
    		if(sol.get(num) == 1) {
    			return num;
    		}
    	}
        return -999;
        }
    }