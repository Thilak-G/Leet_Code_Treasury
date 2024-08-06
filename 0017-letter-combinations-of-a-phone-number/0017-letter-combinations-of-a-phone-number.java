class Solution {
    String[] str = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
    List<String> li = new ArrayList<>() ;
    public void Key(String digits , String st){
        if(digits.length() == 0){
            li.add(st);
            return;
        }
        char ch = digits.charAt(0);
        String s = str[ch - '0'];
        for(int i = 0 ; i < s.length() ; i++){
            Key(digits.substring(1) , st + s.charAt(i));
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        Key(digits , "");
        return li;
    }
}