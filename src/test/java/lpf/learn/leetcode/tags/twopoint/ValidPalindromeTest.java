package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {
    @Test
    public void test1(){
        ValidPalindrome test = new ValidPalindrome();
        Assert.assertTrue(test.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void test2(){
        ValidPalindrome test = new ValidPalindrome();
        Assert.assertFalse(test.isPalindrome("race a car"));
    }


    @Test
    public void test3(){
        ValidPalindrome test = new ValidPalindrome();
        Assert.assertTrue(test.isPalindrome("ab_a"));
    }
}
