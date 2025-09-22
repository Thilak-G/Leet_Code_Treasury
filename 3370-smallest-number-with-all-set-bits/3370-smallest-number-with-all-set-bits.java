class Solution {
    public int smallestNumber(int n) {
        String s = Integer.toBinaryString(n) ;
        String s1 = "" ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '0'){
                s1 += '1' ;
            }
            else{
                s1 += '1' ;
            }
        }
        return Integer.parseInt(s1 , 2);
    }
}