class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a = new int[nums.length];
        int[] b = new int[nums.length];

        int pref = 1;
        for(int i=0;i<nums.length;i++){
            a[i] = pref;
            pref = pref*nums[i];
        }

        int suf = 1;
        for(int i=nums.length-1;i>=0;i--){
            a[i] = a[i]*suf;
            suf = suf*nums[i];
        }
        return a;
    }
}