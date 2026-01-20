class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 1){
            return nums[0] ;
        }
        int max = nums[0] ;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == 0){
                continue ;
            }
            nums[i] = nums[i - 1] + nums[i];
            max = Math.max(nums[i] , max);
        }
        return max;
    }
}