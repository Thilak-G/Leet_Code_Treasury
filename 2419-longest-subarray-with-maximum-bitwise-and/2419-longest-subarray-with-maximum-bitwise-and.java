class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for (int n : nums) {
            max = Math.max(max, n); 
        }
        
        int maxLen = 0;
        int currentLen = 0;
        
        for (int n : nums) {
            if (n == max) {
                currentLen++; 
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 0; 
            }
        }
        
        return maxLen;
    }
} 