package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {
    @Test
    public void test1(){
        PalindromeNumber test = new PalindromeNumber();
        Assert.assertFalse(test.isPalindrome(-10));
    }

    @Test
    public void test2(){
        PalindromeNumber test = new PalindromeNumber();
        Assert.assertFalse(test.isPalindrome(10));
    }

    @Test
    public void test3(){
        PalindromeNumber test = new PalindromeNumber();
        Assert.assertTrue(test.isPalindrome(11));
    }


    @Test
    public void test4(){
        PalindromeNumber test = new PalindromeNumber();
        Assert.assertTrue(test.isPalindrome(121));
    }

    @Test
    public void test5(){
        PalindromeNumber test = new PalindromeNumber();
        Assert.assertTrue(test.isPalindrome(0));
    }
}
