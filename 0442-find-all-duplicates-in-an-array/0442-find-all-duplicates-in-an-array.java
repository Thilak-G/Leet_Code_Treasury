class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> arr = new HashSet<>() ;
        ArrayList<Integer> ans = new ArrayList<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
            else{
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}