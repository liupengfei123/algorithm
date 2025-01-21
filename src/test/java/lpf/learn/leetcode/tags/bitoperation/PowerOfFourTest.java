package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfFourTest {

    @Test
    public void test1(){
        PowerOfFour test = new PowerOfFour();
        Assert.assertFalse(test.isPowerOfFour(-1));
    }


    @Test
    public void test2(){
        PowerOfFour test = new PowerOfFour();
        Assert.assertTrue(test.isPowerOfFour(1));
    }

    @Test
    public void test3(){
        PowerOfFour test = new PowerOfFour();
        Assert.assertTrue(test.isPowerOfFour(1073741824));
    }

    @Test
    public void test4(){
        PowerOfFour test = new PowerOfFour();
        Assert.assertTrue(test.isPowerOfFour(16));
    }

    @Test
    public void test5(){
        PowerOfFour test = new PowerOfFour();
        Assert.assertTrue(test.isPowerOfFour(16777216));
    }

    @Test
    public void test6(){
        PowerOfFour test = new PowerOfFour();
        Assert.assertFalse(test.isPowerOfFour(5));
    }
}
