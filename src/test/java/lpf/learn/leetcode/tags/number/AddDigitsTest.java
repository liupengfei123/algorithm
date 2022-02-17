package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class AddDigitsTest {
    @Test
    public void test1(){
        AddDigits test = new AddDigits();
        Assert.assertEquals(2, test.addDigits(38));
    }

    @Test
    public void test2(){
        AddDigits test = new AddDigits();
        Assert.assertEquals(0, test.addDigits(0));
    }

    @Test
    public void test3(){
        AddDigits test = new AddDigits();
        Assert.assertEquals(2, test.addDigits(38));
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
