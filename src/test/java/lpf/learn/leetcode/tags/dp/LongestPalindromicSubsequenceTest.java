package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubsequenceTest {
    @Test
    public void test1(){
        LongestPalindromicSubsequence test = new LongestPalindromicSubsequence();
        Assert.assertEquals(4, test.longestPalindromeSubseq("bbbab"));
    }

    @Test
    public void test2(){
        LongestPalindromicSubsequence test = new LongestPalindromicSubsequence();
        Assert.assertEquals(4, test.longestPalindromeSubseq("bbbaba"));
    }

    @Test
    public void test3(){
        LongestPalindromicSubsequence test = new LongestPalindromicSubsequence();
        Assert.assertEquals(1, test.longestPalindromeSubseq("a"));
    }

    @Test
    public void test4(){
        LongestPalindromicSubsequence test = new LongestPalindromicSubsequence();
        Assert.assertEquals(2, test.longestPalindromeSubseq("cbbd"));
    }

    @Test
    public void test5(){
        LongestPalindromicSubsequence test = new LongestPalindromicSubsequence();
        Assert.assertEquals(7, test.longestPalindromeSubseq("asdfadfasdfa"));
    }
}
