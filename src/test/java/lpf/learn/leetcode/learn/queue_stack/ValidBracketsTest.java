package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidBracketsTest {

    @Test
    public void test() {
        ValidParentheses temp = new ValidParentheses();
        assertTrue(temp.isValid("()"));
        assertTrue(temp.isValid("()[]{}"));
        assertFalse(temp.isValid("(]"));
        assertFalse(temp.isValid("([)]"));
        assertTrue(temp.isValid("{[]}"));

        assertFalse(temp.isValid("{"));
        assertFalse(temp.isValid("}"));
    }
}
