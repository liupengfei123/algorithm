package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class BestTimeToBuyAndSellStockTest {

    @Test
    public void test1(){
        BestTimeToBuyAndSellStock test = new BestTimeToBuyAndSellStock();
        Assert.assertEquals(5, test.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2(){
        BestTimeToBuyAndSellStock test = new BestTimeToBuyAndSellStock();
        Assert.assertEquals(0, test.maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    public void test3(){
        BestTimeToBuyAndSellStock test = new BestTimeToBuyAndSellStock();
        Assert.assertEquals(8, test.maxProfit(new int[]{1,9}));
    }

    @Test
    public void test4(){
        BestTimeToBuyAndSellStock test = new BestTimeToBuyAndSellStock();
        Assert.assertEquals(9, test.maxProfit(new int[]{7,1,5,3,6,4,10}));
    }
}
