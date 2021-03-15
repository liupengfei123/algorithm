package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class LongestValidParenthesesTest {
    @Test
    public void test1(){
        LongestValidParentheses test = new LongestValidParentheses();
        Assert.assertEquals(2, test.longestValidParentheses("(()"));
    }

    @Test
    public void test2(){
        LongestValidParentheses test = new LongestValidParentheses();
        Assert.assertEquals(4, test.longestValidParentheses(")()())"));
    }

    @Test
    public void test3(){
        LongestValidParentheses test = new LongestValidParentheses();
        Assert.assertEquals(8, test.longestValidParentheses(")()())()(())()"));
    }

    @Test
    public void test4(){
        LongestValidParentheses test = new LongestValidParentheses();
        Assert.assertEquals(0, test.longestValidParentheses(""));
    }

    @Test
    public void test5(){
        LongestValidParentheses test = new LongestValidParentheses();
        Assert.assertEquals(2, test.longestValidParentheses("()(()"));
    }


}
