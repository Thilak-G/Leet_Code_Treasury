class Solution {
    public String generateTheString(int n) {
        char a = 'a' ;
        String ans = "" ;
        if(n % 2 == 0){
            for(int i = 0 ; i < n - 1 ; i++){
                ans += a ;
            }
            ans += 'b';
        }
        else{
            for(int i = 0 ; i < n ; i++){
                ans += a;
            }
        }
        return ans;
    }
}