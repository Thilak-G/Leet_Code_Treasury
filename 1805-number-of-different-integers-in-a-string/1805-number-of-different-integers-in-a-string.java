class Solution {
    public String check(String s){
        int a = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != '0'){
                return s.substring(a , s.length());
            }
            a++;
        }
        return "";
    } 
    public int numDifferentIntegers(String word) {
        HashSet<String> l1 = new HashSet<>() ;
        String temp = "";
        for(int i = 0 ; i < word.length() ; i++){
            if(word.charAt(i) - '0' <= 9 && word.charAt(i) - '0' >= 0){
                temp += word.charAt(i);
            }
            else if(temp.length() != 0){
                temp = check(temp) ;
                l1.add(temp);
                temp = "" ;
            }
        }
        if(temp.length() != 0){
            temp = check(temp) ;
            l1.add(temp);
        }
        System.out.println(l1) ;
        return l1.size();
    }
}