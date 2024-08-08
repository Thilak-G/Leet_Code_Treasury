class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double> arr = new HashSet<>() ;
        for(int i = 0 ; i < nums.length / 2 ; i++){
            double n = ((double)(nums[i] + nums[nums.length - i - 1])) / 2 ;
            System.out.println(n);
            arr.add(n);
        }
        System.out.println(arr);
        return arr.size();
    }
}