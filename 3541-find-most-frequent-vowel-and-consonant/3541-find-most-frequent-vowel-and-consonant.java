class Solution {
    public int maxFreqSum(String s) {
        String vow = "aeiou" ;
        int[] freq = new int[26] ;
        int vc = 0 , cc = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            freq[s.charAt(i) - 'a']++ ;
            if(vow.contains(s.charAt(i) + "")){
                vc = Math.max(vc , freq[s.charAt(i) - 'a']);
            }
            else{
                cc = Math.max(cc , freq[s.charAt(i) - 'a']);
            }
        }
        return vc + cc ;
    }
}