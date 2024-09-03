class Solution {
    public int getLucky(String s, int k) {
        String s1 = "";
        for(int i = 0 ; i < s.length() ; i++){
            int a = s.charAt(i) - 'a' + 1;
            s1 += a;
        }
        int l = 0 ;
        int sum = 0 ;
        while(l<k){
        sum = 0 ;
        for(int i = 0 ; i < s1.length() ; i++){
            sum += s1.charAt(i) - '0';
        }
        if(sum < 10){
            return sum;
        }
        s1 = String.valueOf(sum);
        l++;
        }
        return sum;
    }
}