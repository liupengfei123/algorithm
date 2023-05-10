package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class SmallestIntegerDivisibleByKTest {
    @Test
    public void test1(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(1, test.smallestRepunitDivByK(1));
    }

    @Test
    public void test2(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(-1, test.smallestRepunitDivByK(2));
    }

    @Test
    public void test3(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(3, test.smallestRepunitDivByK(3));
    }


    @Test
    public void test4(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(-1, test.smallestRepunitDivByK(1002));
    }

    @Test
    public void test5(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(-1, test.smallestRepunitDivByK(10));
    }

    @Test
    public void test6(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(9, test.smallestRepunitDivByK(9));
    }

    @Test
    public void test7(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(27, test.smallestRepunitDivByK(27));
    }
    @Test
    public void test8(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(2, test.smallestRepunitDivByK(11));
    }    @Test
    public void test9(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(6, test.smallestRepunitDivByK(77));
    }
    @Test
    public void test10(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(16, test.smallestRepunitDivByK(17));
    }

    @Test
    public void test11(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(41, test.smallestRepunitDivByK(1231));
    }

    @Test
    public void test12(){
        SmallestIntegerDivisibleByK test = new SmallestIntegerDivisibleByK();
        Assert.assertEquals(-1, test.smallestRepunitDivByK(5));
    }
}
