package lpf.learn.leetcode.game.biweekly79;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfNumberHasEqualDigitCountAndDigitValueTest {
    @Test
    public void test1(){
        CheckIfNumberHasEqualDigitCountAndDigitValue test = new CheckIfNumberHasEqualDigitCountAndDigitValue();
        Assert.assertEquals(true, test.digitCount("1210"));
    }


    @Test
    public void test2(){
        CheckIfNumberHasEqualDigitCountAndDigitValue test = new CheckIfNumberHasEqualDigitCountAndDigitValue();
        Assert.assertEquals(false, test.digitCount("030"));
    }
}
