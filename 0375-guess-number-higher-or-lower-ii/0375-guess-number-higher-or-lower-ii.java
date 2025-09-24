class Solution {
    public int getMoneyAmount(int n) {
        int[][] memo = new int[n + 1][n + 1];
        return solve(1, n, memo);
    }
    private int solve(int l, int r, int[][] memo) {
        if (l >= r) return 0; 
        if (memo[l][r] != 0) return memo[l][r];

        int minCost = Integer.MAX_VALUE;
        for (int x = l; x <= r; x++) {
            int costLeft = solve(l, x - 1, memo);
            int costRight = solve(x + 1, r, memo);
            int worst = x + Math.max(costLeft, costRight);
            if (worst < minCost) minCost = worst;
        }

        memo[l][r] = minCost;
        return minCost;
    }

}