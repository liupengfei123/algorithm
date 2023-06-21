package lpf.learn.leetcode.game.weekly349;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSumQueriesTest {
    @Test
    public void test1(){
        MaximumSumQueries test = new MaximumSumQueries();
        Assert.assertArrayEquals(new int[]{6,10,7}, test.maximumSumQueries(new int[]{4,3,1,2}, new int[]{2,4,9,5}, new int[][]{{4,1},{1,3},{2,5}}));
    }

    @Test
    public void test2(){
        MaximumSumQueries test = new MaximumSumQueries();
        Assert.assertArrayEquals(new int[]{9,9,9}, test.maximumSumQueries(new int[]{3,2,5}, new int[]{2,3,4}, new int[][]{{4,4},{3,2},{1,1}}));
    }

    @Test
    public void test3(){
        MaximumSumQueries test = new MaximumSumQueries();
        Assert.assertArrayEquals(new int[]{-1}, test.maximumSumQueries(new int[]{2,1}, new int[]{2,3}, new int[][]{{3,3}}));
    }

    @Test
    public void test4(){
        MaximumSumQueries test = new MaximumSumQueries();
        Assert.assertArrayEquals(new int[]{132}, test.maximumSumQueries(new int[]{72,44}, new int[]{60,86}, new int[][]{{33,14}}));
    }
}