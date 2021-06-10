package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class CoinChange2Test {
    @Test
    public void test1(){
        CoinChange2 test = new CoinChange2();
        Assert.assertEquals(6, test.change(5, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2(){
        CoinChange2 test = new CoinChange2();
        Assert.assertEquals(4, test.change(5, new int[]{1, 2, 5}));
    }

    @Test
    public void test3(){
        CoinChange2 test = new CoinChange2();
        Assert.assertEquals(0, test.change(2, new int[]{3}));
    }

    @Test
    public void test4(){
        CoinChange2 test = new CoinChange2();
        Assert.assertEquals(1, test.change(10, new int[]{10}));
    }

    @Test
    public void test5(){
        CoinChange2 test = new CoinChange2();
        Assert.assertEquals(1, test.change(0, new int[]{1}));
    }

    @Test
    public void test6(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(0, test.numberOfArithmeticSlices(new int[]{1, 1, 2, 5, 7}));
    }



}
