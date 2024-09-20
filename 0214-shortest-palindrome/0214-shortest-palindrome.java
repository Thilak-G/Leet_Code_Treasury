class Solution {
    public String shortestPalindrome(String s) {
        String temp = rev(s);
        String combined = s + "#" + temp;

        int[] prefixTable = buildPrefixTable(combined);

        int i = prefixTable[prefixTable.length - 1];
        String suffix = s.substring(i);

        return rev(suffix) + s;
    }

    private int[] buildPrefixTable(String s) {
        int[] table = new int[s.length()];
        int j = 0;
        
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = table[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            table[i] = j;
        }
        return table;
    }

    public String rev(String s) {
        StringBuilder temp = new StringBuilder(s);
        return temp.reverse().toString();
    }
}
