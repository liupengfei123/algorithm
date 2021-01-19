package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class SumOfTwoIntegersTest {

    @Test
    public void test1(){
        SumOfTwoIntegers test = new SumOfTwoIntegers();
        Assert.assertEquals(6, test.getSum(3,3));
    }


    @Test
    public void test2(){
        SumOfTwoIntegers test = new SumOfTwoIntegers();
        Assert.assertEquals(5, test.getSum(5,0));
    }


    @Test
    public void test3(){
        SumOfTwoIntegers test = new SumOfTwoIntegers();
        Assert.assertEquals(4, test.getSum(5,-1));
    }


    @Test
    public void test4(){
        SumOfTwoIntegers test = new SumOfTwoIntegers();
        Assert.assertEquals(0, test.getSum(0,0));
    }

    @Test
    public void test5(){
        SumOfTwoIntegers test = new SumOfTwoIntegers();
        Assert.assertEquals(0, test.getSum(-2147483648,-2147483648));
    }

    @Test
    public void test6(){
        SumOfTwoIntegers test = new SumOfTwoIntegers();
        Assert.assertEquals(-2147483648, test.getSum(2147483647,1));
    }
}
