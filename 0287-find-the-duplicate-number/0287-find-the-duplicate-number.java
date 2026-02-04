class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0 ;
        while(i < nums.length){
            if(nums[i] != nums[nums[i]]){
                int temp = nums[nums[i]] ;
                nums[nums[i]] = nums[i] ;
                nums[i] = temp ;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums[0];
    }
}