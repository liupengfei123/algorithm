package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class LongestWellPerformingIntervalTest {
    @Test
    public void test1(){
        LongestWellPerformingInterval test = new LongestWellPerformingInterval();
        Assert.assertEquals(3, test.longestWPI(new int[]{9,9,6,0,6,6,9}));
    }

    @Test
    public void test2(){
        LongestWellPerformingInterval test = new LongestWellPerformingInterval();
        Assert.assertEquals(0, test.longestWPI(new int[]{6,6,6}));
    }

    @Test
    public void test3(){
        LongestWellPerformingInterval test = new LongestWellPerformingInterval();
        Assert.assertEquals(3, test.longestWPI(new int[]{6,9,9}));
    }

    @Test
    public void test4(){
        LongestWellPerformingInterval test = new LongestWellPerformingInterval();
        Assert.assertEquals(1, test.longestWPI(new int[]{6,6,9}));
    }

    @Test
    public void test5(){
        LongestWellPerformingInterval test = new LongestWellPerformingInterval();
        Assert.assertEquals(5, test.longestWPI(new int[]{6,6,5,9,2,4,9,9,6,7,2}));
    }
}
