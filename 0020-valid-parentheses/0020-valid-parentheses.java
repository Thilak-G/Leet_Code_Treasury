class Solution {
    static Stack<Character> ch = new Stack<>();

    public static void check(String str, int i) {
        if (i >= str.length()) {
            return;
        }
        if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
            ch.push(str.charAt(i));
        } else if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
            if (ch.isEmpty()) {
                ch.push(str.charAt(i));
            }
            if ((str.charAt(i) == ')' && ch.peek() == '(') || (str.charAt(i) == ']' && ch.peek() == '[')
                    || (str.charAt(i) == '}' && ch.peek() == '{')) {
                ch.pop();
            } else {
                ch.push(str.charAt(i));
            }
        }
        check(str, i + 1);
    }

    public boolean isValid(String s) {
        while (!ch.isEmpty()) {
            ch.pop();
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        check(s, 0);
        return ch.isEmpty();
    }
}