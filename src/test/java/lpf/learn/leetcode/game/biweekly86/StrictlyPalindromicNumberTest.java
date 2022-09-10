package lpf.learn.leetcode.game.biweekly86;

import org.junit.Assert;
import org.junit.Test;

public class StrictlyPalindromicNumberTest {
    @Test
    public void test1(){
        StrictlyPalindromicNumber test = new StrictlyPalindromicNumber();
        Assert.assertFalse(test.isStrictlyPalindromic(8));
    }

    @Test
    public void test2(){
        StrictlyPalindromicNumber test = new StrictlyPalindromicNumber();
        Assert.assertFalse(test.isStrictlyPalindromic(1000));
    }

    @Test
    public void test3(){
        StrictlyPalindromicNumber test = new StrictlyPalindromicNumber();
        Assert.assertFalse(test.isStrictlyPalindromic(161318));
    }
}
