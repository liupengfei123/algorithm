package lpf.learn.leetcode.game.weekly338;

import org.junit.Assert;
import org.junit.Test;

public class KItemsWithTheMaximumSumTest {
    @Test
    public void test1(){
        KItemsWithTheMaximumSum test = new KItemsWithTheMaximumSum();
        Assert.assertEquals(2, test.kItemsWithMaximumSum(3, 2, 0, 2));
    }

    @Test
    public void test2(){
        KItemsWithTheMaximumSum test = new KItemsWithTheMaximumSum();
        Assert.assertEquals(3, test.kItemsWithMaximumSum(3, 2, 0, 4));
    }

}
