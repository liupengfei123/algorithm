package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class LongestIncreasingSubsequenceTest {
    @Test
    public void test1(){
        LongestIncreasingSubsequence test = new LongestIncreasingSubsequence();
        Assert.assertEquals(4, test.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

    @Test
    public void test2(){
        LongestIncreasingSubsequence test = new LongestIncreasingSubsequence();
        Assert.assertEquals(4, test.lengthOfLIS(new int[]{0,1,0,3,2,3}));
    }

    @Test
    public void test3(){
        LongestIncreasingSubsequence test = new LongestIncreasingSubsequence();
        Assert.assertEquals(1, test.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }

    @Test
    public void test4(){
        LongestIncreasingSubsequence test = new LongestIncreasingSubsequence();
        Assert.assertEquals(6, test.lengthOfLIS(new int[]{  1,3,6,7,9,4,10,5,6}));
    }




}
