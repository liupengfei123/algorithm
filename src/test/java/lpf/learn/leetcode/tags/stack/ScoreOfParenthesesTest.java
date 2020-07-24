package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class ScoreOfParenthesesTest {

    @Test
    public void test(){
        ScoreOfParentheses test = new ScoreOfParentheses();

        Assert.assertEquals(1, test.scoreOfParentheses("()"));
        Assert.assertEquals(2, test.scoreOfParentheses("()()"));
        Assert.assertEquals(2, test.scoreOfParentheses("(())"));
        Assert.assertEquals(4, test.scoreOfParentheses("((()))"));
        Assert.assertEquals(6, test.scoreOfParentheses("(()(()))"));

    }
}
