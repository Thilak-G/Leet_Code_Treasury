class Solution {
    public int check(int a , int b , List<Integer> nums){
        HashSet<Integer> hs = new HashSet<>() ;
        for(int i = a ; i < b ; i++){
            hs.add(nums.get(i)) ;
        }
        return hs.size() ;
    }
    public int sumCounts(List<Integer> nums) {
        int sum = 0 ; 
        for(int i = 0 ; i < nums.size() ; i++){
            for(int j = i + 1 ; j <= nums.size() ; j++){
                int a = check(i , j , nums) ;
                sum += a * a ;
            }
        }
        return sum ;
    }
}