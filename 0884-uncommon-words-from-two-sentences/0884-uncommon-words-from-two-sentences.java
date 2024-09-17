class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        s1 += " " + s2 ;
        String[] st = s1.split(" ") ;
        List<String> ls = new ArrayList<>() ;
        for(int i = 0 ; i < st.length ; i++){
            int count = 0 ; 
            for(int j = 0 ; j < st.length ; j++){
                if(st[i].equals(st[j])){
                    count++;
                }
            }
            if(count == 1){
                ls.add(st[i]);
            }
        }
        String[] ans = new String[ls.size()] ;
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
}