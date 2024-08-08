class Solution {
    public int check(int a , int b , int[] arr){
        int sum = 0 ;
        for(int i = a ; i < b - 1 ; i++){
            if(arr[i] >= arr[i + 1]){
                return -1;
            }
            sum += arr[i];
        }
        sum += arr[b - 1];
        return sum;
    }
    public int maxAscendingSum(int[] nums) {
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j <= nums.length ; j++){
                int n = check(i , j , nums) ;
                if(n == -1){
                    break ;
                }
                max = Math.max(max , n);
            }
        }
        return max;
    }
}