package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class XorQueriesOfASubarrayTest {

    @Test
    public void test1(){
        XorQueriesOfASubarray test = new XorQueriesOfASubarray();
        Assert.assertArrayEquals(new int[]{2,7,14,8}, test.xorQueries(new int[]{1,3,4,8}, new int[][]{{0,1},{1,2},{0,3},{3,3}}));
    }


    @Test
    public void test2(){
        XorQueriesOfASubarray test = new XorQueriesOfASubarray();
        Assert.assertArrayEquals(new int[]{8,0,4,4}, test.xorQueries(new int[]{4,8,2,10}, new int[][]{{2,3},{1,3},{0,0},{0,3}}));
    }
}
