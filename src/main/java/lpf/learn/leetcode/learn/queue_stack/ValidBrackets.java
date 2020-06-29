package lpf.learn.leetcode.learn.queue_stack;

import java.util.Stack;

public class ValidBrackets {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        char[] bracketLefts = {'(', '{', '['};
        char[] bracketRights = {')', '}', ']'};
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            for (int i = 0; i < bracketRights.length; i++) {
                if (c == bracketRights[i]) {
                    if (stack.isEmpty() || stack.pop() != bracketLefts[i]) {
                        return false;
                    }
                } else if (c == bracketLefts[i]) {
                    stack.push(c);
                    break;
                }
            }
        }
        return stack.isEmpty();
    }
}
