package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MinimumNumberOfRefuelingStopsTest {

    @Test
    public void test1(){
        MinimumNumberOfRefuelingStops test = new MinimumNumberOfRefuelingStops();
        Assert.assertEquals(0, test.minRefuelStops(1, 1, new int[][]{}));
    }

    @Test
    public void test2(){
        MinimumNumberOfRefuelingStops test = new MinimumNumberOfRefuelingStops();
        Assert.assertEquals(-1, test.minRefuelStops(100, 1, new int[][]{{10, 100}}));
    }

    @Test
    public void test3(){
        MinimumNumberOfRefuelingStops test = new MinimumNumberOfRefuelingStops();
        Assert.assertEquals(2, test.minRefuelStops(100, 10, new int[][]{{10,60},{20,30},{30,30},{60,40}}));
    }

    @Test
    public void test4(){
        MinimumNumberOfRefuelingStops test = new MinimumNumberOfRefuelingStops();
        Assert.assertEquals(0, test.minRefuelStops(100, 100, new int[][]{{10,60},{20,30},{30,30},{60,40}}));
    }

    @Test
    public void test5(){
        MinimumNumberOfRefuelingStops test = new MinimumNumberOfRefuelingStops();
        Assert.assertEquals(-1, test.minRefuelStops(100, 50, new int[][]{{60,50}}));
    }

    @Test
    public void test6(){
        MinimumNumberOfRefuelingStops test = new MinimumNumberOfRefuelingStops();
        Assert.assertEquals(4, test.minRefuelStops(1000, 299, new int[][]{{13,21},{26,115},{100,47},{225,99},{299,141},{444,198},{608,190},{636,157},{647,255},{841,123}}));
    }
}
