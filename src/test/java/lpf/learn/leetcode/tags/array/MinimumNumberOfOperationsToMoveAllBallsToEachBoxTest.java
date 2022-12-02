package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MinimumNumberOfOperationsToMoveAllBallsToEachBoxTest {

    @Test
    public void test1(){
        MinimumNumberOfOperationsToMoveAllBallsToEachBox test = new MinimumNumberOfOperationsToMoveAllBallsToEachBox();
        Assert.assertArrayEquals(new int[]{11,8,5,4,3,4}, test.minOperations("001011"));
    }

    @Test
    public void test2(){
        MinimumNumberOfOperationsToMoveAllBallsToEachBox test = new MinimumNumberOfOperationsToMoveAllBallsToEachBox();
        Assert.assertArrayEquals(new int[]{1,1,3}, test.minOperations("110"));
    }
}
