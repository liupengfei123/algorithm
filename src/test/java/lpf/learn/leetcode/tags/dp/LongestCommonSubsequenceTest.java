package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonSubsequenceTest {
    @Test
    public void test1(){
        LongestCommonSubsequence test = new LongestCommonSubsequence();
        Assert.assertEquals(3, test.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    public void test2(){
        LongestCommonSubsequence test = new LongestCommonSubsequence();
        Assert.assertEquals(3, test.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    public void test3(){
        LongestCommonSubsequence test = new LongestCommonSubsequence();
        Assert.assertEquals(0, test.longestCommonSubsequence("abc", "def"));
    }

    @Test
    public void test4(){
        LongestCommonSubsequence test = new LongestCommonSubsequence();
        Assert.assertEquals(1, test.longestCommonSubsequence("bsbininm", "jmjkbkjkv"));
    }


}
