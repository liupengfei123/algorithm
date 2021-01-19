package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class NumberOf1BitsTest {

    @Test
    public void test1(){
        NumberOf1Bits test = new NumberOf1Bits();
        Assert.assertEquals(2, test.hammingWeight(3));
    }


    @Test
    public void test2(){
        NumberOf1Bits test = new NumberOf1Bits();
        Assert.assertEquals(3, test.hammingWeight(11));
    }


    @Test
    public void test3(){
        NumberOf1Bits test = new NumberOf1Bits();
        Assert.assertEquals(1, test.hammingWeight(8));
    }


    @Test
    public void test4(){
        NumberOf1Bits test = new NumberOf1Bits();
        Assert.assertEquals(1, test.hammingWeight(128));
    }

    @Test
    public void test5(){
        NumberOf1Bits test = new NumberOf1Bits();
        Assert.assertEquals(31, test.hammingWeight(-3));
    }
}
