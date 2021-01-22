package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class ReverseBitsTest {

    @Test
    public void test1(){
        ReverseBits test = new ReverseBits();
        Assert.assertEquals(-1, test.reverseBits(-1));
    }


    @Test
    public void test2(){
        ReverseBits test = new ReverseBits();
        Assert.assertEquals(-2147483648, test.reverseBits(1));
    }

    @Test
    public void test3(){
        ReverseBits test = new ReverseBits();
        Assert.assertEquals(0, test.reverseBits(0));
    }

    @Test
    public void test4(){
        ReverseBits test = new ReverseBits();
        Assert.assertEquals(1, test.reverseBits(-2147483648));
    }
    @Test
    public void test5(){
        System.out.println(Integer.toBinaryString(-2147483646));
    }

}
