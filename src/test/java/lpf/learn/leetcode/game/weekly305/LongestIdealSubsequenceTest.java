package lpf.learn.leetcode.game.weekly305;

import org.junit.Assert;
import org.junit.Test;

public class LongestIdealSubsequenceTest {
    @Test
    public void test1(){
        LongestIdealSubsequence test = new LongestIdealSubsequence();
        Assert.assertEquals(4, test.longestIdealString("acfgbd", 2));
    }
}
