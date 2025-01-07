package lpf.learn.leetcode.tags.stack;

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
        Assert.assertEquals(7, test.longestWPI(new int[]{9,9,6,9,6,6,9}));
    }

    @Test
    public void test3(){
        LongestWellPerformingInterval test = new LongestWellPerformingInterval();
        Assert.assertEquals(3, test.longestWPI(new int[]{6,9,6,9,6,6,9}));
    }

    @Test
    public void test4(){
        LongestWellPerformingInterval test = new LongestWellPerformingInterval();
        Assert.assertEquals(10, test.longestWPI(new int[]{6,9,9,6,9,6,9,9,6,9}));
    }

    @Test
    public void test5(){
        LongestWellPerformingInterval test = new LongestWellPerformingInterval();
        Assert.assertEquals(3, test.longestWPI(new int[]{6,9,9}));
    }
}
