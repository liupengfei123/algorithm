package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class WaysToSplitArrayIntoThreeSubarraysTest {
    @Test
    public void test1(){
        WaysToSplitArrayIntoThreeSubarrays test = new WaysToSplitArrayIntoThreeSubarrays();
        Assert.assertEquals(1, test.waysToSplit(new int[]{1,1,1}));
    }

    @Test
    public void test2(){
        WaysToSplitArrayIntoThreeSubarrays test = new WaysToSplitArrayIntoThreeSubarrays();
        Assert.assertEquals(3, test.waysToSplit(new int[]{1,2,2,2,5,0}));
    }

    @Test
    public void test3(){
        WaysToSplitArrayIntoThreeSubarrays test = new WaysToSplitArrayIntoThreeSubarrays();
        Assert.assertEquals(0, test.waysToSplit(new int[]{3,2,1}));
    }

    @Test
    public void test4(){
        WaysToSplitArrayIntoThreeSubarrays test = new WaysToSplitArrayIntoThreeSubarrays();
        Assert.assertEquals(1, test.waysToSplit(new int[]{0,3,3}));
    }

    @Test
    public void test5(){
        WaysToSplitArrayIntoThreeSubarrays test = new WaysToSplitArrayIntoThreeSubarrays();
        Assert.assertEquals(1, test.waysToSplit(new int[]{1,1,1}));
    }

    @Test
    public void test6(){
        WaysToSplitArrayIntoThreeSubarrays test = new WaysToSplitArrayIntoThreeSubarrays();
        Assert.assertEquals(1, test.waysToSplit(new int[]{1,1,1}));
    }

    @Test
    public void test7(){
        WaysToSplitArrayIntoThreeSubarrays test = new WaysToSplitArrayIntoThreeSubarrays();
        Assert.assertEquals(1, test.waysToSplit(new int[]{1,1,1}));
    }

    @Test
    public void test8(){
        WaysToSplitArrayIntoThreeSubarrays test = new WaysToSplitArrayIntoThreeSubarrays();
        Assert.assertEquals(1, test.waysToSplit(new int[]{1,1,1}));
    }
}
