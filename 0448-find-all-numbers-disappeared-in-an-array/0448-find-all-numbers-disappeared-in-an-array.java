class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>() ;

        int i = 0 ; 
        while(i < nums.length){
            if(nums[i] != nums[nums[i] - 1]){
                int temp = nums[nums[i] - 1] ;
                nums[nums[i] - 1] = nums[i] ;
                nums[i] = temp ;
            }else{
                i++;
            }
        }   
        for(i = 0 ; i < nums.length ; i++){
            if(i + 1 != nums[i]){
                ans.add(i + 1) ;
            }
        }
        return ans;
    }
}