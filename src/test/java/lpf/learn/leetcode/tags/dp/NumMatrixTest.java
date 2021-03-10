package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class NumMatrixTest {
    @Test
    public void test1(){
        NumMatrix test = new NumMatrix(new int[][]{{3, 0, 1, 4, 2},{5, 6, 3, 2, 1},{1, 2, 0, 1, 5},{4, 1, 0, 1, 7},{1, 0, 3, 0, 5}});

        Assert.assertEquals(8, test.sumRegion(2, 1, 4, 3));
        Assert.assertEquals(11, test.sumRegion(1, 1, 2, 2));
        Assert.assertEquals(12, test.sumRegion(1, 2, 2, 4));

        Assert.assertEquals(14, test.sumRegion(0, 0, 1, 1));
        Assert.assertEquals(14, test.sumRegion(1, 0, 2, 1));
        Assert.assertEquals(16, test.sumRegion(0, 1, 1, 3));
    }

    @Test
    public void test2(){
        NumMatrix test = new NumMatrix(new int[][]{{}});

    }
    @Test
    public void test3(){
        NumMatrix test = new NumMatrix(new int[][]{});

    }
}
