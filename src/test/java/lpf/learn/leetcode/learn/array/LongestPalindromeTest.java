package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {

    @Test
    public void longestPalindromeTest(){
        LongestPalindrome longestPalindrome = new LongestPalindrome();


        Assert.assertEquals("a", longestPalindrome.longestPalindrome("a"));

        Assert.assertEquals("bab", longestPalindrome.longestPalindrome("babad"));

        Assert.assertEquals("bb", longestPalindrome.longestPalindrome("cbbd"));

        Assert.assertEquals("aaaaaaaa", longestPalindrome.longestPalindrome("aaaaaaaa"));

        Assert.assertEquals("aaaabaaaa", longestPalindrome.longestPalindrome("aaaabaaaa"));

        Assert.assertEquals("aa", longestPalindrome.longestPalindrome("aacdefcaa"));
    }
}
