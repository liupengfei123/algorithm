package lpf.learn.leetcode.tags.dp;

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
}
