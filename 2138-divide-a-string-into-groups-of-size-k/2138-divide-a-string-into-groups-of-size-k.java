class Solution {
    public String[] divideString(String s, int k, char fill) {
        while(s.length() % k != 0){
            s += fill ;
        }
        String[] ans = new String[s.length() / k];
        int a = 0 ;
        for(int i = 0 ; i < s.length() - k + 1 ; i += k){
            ans[a] = s.substring(i , i + k);
            a++;
        }
        return ans;
    }
}