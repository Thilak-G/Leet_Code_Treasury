class Solution {
    public int maxDistinct(String s) {
        ArrayList<Character> ans = new ArrayList<>() ;
        for(int i = 0 ; i < s.length() ; i++){
            if(!ans.contains(s.charAt(i))){
                ans.add(s.charAt(i));
            }
        }
        return ans.size() ;
    }
}