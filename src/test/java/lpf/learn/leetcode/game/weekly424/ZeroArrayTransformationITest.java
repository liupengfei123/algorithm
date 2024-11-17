package lpf.learn.leetcode.game.weekly424;

import org.junit.Assert;
import org.junit.Test;

public class ZeroArrayTransformationITest {
    @Test
    public void test1(){
        ZeroArrayTransformationI test = new ZeroArrayTransformationI();
        Assert.assertTrue(test.isZeroArray(new int[]{1, 0, 1}, new int[][]{{0, 2}}));
    }


    @Test
    public void test2(){
        ZeroArrayTransformationI test = new ZeroArrayTransformationI();
        Assert.assertFalse(test.isZeroArray(new int[]{4,3,2,1}, new int[][]{{1,3},{0,2}}));
    }
}
