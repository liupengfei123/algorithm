package lpf.learn.leetcode.tags.dp;

import lpf.learn.leetcode.tags.array.MinimumFallingPathSum;
import org.junit.Assert;
import org.junit.Test;

public class MinimumFallingPathSumTest {
    @Test
    public void test1(){
        MinimumFallingPathSum test = new MinimumFallingPathSum();
        Assert.assertEquals(13, test.minFallingPathSum(new int[][]{{2,1,3},{6,5,4},{7,8,9}}));
    }

    @Test
    public void test2(){
        MinimumFallingPathSum test = new MinimumFallingPathSum();
        Assert.assertEquals(-59, test.minFallingPathSum(new int[][]{{-19,57},{-40,-5}}));
    }

    @Test
    public void test3(){
        MinimumFallingPathSum test = new MinimumFallingPathSum();
        Assert.assertEquals(-48, test.minFallingPathSum(new int[][]{{-48}}));
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
