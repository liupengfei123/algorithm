package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class TargetSumTest {

    @Test
    public void test() {
        TargetSum temp = new TargetSum();

        Assert.assertEquals(5, temp.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }


}
