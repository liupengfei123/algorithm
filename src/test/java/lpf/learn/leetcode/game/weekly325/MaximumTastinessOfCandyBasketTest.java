package lpf.learn.leetcode.game.weekly325;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTastinessOfCandyBasketTest {
    @Test
    public void test1(){
        MaximumTastinessOfCandyBasket test = new MaximumTastinessOfCandyBasket();
        Assert.assertEquals(8, test.maximumTastiness(new int[]{13,5,1,8,21,2}, 3));
    }

    @Test
    public void test2(){
        MaximumTastinessOfCandyBasket test = new MaximumTastinessOfCandyBasket();
        Assert.assertEquals(2, test.maximumTastiness(new int[]{1,3,1}, 2));
    }

    @Test
    public void test3(){
        MaximumTastinessOfCandyBasket test = new MaximumTastinessOfCandyBasket();
        Assert.assertEquals(0, test.maximumTastiness(new int[]{7,7,7,7}, 2));
    }

}
