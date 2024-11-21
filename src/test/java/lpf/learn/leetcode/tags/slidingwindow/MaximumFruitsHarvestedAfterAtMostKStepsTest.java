package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class MaximumFruitsHarvestedAfterAtMostKStepsTest {

    @Test
    public void test1() {
        MaximumFruitsHarvestedAfterAtMostKSteps temp = new MaximumFruitsHarvestedAfterAtMostKSteps();
        Assert.assertEquals(9, temp.maxTotalFruits(new int[][]{{2,8},{6,3},{8,6}}, 5, 4));
    }

    @Test
    public void test2() {
        MaximumFruitsHarvestedAfterAtMostKSteps temp = new MaximumFruitsHarvestedAfterAtMostKSteps();
        Assert.assertEquals(14, temp.maxTotalFruits(new int[][]{{0,9},{4,1},{5,7},{6,2},{7,4},{10,9}}, 5, 4));
    }

    @Test
    public void test3() {
        MaximumFruitsHarvestedAfterAtMostKSteps temp = new MaximumFruitsHarvestedAfterAtMostKSteps();
        Assert.assertEquals(0, temp.maxTotalFruits(new int[][]{{0,3},{6,4},{8,5}}, 3, 2));
    }

    @Test
    public void test4() {
        MaximumFruitsHarvestedAfterAtMostKSteps temp = new MaximumFruitsHarvestedAfterAtMostKSteps();
        Assert.assertEquals(9, temp.maxTotalFruits(new int[][]{{2,8},{6,3},{8,6}}, 5, 4));
    }

}
