package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class ValidParenthesisStringTest {

    @Test
    public void test1(){
        ValidParenthesisString test = new ValidParenthesisString();
        Assert.assertEquals(true, test.checkValidString("()"));
    }

    @Test
    public void test2(){
        ValidParenthesisString test = new ValidParenthesisString();
        Assert.assertEquals(true, test.checkValidString("(*)"));
    }

    @Test
    public void test3(){
        ValidParenthesisString test = new ValidParenthesisString();
        Assert.assertEquals(true, test.checkValidString("(*))"));
    }

    @Test
    public void test4(){
        ValidParenthesisString test = new ValidParenthesisString();
        Assert.assertEquals(true, test.checkValidString("((*)"));
    }

    @Test
    public void test5(){
        ValidParenthesisString test = new ValidParenthesisString();
        Assert.assertEquals(false, test.checkValidString("((*"));
    }

    @Test
    public void test6(){
        ValidParenthesisString test = new ValidParenthesisString();
        Assert.assertEquals(true, test.checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"));
    }
}
