package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MinimumPathSumTest {
    @Test
    public void test1(){
        MinimumPathSum test = new MinimumPathSum();
        Assert.assertEquals(7, test.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }

    @Test
    public void test2(){
        MinimumPathSum test = new MinimumPathSum();
        Assert.assertEquals(12, test.minPathSum(new int[][]{{1,2,3},{4,5,6}}));
    }
}
