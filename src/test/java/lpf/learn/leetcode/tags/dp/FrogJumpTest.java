package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class FrogJumpTest {
    @Test
    public void test1(){
        FrogJump test = new FrogJump();
        Assert.assertTrue(test.canCross(new int[]{0, 1, 3, 5, 6, 8, 12, 17}));
    }

    @Test
    public void test2(){
        FrogJump test = new FrogJump();
        Assert.assertFalse(test.canCross(new int[]{0, 1, 2, 3, 4, 8, 9, 11}));
    }
}
