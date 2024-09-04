class Solution {
    public boolean check(String s){
        String temp = "" ;
        for(int i = s.length() -  1 ; i >= 0 ; i--){
            temp += s.charAt(i) ;
        }
        return temp.equals(s);
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2 ; i <= n - 2 ; i++){
            if(!check(Integer.toString(n , i))){
                return false;
            }
        }
        return true;
    }
}