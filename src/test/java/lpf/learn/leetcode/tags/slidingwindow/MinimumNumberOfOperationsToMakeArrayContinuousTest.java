package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MinimumNumberOfOperationsToMakeArrayContinuousTest {
    @Test
    public void test1() {
        MinimumNumberOfOperationsToMakeArrayContinuous test = new MinimumNumberOfOperationsToMakeArrayContinuous();
        Assert.assertEquals(0, test.minOperations(new int[]{4,2,5,3}));
    }

    @Test
    public void test2() {
        MinimumNumberOfOperationsToMakeArrayContinuous test = new MinimumNumberOfOperationsToMakeArrayContinuous();
        Assert.assertEquals(1, test.minOperations(new int[]{1,2,3,5,6}));
    }

    @Test
    public void test3() {
        MinimumNumberOfOperationsToMakeArrayContinuous test = new MinimumNumberOfOperationsToMakeArrayContinuous();
        Assert.assertEquals(3, test.minOperations(new int[]{1,10,100,1000}));
    }

    @Test
    public void test4() {
        MinimumNumberOfOperationsToMakeArrayContinuous test = new MinimumNumberOfOperationsToMakeArrayContinuous();
        Assert.assertEquals(1, test.minOperations(new int[]{1,3,4,5,6,9}));
    }

    @Test
    public void test5() {
        MinimumNumberOfOperationsToMakeArrayContinuous test = new MinimumNumberOfOperationsToMakeArrayContinuous();
        Assert.assertEquals(2, test.minOperations(new int[]{1,3,4,5,8,9,10,15}));
    }

    @Test
    public void test6() {
        MinimumNumberOfOperationsToMakeArrayContinuous test = new MinimumNumberOfOperationsToMakeArrayContinuous();
        Assert.assertEquals(6, test.minOperations(new int[]{1,1,1,1,3,3,3,3}));
    }
}
