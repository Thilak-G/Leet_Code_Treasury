class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String s1 = "" ;
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            s1 += s.charAt(i);
        }
        return s.equals(s1);
    }
}