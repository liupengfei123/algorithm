package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class RotateFunctionTest {
    @Test
    public void test1(){
        RotateFunction test = new RotateFunction();
        Assert.assertEquals(26, test.maxRotateFunction(new int[]{4,3,2,6}));
    }

    @Test
    public void test2(){
        RotateFunction test = new RotateFunction();
        Assert.assertEquals(0, test.maxRotateFunction(new int[]{100}));
    }

    @Test
    public void test3(){
        RotateFunction test = new RotateFunction();
        Assert.assertEquals(0, test.maxRotateFunction(new int[]{-100}));
    }

    @Test
    public void test4(){
        RotateFunction test = new RotateFunction();
        Assert.assertEquals(188, test.maxRotateFunction(new int[]{1, 2, 3, 4, 5, 6, 8, 10}));
    }

    @Test
    public void test5(){
        RotateFunction test = new RotateFunction();
        Assert.assertEquals(115, test.maxRotateFunction(new int[]{1, 2, 3, -4, 5, 6, 8, -10}));
    }

    @Test
    public void test6(){
        RotateFunction test = new RotateFunction();
        Assert.assertEquals(42, test.maxRotateFunction(new int[]{7, 7, 7, 7}));
    }
}
