package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class SumOfSquareNumbersTest {
    @Test
    public void test1(){
        SumOfSquareNumbers test = new SumOfSquareNumbers();
        Assert.assertTrue(test.judgeSquareSum(5));
    }

    @Test
    public void test2(){
        SumOfSquareNumbers test = new SumOfSquareNumbers();
        Assert.assertFalse(test.judgeSquareSum(3));
    }

    @Test
    public void test3(){
        SumOfSquareNumbers test = new SumOfSquareNumbers();
        Assert.assertFalse(test.judgeSquareSum(1039135141));
    }

    @Test
    public void test4(){
        SumOfSquareNumbers test = new SumOfSquareNumbers();
        Assert.assertFalse(test.judgeSquareSum(163343));
    }
    @Test
    public void test5(){
        SumOfSquareNumbers test = new SumOfSquareNumbers();
        Assert.assertFalse(test.judgeSquareSum(123451231));
    }

}
