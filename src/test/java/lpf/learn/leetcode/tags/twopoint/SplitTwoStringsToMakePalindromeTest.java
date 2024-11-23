package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class SplitTwoStringsToMakePalindromeTest {

    @Test
    public void test1() {
        SplitTwoStringsToMakePalindrome temp = new SplitTwoStringsToMakePalindrome();
        Assert.assertTrue(temp.checkPalindromeFormation("x", "y"));
    }

    @Test
    public void test2() {
        SplitTwoStringsToMakePalindrome temp = new SplitTwoStringsToMakePalindrome();
        Assert.assertFalse(temp.checkPalindromeFormation("xbdef", "xecab"));
    }

    @Test
    public void test3() {
        SplitTwoStringsToMakePalindrome temp = new SplitTwoStringsToMakePalindrome();
        Assert.assertTrue(temp.checkPalindromeFormation("ulacfd", "jizalu"));
    }

    @Test
    public void test4() {
        SplitTwoStringsToMakePalindrome temp = new SplitTwoStringsToMakePalindrome();
        Assert.assertTrue(temp.checkPalindromeFormation("abdef", "fecab"));
    }

    @Test
    public void test5() {
        SplitTwoStringsToMakePalindrome temp = new SplitTwoStringsToMakePalindrome();
        Assert.assertTrue(temp.checkPalindromeFormation("pvhmupgqeltozftlmfjjde", "yjgpzbezspnnpszebzmhvp"));
    }
    @Test
    public void test6() {
        SplitTwoStringsToMakePalindrome temp = new SplitTwoStringsToMakePalindrome();
        Assert.assertFalse(temp.checkPalindromeFormation("abda", "acmc"));
    }

    @Test
    public void test7() {
        SplitTwoStringsToMakePalindrome temp = new SplitTwoStringsToMakePalindrome();
        Assert.assertTrue(temp.checkPalindromeFormation("aaaa", "acmc"));
    }
}
