package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class LongestTurbulentSubarrayTest {
    @Test
    public void test1(){
        LongestTurbulentSubarray test = new LongestTurbulentSubarray();
        Assert.assertEquals(2, test.maxTurbulenceSize(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2(){
        LongestTurbulentSubarray test = new LongestTurbulentSubarray();
        Assert.assertEquals(5, test.maxTurbulenceSize(new int[]{9,4,2,10,7,8,8,1,9}));
    }

    @Test
    public void test3(){
        LongestTurbulentSubarray test = new LongestTurbulentSubarray();
        Assert.assertEquals(1, test.maxTurbulenceSize(new int[]{100}));
    }

    @Test
    public void test4(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(11, test.numberOfArithmeticSlices(new int[]{1, 2, 3, 4, 5, 6, 8, 10}));
    }

    @Test
    public void test5(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(3, test.numberOfArithmeticSlices(new int[]{7, 7, 7, 7}));
    }

    @Test
    public void test6(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(0, test.numberOfArithmeticSlices(new int[]{1, 1, 2, 5, 7}));
    }



}
