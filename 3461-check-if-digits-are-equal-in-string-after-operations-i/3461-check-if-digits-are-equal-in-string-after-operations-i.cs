public class Solution {
    public bool HasSameDigits(string s) {
        if(s.Length == 2){
            return (s[0] == s[1]) ;
        }
        string ans = "" ;
        for(int i = 1 ; i < s.Length ; i++){
            ans += (((s[i - 1] - '0') + (s[i] - '0')) % 10);
        }
        return HasSameDigits(ans);
    }
}