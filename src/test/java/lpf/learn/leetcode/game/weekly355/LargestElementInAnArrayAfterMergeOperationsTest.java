package lpf.learn.leetcode.game.weekly355;

import org.junit.Assert;
import org.junit.Test;

public class LargestElementInAnArrayAfterMergeOperationsTest {
    @Test
    public void test1(){
        LargestElementInAnArrayAfterMergeOperations test = new LargestElementInAnArrayAfterMergeOperations();
        Assert.assertEquals(21, test.maxArrayValue(new int[]{2,3,7,9,3}));
    }

    @Test
    public void test2(){
        LargestElementInAnArrayAfterMergeOperations test = new LargestElementInAnArrayAfterMergeOperations();
        Assert.assertEquals(11, test.maxArrayValue(new int[]{5,3,3}));
    }
}
