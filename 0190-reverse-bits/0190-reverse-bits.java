public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = "";
        str += Integer.toBinaryString(n) ;
        while(str.length() < 32){
            str = '0' + str ;
        }
        long sum = 0 ;
        for(int i = 0 ; i < str.length() ; i++){
            sum += (str.charAt(i) - '0') * Math.pow(2 , i);
        }
        return (int)sum;
    }
}