import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if ((aChar == '(' || aChar == '[' || aChar == '{')) {
                stack.push(aChar);
            } else {
                if (!stack.isEmpty() && ((aChar == '}' && stack.peek() == '{') || (aChar == ']' && stack.peek() == '[') || (aChar == ')' && stack.peek() == '('))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}