

class Solution {
    public boolean isAnagram(String s, String t) {

        int[] a = new int[27];
        int[] b = new int[27];
       
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++){
            b[t.charAt(i)-97]++;
        }
        if(Arrays.equals(a,b)){
            return true;
        }
        
        return false;
    }
}
