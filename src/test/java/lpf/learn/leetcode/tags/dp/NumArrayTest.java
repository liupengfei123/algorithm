package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class NumArrayTest {
    @Test
    public void test1(){
        NumArray test = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});

        Assert.assertEquals(1, test.sumRange(0, 2));
        Assert.assertEquals(-1, test.sumRange(2, 5));
        Assert.assertEquals(-3, test.sumRange(0, 5));
    }
}
