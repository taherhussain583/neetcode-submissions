class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        int longest = 0;

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int l = 1;
                while(set.contains(nums[i]+l)){
                    l++;
                }
                if(l>longest){
                    longest=l;
                }
            }
        }
        return longest;
    }
}
