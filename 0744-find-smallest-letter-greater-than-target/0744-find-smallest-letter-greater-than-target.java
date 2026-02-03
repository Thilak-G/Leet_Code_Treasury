class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int a = target - 'a';
        for(int i = 0 ; i < letters.length ; i++){
            int b = letters[i] - 'a' ;
            if(a < b){
                return letters[i];
            }
        }
        return letters[0];
    }
}