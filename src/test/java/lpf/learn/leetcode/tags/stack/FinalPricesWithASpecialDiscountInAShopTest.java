package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class FinalPricesWithASpecialDiscountInAShopTest {

    @Test
    public void test1(){
        FinalPricesWithASpecialDiscountInAShop test = new FinalPricesWithASpecialDiscountInAShop();
        Assert.assertArrayEquals(new int[]{4,2,4,2,3}, test.finalPrices(new int[]{8,4,6,2,3}));
    }

    @Test
    public void test2(){
        FinalPricesWithASpecialDiscountInAShop test = new FinalPricesWithASpecialDiscountInAShop();
        Assert.assertArrayEquals(new int[]{1,2,3,4,5}, test.finalPrices(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test3(){
        FinalPricesWithASpecialDiscountInAShop test = new FinalPricesWithASpecialDiscountInAShop();
        Assert.assertArrayEquals(new int[]{9,0,1,6}, test.finalPrices(new int[]{10,1,1,6}));
    }
}
