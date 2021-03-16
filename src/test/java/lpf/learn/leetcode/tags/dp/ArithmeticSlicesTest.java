package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticSlicesTest {
    @Test
    public void test1(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(3, test.numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(6, test.numberOfArithmeticSlices(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test3(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(10, test.numberOfArithmeticSlices(new int[]{1, 2, 3, 4, 5, 6}));
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
