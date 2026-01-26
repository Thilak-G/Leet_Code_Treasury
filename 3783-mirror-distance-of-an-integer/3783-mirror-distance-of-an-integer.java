class Solution {
    public int mirrorDistance(int n) {
        if(n < 10){
            return 0 ;
        }
        String ans = "" ;
        int n1 = n ; 
        while(n1 != 0){
            ans += (n1 % 10) ;
            n1 /= 10 ;
        }
        return Math.abs(Integer.parseInt(ans) - n) ;
    }
}