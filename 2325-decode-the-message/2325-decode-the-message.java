class Solution {
    public String decodeMessage(String key, String message) {
        key = key.replaceAll("\\s","");
        char ch = 'a' ;
        HashMap<Character , Character> hm = new HashMap<>() ;
        for(int i = 0 ; i < key.length() ; i++){
            if(hm.containsKey(key.charAt(i))){
                continue;
            }
            hm.put(key.charAt(i) , ch);
            ch++;
        }
        String ans = "" ;
        for(int i = 0 ; i < message.length() ; i++){
            if(message.charAt(i) == ' '){
                ans += " ";
                continue;
            }
            ans += hm.get(message.charAt(i));
        }
        return ans;
    }
}