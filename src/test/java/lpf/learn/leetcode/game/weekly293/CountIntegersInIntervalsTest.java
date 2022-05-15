package lpf.learn.leetcode.game.weekly293;

import org.junit.Assert;
import org.junit.Test;

public class CountIntegersInIntervalsTest {
    @Test
    public void test1(){
        CountIntegersInIntervals test = new CountIntegersInIntervals();
        test.add(2,3);
        test.add(7,10);

        Assert.assertEquals(6, test.count());

        test.add(5,8);
        Assert.assertEquals(8, test.count());
    }

}
