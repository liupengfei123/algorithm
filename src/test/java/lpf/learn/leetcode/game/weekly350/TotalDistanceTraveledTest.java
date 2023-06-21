package lpf.learn.leetcode.game.weekly350;

import org.junit.Assert;
import org.junit.Test;

public class TotalDistanceTraveledTest {
    @Test
    public void test1(){
        TotalDistanceTraveled test = new TotalDistanceTraveled();
        Assert.assertEquals(60, test.distanceTraveled(5, 10));
    }

    @Test
    public void test2(){
        TotalDistanceTraveled test = new TotalDistanceTraveled();
        Assert.assertEquals(10, test.distanceTraveled(1, 2));
    }
}
