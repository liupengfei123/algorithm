package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class RemoveOutermostParenthesesTest {

    @Test
    public void test(){
        RemoveOutermostParentheses test = new RemoveOutermostParentheses();

        Assert.assertEquals("()()()", test.removeOuterParentheses("(()())(())"));

        Assert.assertEquals("()()()()(())", test.removeOuterParentheses("(()())(())(()(()))"));

        Assert.assertEquals("", test.removeOuterParentheses("()()"));

        Assert.assertEquals("", test.removeOuterParentheses(""));



    }
}
