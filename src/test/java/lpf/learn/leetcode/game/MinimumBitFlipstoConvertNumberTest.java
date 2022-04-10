package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class MinimumBitFlipstoConvertNumberTest {
    @Test
    public void test1(){
        MinimumBitFlipstoConvertNumber test = new MinimumBitFlipstoConvertNumber();
        Assert.assertEquals(3, test.minBitFlips(10, 7));
    }

    @Test
    public void test2(){
        MinimumBitFlipstoConvertNumber test = new MinimumBitFlipstoConvertNumber();
        Assert.assertEquals(3, test.minBitFlips(3, 4));
    }

    @Test
    public void test3(){
        MinimumBitFlipstoConvertNumber test = new MinimumBitFlipstoConvertNumber();
        Assert.assertEquals(2, test.minBitFlips(3, 10));
    }
}
