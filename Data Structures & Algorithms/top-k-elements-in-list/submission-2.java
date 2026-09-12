class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                continue;
            }
            int n = nums[i];
            int freq = 0;
            for(int j=0;j<nums.length;j++){
                if(n == nums[j]){
                    freq++;
                }
            }
            map.put(n, freq);
        }

        List<Integer> distinct = new ArrayList<>(map.keySet());
        int[] result = new int[k];

        for(int r=0;r<k;r++){

            int bestNumber = distinct.get(0);
            int bestFreq = map.get(bestNumber);

            for(int i=1;i<distinct.size();i++){
                int currentNumber = distinct.get(i);
                int currentFreq = map.get(currentNumber);

                if(currentFreq > bestFreq){
                    bestNumber = currentNumber;
                    bestFreq = currentFreq;
                }
            }

            result[r] = bestNumber;
            map.put(bestNumber, -1);
        }

        return result;
    }
}