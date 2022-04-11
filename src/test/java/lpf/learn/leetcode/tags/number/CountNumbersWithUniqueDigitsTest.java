package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class CountNumbersWithUniqueDigitsTest {
    @Test
    public void test1(){
        CountNumbersWithUniqueDigits test = new CountNumbersWithUniqueDigits();
        Assert.assertEquals(1, test.countNumbersWithUniqueDigits(0));
    }

    @Test
    public void test2(){
        CountNumbersWithUniqueDigits test = new CountNumbersWithUniqueDigits();
        Assert.assertEquals(10, test.countNumbersWithUniqueDigits(1));
    }

    @Test
    public void test3(){
        CountNumbersWithUniqueDigits test = new CountNumbersWithUniqueDigits();
        Assert.assertEquals(91, test.countNumbersWithUniqueDigits(2));
    }


    @Test
    public void test4(){
        CountNumbersWithUniqueDigits test = new CountNumbersWithUniqueDigits();
        Assert.assertEquals(739, test.countNumbersWithUniqueDigits(3));
    }

    @Test
    public void test5(){
        CountNumbersWithUniqueDigits test = new CountNumbersWithUniqueDigits();
        Assert.assertEquals(5275, test.countNumbersWithUniqueDigits(4));
    }

    @Test
    public void test6(){
        CountNumbersWithUniqueDigits test = new CountNumbersWithUniqueDigits();
        Assert.assertEquals(32491, test.countNumbersWithUniqueDigits(5));
    }

    @Test
    public void test7(){
        CountNumbersWithUniqueDigits test = new CountNumbersWithUniqueDigits();
        Assert.assertEquals(168571, test.countNumbersWithUniqueDigits(6));
    }

    @Test
    public void test8(){
        CountNumbersWithUniqueDigits test = new CountNumbersWithUniqueDigits();
        Assert.assertEquals(712891, test.countNumbersWithUniqueDigits(7));
    }

    @Test
    public void test9(){
        CountNumbersWithUniqueDigits test = new CountNumbersWithUniqueDigits();
        Assert.assertEquals(2345851, test.countNumbersWithUniqueDigits(8));
    }
}
