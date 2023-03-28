package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class ShortestCommonSupersequenceTest {
    @Test
    public void test1(){
        ShortestCommonSupersequence test = new ShortestCommonSupersequence();
        Assert.assertEquals("cabac", test.shortestCommonSupersequence("abac", "cab"));
    }

    @Test
    public void test2(){
        ShortestCommonSupersequence test = new ShortestCommonSupersequence();
        Assert.assertEquals("124aA56bDA2cGGAG12dDHD1355e326fGAZZ7g125", test.shortestCommonSupersequence("124a56b2c12d1355e326f7g125", "aAbDAcGGAGdDHDefGAZZg"));
    }

    @Test
    public void test3(){
        ShortestCommonSupersequence test = new ShortestCommonSupersequence();
        Assert.assertEquals("daqabcdfhgzadsfrzaevskkdhffwgaeafbgpihezmuhi",
                test.shortestCommonSupersequence("qabcdfzafrzaewgaeafbgpihzmuhi", "daabcfhgadszevskkdhffgghei"));
    }

    @Test
    public void test4(){
        ShortestCommonSupersequence test = new ShortestCommonSupersequence();
        Assert.assertEquals("bbababbaaba",
                test.shortestCommonSupersequence("bbbaaaba", "bbababbb"));
    }
}
