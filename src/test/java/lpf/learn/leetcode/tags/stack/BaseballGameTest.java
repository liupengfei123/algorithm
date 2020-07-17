package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class BaseballGameTest {

    @Test
    public void test(){
        BaseballGame test = new BaseballGame();

        Assert.assertEquals(30, test.calPoints(new String[]{"5","2","C","D","+"}));
        Assert.assertEquals(27, test.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));

    }
}
