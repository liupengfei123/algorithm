package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MaximumLengthOfPairChainTest {
    @Test
    public void test1(){
        MaximumLengthOfPairChain test = new MaximumLengthOfPairChain();
        Assert.assertEquals(2, test.findLongestChain(new int[][]{{1,2}, {2,3}, {3,4}}));
    }

    @Test
    public void test2(){
        MaximumLengthOfPairChain test = new MaximumLengthOfPairChain();
        Assert.assertEquals(1, test.findLongestChain(new int[][]{{1,2}, {2,3}}));
    }

    @Test
    public void test3(){
        MaximumLengthOfPairChain test = new MaximumLengthOfPairChain();
        Assert.assertEquals(5, test.findLongestChain(new int[][]{{1,2}, {2,3}, {3,4}, {5,6}, {7,14}, {8,9}, {10,12}}));
    }




}
