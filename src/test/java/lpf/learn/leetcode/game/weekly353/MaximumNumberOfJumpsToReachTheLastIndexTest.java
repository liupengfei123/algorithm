package lpf.learn.leetcode.game.weekly353;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfJumpsToReachTheLastIndexTest {
    @Test
    public void test1(){
        MaximumNumberOfJumpsToReachTheLastIndex test = new MaximumNumberOfJumpsToReachTheLastIndex();
        Assert.assertEquals(3, test.maximumJumps(new int[]{1,3,6,4,1,2}, 2));
    }

    @Test
    public void test2(){
        MaximumNumberOfJumpsToReachTheLastIndex test = new MaximumNumberOfJumpsToReachTheLastIndex();
        Assert.assertEquals(5, test.maximumJumps(new int[]{1,3,6,4,1,2}, 3));
    }

    @Test
    public void test3(){
        MaximumNumberOfJumpsToReachTheLastIndex test = new MaximumNumberOfJumpsToReachTheLastIndex();
        Assert.assertEquals(-1, test.maximumJumps(new int[]{1,3,6,4,1,2}, 0));
    }
}
