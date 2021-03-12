package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class CoinChangeTest {
    @Test
    public void test1(){
        CoinChange test = new CoinChange();
        Assert.assertEquals(3, test.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void test2(){
        CoinChange test = new CoinChange();
        Assert.assertEquals(4, test.coinChange(new int[]{2, 5}, 11));
    }

    @Test
    public void test3(){
        CoinChange test = new CoinChange();
        Assert.assertEquals(-1, test.coinChange(new int[]{3, 7}, 11));
    }

    @Test
    public void test4(){
        CoinChange test = new CoinChange();
        Assert.assertEquals(-1, test.coinChange(new int[]{2}, 11));
    }

    @Test
    public void test5(){
        CoinChange test = new CoinChange();
        Assert.assertEquals(0, test.coinChange(new int[]{2}, 0));
    }

    @Test
    public void test6(){
        CoinChange test = new CoinChange();
        Assert.assertEquals(3, test.coinChange(new int[]{1}, 3));
    }



}
