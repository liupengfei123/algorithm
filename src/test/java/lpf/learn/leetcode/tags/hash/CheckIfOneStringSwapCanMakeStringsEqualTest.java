package lpf.learn.leetcode.tags.hash;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfOneStringSwapCanMakeStringsEqualTest {
    @Test
    public void test1(){
        CheckIfOneStringSwapCanMakeStringsEqual test = new CheckIfOneStringSwapCanMakeStringsEqual();
        Assert.assertTrue(test.areAlmostEqual("bank", "kanb"));
    }

    @Test
    public void test2(){
        CheckIfOneStringSwapCanMakeStringsEqual test = new CheckIfOneStringSwapCanMakeStringsEqual();
        Assert.assertFalse(test.areAlmostEqual("attack", "defend"));
    }

    @Test
    public void test3(){
        CheckIfOneStringSwapCanMakeStringsEqual test = new CheckIfOneStringSwapCanMakeStringsEqual();
        Assert.assertTrue(test.areAlmostEqual("kelb", "kelb"));
    }

    @Test
    public void test4(){
        CheckIfOneStringSwapCanMakeStringsEqual test = new CheckIfOneStringSwapCanMakeStringsEqual();
        Assert.assertFalse(test.areAlmostEqual("abcd", "dcba"));
    }

    @Test
    public void test5(){
        CheckIfOneStringSwapCanMakeStringsEqual test = new CheckIfOneStringSwapCanMakeStringsEqual();
        Assert.assertFalse(test.areAlmostEqual("aa", "ac"));
    }
}
