package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class MinimumRemoveToMakeValidParenthesesTest {

    @Test
    public void test(){
        MinimumRemoveToMakeValidParentheses test = new MinimumRemoveToMakeValidParentheses();

        Assert.assertEquals("lee(t(c)o)de", test.minRemoveToMakeValid("lee(t(c)o)de)"));
        Assert.assertEquals("ab(c)d", test.minRemoveToMakeValid("a)b(c)d"));
        Assert.assertEquals("", test.minRemoveToMakeValid("))(("));

        Assert.assertEquals("a(b(c)d)", test.minRemoveToMakeValid("(a(b(c)d)"));

        Assert.assertEquals("a(b(c)d)", test.minRemoveToMakeValid("(((((a(b(c)d)"));


    }
}
