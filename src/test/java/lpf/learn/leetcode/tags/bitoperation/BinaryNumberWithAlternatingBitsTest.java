package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class BinaryNumberWithAlternatingBitsTest {

    @Test
    public void test1(){
        BinaryNumberWithAlternatingBits test = new BinaryNumberWithAlternatingBits();
        Assert.assertTrue(test.hasAlternatingBits(5));
    }


    @Test
    public void test2(){
        BinaryNumberWithAlternatingBits test = new BinaryNumberWithAlternatingBits();
        Assert.assertFalse(test.hasAlternatingBits(7));
    }

    @Test
    public void test3(){
        BinaryNumberWithAlternatingBits test = new BinaryNumberWithAlternatingBits();
        Assert.assertFalse(test.hasAlternatingBits(11));
    }

    @Test
    public void test4(){
        BinaryNumberWithAlternatingBits test = new BinaryNumberWithAlternatingBits();
        Assert.assertFalse(test.hasAlternatingBits(123121241));
    }

    @Test
    public void test5(){
        BinaryNumberWithAlternatingBits test = new BinaryNumberWithAlternatingBits();
        Assert.assertTrue(test.hasAlternatingBits(89478485));
    }
}
