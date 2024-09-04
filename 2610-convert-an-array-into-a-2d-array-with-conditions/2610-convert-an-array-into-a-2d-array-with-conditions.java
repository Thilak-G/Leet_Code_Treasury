class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] freq = new int[nums.length] ;
        int max = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            freq[i] = -1;
            for(int j = i ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    freq[i]++;
                }
            }
            max = Math.max(max , freq[i]);
        }
        List<List<Integer>> arr = new ArrayList<>() ;
        for(int i = 0 ; i <= max ; i++){
            arr.add(new ArrayList<>()) ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            arr.get(freq[i]).add(nums[i]);
        }
        return arr;
    }
}