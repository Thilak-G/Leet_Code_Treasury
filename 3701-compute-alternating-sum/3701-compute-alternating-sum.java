class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0 , sym = 1 ;
        for(int i = 0 ; i < nums.length ; i++){
            sum += (sym * nums[i]);
            sym *= -1 ;
        }
        return sum;
    }
}