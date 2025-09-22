class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length == 0 || pref.length == 1){
            return pref ;
        }
        int[] ans = new int[pref.length] ;
        ans[0] = pref[0] ;
        for(int i = pref.length - 1 ; i > 0 ; i--){
            ans[i] = pref[i] ^ pref[i - 1];
        }
        return ans;
    }
}