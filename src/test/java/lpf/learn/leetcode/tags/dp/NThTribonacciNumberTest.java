package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class NThTribonacciNumberTest {
    @Test
    public void test1(){
        NThTribonacciNumber test = new NThTribonacciNumber();
        Assert.assertEquals(0, test.tribonacci(0));
    }

    @Test
    public void test2(){
        NThTribonacciNumber test = new NThTribonacciNumber();
        Assert.assertEquals(1, test.tribonacci(1));
    }

    @Test
    public void test3(){
        NThTribonacciNumber test = new NThTribonacciNumber();
        Assert.assertEquals(2, test.tribonacci(3));
    }

    @Test
    public void test4(){
        NThTribonacciNumber test = new NThTribonacciNumber();
        Assert.assertEquals(4, test.tribonacci(4));
    }

    @Test
    public void test5(){
        NThTribonacciNumber test = new NThTribonacciNumber();
        Assert.assertEquals(1389537, test.tribonacci(25));
    }

    @Test
    public void test6(){
        NThTribonacciNumber test = new NThTribonacciNumber();
        Assert.assertEquals(2082876103, test.tribonacci(37));
    }



}
