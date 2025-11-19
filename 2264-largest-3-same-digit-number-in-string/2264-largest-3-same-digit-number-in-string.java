class Solution {
    public String largestGoodInteger(String num) {
        int n = -1 ;
        for(int i = 0 ; i < num.length() - 2 ; i++){
            if(num.charAt(i) == num.charAt(i + 2)){
                if(num.charAt(i) == num.charAt(i + 1)){ 
                    if(n < num.charAt(i) - '0'){
                        n = num.charAt(i) - '0' ;
                    }
                }
            }
        }
        if(n == -1){
            return "" ;
        }
        return "" + n + n + n ;
    }
}