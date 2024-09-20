class Solution {
    public boolean checkPalin(String s){
        return (rev(s).equals(s));
    }
    
    public String rev(String s){
        StringBuilder temp = new StringBuilder(s);
        return temp.reverse().toString();
    }
    
    public String shortestPalindrome(String s) {
        if(checkPalin(s)){
            return s;
        }
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            String temp = rev(s.substring(i , s.length())) + s;
            if(checkPalin(temp)){
                return temp;
            }
        }
        return s;
    }
}
