package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfTimesBinaryStringIsPrefixAlignedTest {
    @Test
    public void test1() {
        NumberOfTimesBinaryStringIsPrefixAligned test = new NumberOfTimesBinaryStringIsPrefixAligned();
        Assert.assertEquals(2, test.numTimesAllBlue(new int[]{3,2,4,1,5}));
    }

    @Test
    public void test2() {
        NumberOfTimesBinaryStringIsPrefixAligned test = new NumberOfTimesBinaryStringIsPrefixAligned();
        Assert.assertEquals(4, test.numTimesAllBlue(new int[]{1,2,4,3,5}));
    }

    @Test
    public void test3() {
        NumberOfTimesBinaryStringIsPrefixAligned test = new NumberOfTimesBinaryStringIsPrefixAligned();
        Assert.assertEquals(1, test.numTimesAllBlue(new int[]{4,1,2,3}));
    }

    @Test
    public void test4() {
        NumberOfTimesBinaryStringIsPrefixAligned test = new NumberOfTimesBinaryStringIsPrefixAligned();
        Assert.assertEquals(4, test.numTimesAllBlue(new int[]{1,2,3,4}));
    }
}
