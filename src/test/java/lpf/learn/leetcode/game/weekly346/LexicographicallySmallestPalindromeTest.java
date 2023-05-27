package lpf.learn.leetcode.game.weekly346;

import org.junit.Assert;
import org.junit.Test;

public class LexicographicallySmallestPalindromeTest {
    @Test
    public void test1(){
        LexicographicallySmallestPalindrome test = new LexicographicallySmallestPalindrome();
        Assert.assertEquals("efcfe", test.makeSmallestPalindrome("egcfe"));
    }

    @Test
    public void test2(){
        LexicographicallySmallestPalindrome test = new LexicographicallySmallestPalindrome();
        Assert.assertEquals("abba", test.makeSmallestPalindrome("abcd"));
    }

    @Test
    public void test3(){
        LexicographicallySmallestPalindrome test = new LexicographicallySmallestPalindrome();
        Assert.assertEquals("neven", test.makeSmallestPalindrome("seven"));
    }
}
