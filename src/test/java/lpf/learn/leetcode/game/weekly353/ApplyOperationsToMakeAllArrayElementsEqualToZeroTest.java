package lpf.learn.leetcode.game.weekly353;

import org.junit.Assert;
import org.junit.Test;

public class ApplyOperationsToMakeAllArrayElementsEqualToZeroTest {
    @Test
    public void test1(){
        ApplyOperationsToMakeAllArrayElementsEqualToZero test = new ApplyOperationsToMakeAllArrayElementsEqualToZero();
        Assert.assertTrue(test.checkArray(new int[]{2, 2, 3, 1, 1, 0}, 3));
    }

    @Test
    public void test2(){
        ApplyOperationsToMakeAllArrayElementsEqualToZero test = new ApplyOperationsToMakeAllArrayElementsEqualToZero();
        Assert.assertFalse(test.checkArray(new int[]{1, 3, 1, 1}, 2));
    }

}
