class Solution {
    public int[] findErrorNums(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != i + 1){
                return new int[]{i , i + 1} ;
            }
        }
        return new int[]{-1 , -1};
    }
}