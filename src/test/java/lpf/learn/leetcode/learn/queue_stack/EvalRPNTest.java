package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Assert;
import org.junit.Test;

public class EvalRPNTest {

    @Test
    public void test() {
        EvalRPN temp = new EvalRPN();
        Assert.assertEquals(9, temp.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        Assert.assertEquals(6, temp.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        Assert.assertEquals(22, temp.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }


}
