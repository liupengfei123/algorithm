package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfAStringContainsAllBinaryCodesOfSizeKTest {
    @Test
    public void test1() {
        CheckIfAStringContainsAllBinaryCodesOfSizeK test = new CheckIfAStringContainsAllBinaryCodesOfSizeK();
        Assert.assertTrue(test.hasAllCodes("00110110", 2));
    }

    @Test
    public void test2() {
        CheckIfAStringContainsAllBinaryCodesOfSizeK test = new CheckIfAStringContainsAllBinaryCodesOfSizeK();
        Assert.assertTrue(test.hasAllCodes("0110", 1));
    }

    @Test
    public void test3() {
        CheckIfAStringContainsAllBinaryCodesOfSizeK test = new CheckIfAStringContainsAllBinaryCodesOfSizeK();
        Assert.assertFalse(test.hasAllCodes("0110", 2));
    }

    @Test
    public void test4() {
        CheckIfAStringContainsAllBinaryCodesOfSizeK test = new CheckIfAStringContainsAllBinaryCodesOfSizeK();
        Assert.assertFalse(test.hasAllCodes("0", 20));
    }
}
