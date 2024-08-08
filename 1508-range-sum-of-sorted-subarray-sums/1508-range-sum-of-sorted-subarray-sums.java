class Solution {
    public int sum(int a , int b , int[] arr){
        int s = 0 ;
        for(int i = a ; i < b ; i++){
            s += arr[i] ; 
        }
        return s;
    }
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j <= n ; j++){
                arr.add(sum(i , j , nums));
            }
        }
        Collections.sort(arr);
        int s = 0 ;
        for(int i = left - 1 ; i < right ; i++){
            s += arr.get(i) ;
            s = (int)(s % (Math.pow(10 , 9) + 7));
        }
        return s;
    }
}