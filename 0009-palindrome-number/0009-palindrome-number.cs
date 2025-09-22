public class Solution {
    public bool IsPalindrome(int x) {
        string s = Convert.ToString(x) ;
        int start = 0 , end = s.Length - 1 ;
        while(start < end){
            if(s[start] != s[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}