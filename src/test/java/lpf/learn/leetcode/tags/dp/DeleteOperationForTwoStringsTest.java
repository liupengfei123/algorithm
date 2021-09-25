package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class DeleteOperationForTwoStringsTest {

    @Test
    public void test1(){
        DeleteOperationForTwoStrings test = new DeleteOperationForTwoStrings();
        Assert.assertEquals(2, test.minDistance("sea", "eat"));
    }

    @Test
    public void test2(){
        DeleteOperationForTwoStrings test = new DeleteOperationForTwoStrings();
        Assert.assertEquals(11, test.minDistance("seaadsfassdfassss", "eatzadfaadfasdssssss"));
    }

    @Test
    public void test3(){
        DeleteOperationForTwoStrings test = new DeleteOperationForTwoStrings();
        Assert.assertEquals(4, test.minDistance("leetcode", "etco"));
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
