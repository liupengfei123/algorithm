package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticSlicesIiSubsequenceTest {
    @Test
    public void test1(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(3, test.numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(7, test.numberOfArithmeticSlices(new int[]{2, 4, 6, 8, 10}));
    }

    @Test
    public void test3(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(12, test.numberOfArithmeticSlices(new int[]{2, 4, 4, 6, 8, 10}));
    }

    @Test
    public void test4(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(5, test.numberOfArithmeticSlices(new int[]{1,3,-1,5,-5,9,-9}));
    }

    @Test
    public void test5(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(0, test.numberOfArithmeticSlices(new int[]{-231, 0, 230}));
    }

    @Test
    public void test6(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(1, test.numberOfArithmeticSlices(new int[]{-230, 0, 230}));
    }

    @Test
    public void test7(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(6, test.numberOfArithmeticSlices(new int[]{2, 4, 4, 6, 8}));
    }

    @Test
    public void test8(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(5, test.numberOfArithmeticSlices(new int[]{7,7,7,7}));
    }

    @Test
    public void test9(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(16, test.numberOfArithmeticSlices(new int[]{7,7,7,7,7}));
    }
}
