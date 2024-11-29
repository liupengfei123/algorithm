package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class LongestNiceSubarrayTest {
    @Test
    public void test1(){
        LongestNiceSubarray test = new LongestNiceSubarray();
        Assert.assertEquals(3, test.longestNiceSubarray(new int[]{1,3,8,48,10}));
    }


    @Test
    public void test2(){
        LongestNiceSubarray test = new LongestNiceSubarray();
        Assert.assertEquals(1, test.longestNiceSubarray(new int[]{3,1,5,11,13}));
    }
}
