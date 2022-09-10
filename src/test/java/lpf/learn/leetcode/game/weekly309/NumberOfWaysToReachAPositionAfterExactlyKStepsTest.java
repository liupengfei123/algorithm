package lpf.learn.leetcode.game.weekly309;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfWaysToReachAPositionAfterExactlyKStepsTest {
    @Test
    public void test1(){
        NumberOfWaysToReachAPositionAfterExactlyKSteps test = new NumberOfWaysToReachAPositionAfterExactlyKSteps();
        Assert.assertEquals(3, test.numberOfWays(1, 2, 3));
    }

    @Test
    public void test2(){
        NumberOfWaysToReachAPositionAfterExactlyKSteps test = new NumberOfWaysToReachAPositionAfterExactlyKSteps();
        Assert.assertEquals(0, test.numberOfWays(2, 5, 10));
    }
}
