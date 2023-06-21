package lpf.learn.leetcode.game.weekly349;

import org.junit.Assert;
import org.junit.Test;

public class CollectingChocolatesTest {
    @Test
    public void test1(){
        CollectingChocolates test = new CollectingChocolates();
        Assert.assertEquals(13, test.minCost(new int[]{20, 1, 15}, 5));
    }

    @Test
    public void test2(){
        CollectingChocolates test = new CollectingChocolates();
        Assert.assertEquals(6, test.minCost(new int[]{1,2,3}, 4));
    }
}
