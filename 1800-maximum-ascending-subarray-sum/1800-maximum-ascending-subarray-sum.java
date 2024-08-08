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
        ArrayList<Integer> arr = new ArrayList<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 2 ; j <= nums.length ; j++){
                arr.add(check(i , j , nums));
            }
        }
        Collections.sort(arr);
        return arr.get(arr.size() - 1);
    }
}