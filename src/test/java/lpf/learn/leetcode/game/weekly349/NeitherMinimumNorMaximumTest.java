package lpf.learn.leetcode.game.weekly349;

import org.junit.Assert;
import org.junit.Test;

public class NeitherMinimumNorMaximumTest {
    @Test
    public void test1(){
        NeitherMinimumNorMaximum test = new NeitherMinimumNorMaximum();
        Assert.assertEquals(2, test.findNonMinOrMax(new int[]{3,2,1,4}));
    }

    @Test
    public void test2(){
        NeitherMinimumNorMaximum test = new NeitherMinimumNorMaximum();
        Assert.assertEquals(-1, test.findNonMinOrMax(new int[]{1,2}));
    }

    @Test
    public void test3(){
        NeitherMinimumNorMaximum test = new NeitherMinimumNorMaximum();
        Assert.assertEquals(2, test.findNonMinOrMax(new int[]{3,2,1}));
    }

}
