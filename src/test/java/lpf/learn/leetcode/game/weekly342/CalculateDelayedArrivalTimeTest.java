package lpf.learn.leetcode.game.weekly342;

import org.junit.Assert;
import org.junit.Test;

public class CalculateDelayedArrivalTimeTest {
    @Test
    public void test1(){
        CalculateDelayedArrivalTime test = new CalculateDelayedArrivalTime();
        Assert.assertEquals(2, test.findDelayedArrivalTime(1, 1));
    }

    @Test
    public void test2(){
        CalculateDelayedArrivalTime test = new CalculateDelayedArrivalTime();
        Assert.assertEquals(20, test.findDelayedArrivalTime(15, 5));
    }

    @Test
    public void test3(){
        CalculateDelayedArrivalTime test = new CalculateDelayedArrivalTime();
        Assert.assertEquals(0, test.findDelayedArrivalTime(13, 11));
    }
}
