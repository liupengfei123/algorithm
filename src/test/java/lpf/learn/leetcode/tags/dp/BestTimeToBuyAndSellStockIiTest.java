package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class BestTimeToBuyAndSellStockIiTest {

    @Test
    public void test1(){
        BestTimeToBuyAndSellStockIi test = new BestTimeToBuyAndSellStockIi();
        Assert.assertEquals(7, test.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2(){
        BestTimeToBuyAndSellStockIi test = new BestTimeToBuyAndSellStockIi();
        Assert.assertEquals(4, test.maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test3(){
        BestTimeToBuyAndSellStockIi test = new BestTimeToBuyAndSellStockIi();
        Assert.assertEquals(0, test.maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    public void test4(){
        BestTimeToBuyAndSellStockIi test = new BestTimeToBuyAndSellStockIi();
        Assert.assertEquals(13, test.maxProfit(new int[]{7,1,5,3,6,4,10}));
    }

    @Test
    public void test5(){
        BestTimeToBuyAndSellStockIi test = new BestTimeToBuyAndSellStockIi();
        Assert.assertEquals(8, test.maxProfit(new int[]{1,9}));
    }
}
