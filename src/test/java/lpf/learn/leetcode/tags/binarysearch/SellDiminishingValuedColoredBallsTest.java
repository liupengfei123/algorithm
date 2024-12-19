package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class SellDiminishingValuedColoredBallsTest {

    @Test
    public void test1(){
        SellDiminishingValuedColoredBalls test = new SellDiminishingValuedColoredBalls();
        Assert.assertEquals(14, test.maxProfit(new int[]{2,5}, 4));
    }

    @Test
    public void test2(){
        SellDiminishingValuedColoredBalls test = new SellDiminishingValuedColoredBalls();
        Assert.assertEquals(19, test.maxProfit(new int[]{3,5}, 6));
    }

    @Test
    public void test3(){
        SellDiminishingValuedColoredBalls test = new SellDiminishingValuedColoredBalls();
        Assert.assertEquals(110, test.maxProfit(new int[]{2,8,4,10,6}, 20));
    }

    @Test
    public void test4(){
        SellDiminishingValuedColoredBalls test = new SellDiminishingValuedColoredBalls();
        Assert.assertEquals(21, test.maxProfit(new int[]{1000000000}, 1000000000));
    }
}
