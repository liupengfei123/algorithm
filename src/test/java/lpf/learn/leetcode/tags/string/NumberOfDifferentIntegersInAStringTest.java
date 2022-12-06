package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class NumberOfDifferentIntegersInAStringTest {

    @Test
    public void test1() {
        NumberOfDifferentIntegersInAString temp = new NumberOfDifferentIntegersInAString();
        Assert.assertEquals(3, temp.numDifferentIntegers("a123bc34d8ef34"));
    }

    @Test
    public void test2() {
        NumberOfDifferentIntegersInAString temp = new NumberOfDifferentIntegersInAString();
        Assert.assertEquals(2, temp.numDifferentIntegers("leet1234code234"));
    }

    @Test
    public void test3() {
        NumberOfDifferentIntegersInAString temp = new NumberOfDifferentIntegersInAString();
        Assert.assertEquals(1, temp.numDifferentIntegers("a1b01c001"));
    }

    @Test
    public void test4() {
        NumberOfDifferentIntegersInAString temp = new NumberOfDifferentIntegersInAString();
        Assert.assertEquals(1, temp.numDifferentIntegers("0a0"));
    }

    @Test
    public void test5() {
        NumberOfDifferentIntegersInAString temp = new NumberOfDifferentIntegersInAString();
        Assert.assertEquals(0, temp.numDifferentIntegers("u"));
    }
}
