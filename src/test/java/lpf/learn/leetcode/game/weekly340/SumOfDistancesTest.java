package lpf.learn.leetcode.game.weekly340;

import org.junit.Assert;
import org.junit.Test;

public class SumOfDistancesTest {

    @Test
    public void test1(){
        SumOfDistances test = new SumOfDistances();
        Assert.assertArrayEquals(new long[]{5,0,3,4,0}, test.distance(new int[]{1,3,1,1,2}));

    }
}
