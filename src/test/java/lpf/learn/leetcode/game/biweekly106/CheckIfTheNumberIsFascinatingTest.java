package lpf.learn.leetcode.game.biweekly106;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfTheNumberIsFascinatingTest {
    @Test
    public void test1(){
        CheckIfTheNumberIsFascinating test = new CheckIfTheNumberIsFascinating();
        Assert.assertTrue(test.isFascinating(192));
    }

    @Test
    public void test2(){
        CheckIfTheNumberIsFascinating test = new CheckIfTheNumberIsFascinating();
        Assert.assertFalse(test.isFascinating(100));
    }

}
