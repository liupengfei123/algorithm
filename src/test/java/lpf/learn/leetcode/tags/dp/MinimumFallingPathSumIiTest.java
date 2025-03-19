package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MinimumFallingPathSumIiTest {
    @Test
    public void test1(){
        MinimumFallingPathSumIi test = new MinimumFallingPathSumIi();
        Assert.assertEquals(13, test.minFallingPathSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    @Test
    public void test2(){
        MinimumFallingPathSumIi test = new MinimumFallingPathSumIi();
        Assert.assertEquals(7, test.minFallingPathSum(new int[][]{{7}}));
    }

}
