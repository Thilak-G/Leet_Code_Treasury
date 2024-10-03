class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long remainder = totalSum % p;
        if (remainder == 0) {
            return 0;
        }

        HashMap<Long, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0L, -1);
        long currentSum = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            currentSum = (currentSum + nums[i]) % p;
            long target = (currentSum - remainder + p) % p;

            if (prefixSums.containsKey(target)) {
                minLength = Math.min(minLength, i - prefixSums.get(target));
            }

            prefixSums.put(currentSum, i);
        }

        return minLength == nums.length ? -1 : minLength;
    }
}