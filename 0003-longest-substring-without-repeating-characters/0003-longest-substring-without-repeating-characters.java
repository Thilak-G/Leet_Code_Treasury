class Solution {
    public boolean check(String s){
        boolean[] ch = new boolean[128];
        for(int i = 0 ; i < s.length() ; i++){
            if(ch[s.charAt(i)]){
                return false;
            }
            ch[s.charAt(i)] = true;
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                String ans = s.substring(i , j + 1) ;
                if(check(ans)){
                    max = Math.max(max , ans.length());
                }
                else{
                    break;
                }
            }
        }
        return max;
    }
}