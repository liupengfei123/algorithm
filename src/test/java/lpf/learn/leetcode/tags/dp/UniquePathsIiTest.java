package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class UniquePathsIiTest {
    @Test
    public void test1(){
        UniquePathsIi test = new UniquePathsIi();
        Assert.assertEquals(2, test.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }

    @Test
    public void test2(){
        UniquePathsIi test = new UniquePathsIi();
        Assert.assertEquals(1, test.uniquePathsWithObstacles(new int[][]{{0,1},{0,0}}));
    }

    @Test
    public void test3(){
        UniquePathsIi test = new UniquePathsIi();
        Assert.assertEquals(2, test.uniquePathsWithObstacles(new int[][]{{0,1,0,1,0},{0,0,0,0,1},{0,1,0,0,0},{0,0,1,1,0},{0,1,0,0,0}}));
    }
}
