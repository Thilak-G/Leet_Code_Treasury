class Solution {
    public int minSteps(int n) {
        int r = 0;
        for(int i = 2; i <= n; i++) {
            while (n % i == 0) {
                r += i;
                n /= i;
            }
        }
        return r;
    }
}