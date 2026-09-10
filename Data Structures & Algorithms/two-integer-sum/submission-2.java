class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> a = new HashMap<>();
        
        for(int i =0;i<nums.length;i++){
            int n = target-nums[i];

            if(a.containsKey(n))
                return new int[] {a.get(n),i};

            a.put(nums[i],i);
        }
        return new int[] {};
    }
}
