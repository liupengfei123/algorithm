package lpf.learn.leetcode.tags.stack;

import org.junit.Assert;
import org.junit.Test;

public class LongestWellPerformingIntervalTest {

    @Test
    public void test(){
        LongestWellPerformingInterval test = new LongestWellPerformingInterval();

        Assert.assertEquals(3, test.longestWPI(new int[]{9,9,6,0,6,6,9}));

        Assert.assertEquals(7, test.longestWPI(new int[]{9,9,6,9,6,6,9}));

        Assert.assertEquals(3, test.longestWPI(new int[]{6,9,6,9,6,6,9}));


        Assert.assertEquals(10, test.longestWPI(new int[]{6,9,9,6,9,6,9,9,6,9}));

        Assert.assertEquals(3, test.longestWPI(new int[]{6,9,9}));


    }
}
