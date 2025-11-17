class Solution {
    public int findClosest(int x, int y, int z) {
        int a = Math.abs(z - x) ;
        int b = Math.abs(y - z) ;
        return (a < b) ? 1 : (a > b) ? 2 : 0 ;
    }
}