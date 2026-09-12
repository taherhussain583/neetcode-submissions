class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap <String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){

            int[] countCharAna = new int[26];

            for(int j = 0;j<strs[i].length();j++){
                countCharAna[strs[i].charAt(j) - 97]++;
            }
            StringBuilder sb = new StringBuilder();

            for(int j=0;j<26;j++){
                sb.append('#').append(countCharAna[j]);
            }

            String key = sb.toString();

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(strs[i]);
        }
        
        return new ArrayList(map.values());
    }
}
