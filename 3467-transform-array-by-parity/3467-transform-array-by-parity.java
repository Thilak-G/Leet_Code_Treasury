class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length] ;
        int a = ans.length - 1 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 != 0){
                ans[a] = 1 ;
                a-- ;
            }
        }
        return ans;
    }
}