class Solution {
    public int passThePillow(int n, int time) {
        int i = 1 , n1 = 1 , d = 1 ;
        while(i <= time){
            n1 += d;
            if(n1 == n){
                d = -1;
            }
            if(n1 == 0){
                d = 1;
            }
            i++;
        }
        return n1;
    }
}