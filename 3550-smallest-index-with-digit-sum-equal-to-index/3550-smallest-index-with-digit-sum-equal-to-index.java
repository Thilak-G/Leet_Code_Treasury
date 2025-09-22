class Solution {
    public int sum(int n){
        int s = 0 ;
        while(n != 0){
            s += n % 10 ;
            n /= 10 ;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            if(i == ((nums[i] > 9) ? sum(nums[i]) : nums[i])){
                return i ;
            } 
        }
        return -1;
    }
}