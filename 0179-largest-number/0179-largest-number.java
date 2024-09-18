class Solution {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String str : strNums) {
            sb.append(str);
        }
        int start = 0;
        while (start < sb.length() && sb.charAt(start) == '0') {
            start++;
        }

        return start == sb.length() ? "0" : sb.substring(start);
    }
}