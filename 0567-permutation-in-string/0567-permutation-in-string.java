class Solution {
    public boolean check(String s , String s2){
        int[] a = new int[26];
        int[] a1 = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            a[s.charAt(i) - 'a']++;
            a1[s2.charAt(i) - 'a']++;
        }     
        for(int i = 0 ; i < 26 ; i++){
            if(a[i] != a1[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        for(int i = 0 ; i <= s2.length() - s1.length() ; i++){
            String s = s2.substring(i , i + s1.length());
            if(check(s , s1)){
                return true;
            }
        }
        return false;
    }
}