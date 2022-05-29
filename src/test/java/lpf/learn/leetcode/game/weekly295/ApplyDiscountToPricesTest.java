package lpf.learn.leetcode.game.weekly295;

import org.junit.Assert;
import org.junit.Test;

public class ApplyDiscountToPricesTest {

    @Test
    public void test1(){
        ApplyDiscountToPrices test = new ApplyDiscountToPrices();
        Assert.assertEquals("there are $0.50 $1.00 and 5$ candies in the shop",
                test.discountPrices("there are $1 $2 and 5$ candies in the shop", 50));
    }

    @Test
    public void test2(){
        ApplyDiscountToPrices test = new ApplyDiscountToPrices();
        Assert.assertEquals("1 2 $0.00 4 $0.00 $0.00 7 8$ $0.00 $10$",
                test.discountPrices("1 2 $3 4 $5 $6 7 8$ $9 $10$", 100));
    }

    @Test
    public void test3(){
        ApplyDiscountToPrices test = new ApplyDiscountToPrices();
        Assert.assertEquals("ka3caz4837h6ada4 r1 $547.82",
                test.discountPrices("ka3caz4837h6ada4 r1 $602", 9));
    }

    @Test
    public void test4(){
        ApplyDiscountToPrices test = new ApplyDiscountToPrices();
        Assert.assertEquals("$39577.72 ab $3.12 $",
                test.discountPrices("$76111 ab $6 $", 48));
    }
}
