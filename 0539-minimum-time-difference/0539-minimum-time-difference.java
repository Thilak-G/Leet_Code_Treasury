class Solution {
    public int findMinDifference(List<String> timePoints) {
        int totalMinutes = 24 * 60;
        boolean[] seen = new boolean[totalMinutes];
        
        for (String time : timePoints) {
            String[] parts = time.split(":");
            int minutes = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
            if (seen[minutes]) {
                return 0;
            }
            seen[minutes] = true;
        }
        
        int prev = -1, first = -1, last = -1, minDiff = totalMinutes;
        for (int i = 0; i < totalMinutes; i++) {
            if (seen[i]) {
                if (prev != -1) {
                    minDiff = Math.min(minDiff, i - prev);
                }
                prev = i;
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        minDiff = Math.min(minDiff, (totalMinutes - last + first));
        
        return minDiff;
    }
}