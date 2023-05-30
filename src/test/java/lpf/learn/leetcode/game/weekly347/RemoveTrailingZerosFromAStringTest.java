package lpf.learn.leetcode.game.weekly347;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTrailingZerosFromAStringTest {

    @Test
    public void test1(){
        RemoveTrailingZerosFromAString test = new RemoveTrailingZerosFromAString();
        Assert.assertEquals("512301", test.removeTrailingZeros("51230100"));
    }

    @Test
    public void test2(){
        RemoveTrailingZerosFromAString test = new RemoveTrailingZerosFromAString();
        Assert.assertEquals("123", test.removeTrailingZeros("123"));
    }
}
