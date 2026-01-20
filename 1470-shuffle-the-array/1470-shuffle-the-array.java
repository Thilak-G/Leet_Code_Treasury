class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length] ;
        int c = 0 , c1 = n ;
        for(int i = 0 ; i < nums.length ; i += 2){
            ans[i] = nums[c] ;
            ans[i + 1] = nums[c1] ;
            c++;
            c1++;
        }
        return ans;
    }
}