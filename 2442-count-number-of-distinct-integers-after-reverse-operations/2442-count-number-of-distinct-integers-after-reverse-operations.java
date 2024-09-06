class Solution {
    public int rev(int n){
        int temp = 0 ;
        while(n != 0){
            temp = (temp * 10) + (n % 10) ;
            n = n / 10 ;
        }
        return temp ;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            hs.add(nums[i]);
            hs.add(rev(nums[i]));
        }
        return hs.size() ;
    }
}