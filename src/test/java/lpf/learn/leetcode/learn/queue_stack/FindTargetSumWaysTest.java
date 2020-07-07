package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Assert;
import org.junit.Test;

public class FindTargetSumWaysTest {

    @Test
    public void test() {
        FindTargetSumWays temp = new FindTargetSumWays();

        Assert.assertEquals(5, temp.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));

    }


}
