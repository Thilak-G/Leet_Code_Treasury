public class Solution {
    public int CountPartitions(int[] nums) {
        int sum = 0 ,sum1 = nums[0] ;
        for(int i = 1 ; i < nums.Length ; i++){
            sum += nums[i] ;
        }
        int count = 0 ;
        for(int i = 1 ; i < nums.Length ; i++){
            //Console.WriteLine(sum + " " + sum1);
            if((sum - sum1) % 2 == 0){
                count++;
            }
            sum -= nums[i] ;
            sum1 += nums[i];
        }
        return count;
    }
}