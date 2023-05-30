package lpf.learn.leetcode.game.biweekly105;

import org.junit.Assert;
import org.junit.Test;

public class TBuyTwoChocolatesTest {
    @Test
    public void test1(){
        BuyTwoChocolates test = new BuyTwoChocolates();
        Assert.assertEquals(0, test.buyChoco(new int[]{1,2,2}, 3));
    }

    @Test
    public void test2(){
        BuyTwoChocolates test = new BuyTwoChocolates();
        Assert.assertEquals(3, test.buyChoco(new int[]{3,2,3}, 3));
    }
}