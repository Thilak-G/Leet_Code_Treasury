class Solution {
    static ArrayList<String> p = new ArrayList<>();
    public static void check(String ans , int open , int close , int n){
        if(open > n || close > n){
            return;
        }
        if(open == n && close == n){
                p.add(ans);
                return;
        }
        check(ans + "(" , open + 1 , close , n);
        if(open > close) {
            check(ans + ")", open, close + 1, n);
        }
    }
    public List<String> generateParenthesis(int n) {
        if(p.size() != 0){
            for(int i = p.size() - 1 ; i >= 0 ; i--){
                p.remove(i);
            }
        }
        check("" , 0 , 0 , n);
        return p;
    }
}