package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class PalindromicSubstringsTest {
    @Test
    public void test1(){
        PalindromicSubstrings test = new PalindromicSubstrings();
        Assert.assertEquals(3, test.countSubstrings("abc"));
    }

    @Test
    public void test2(){
        PalindromicSubstrings test = new PalindromicSubstrings();
        Assert.assertEquals(6, test.countSubstrings("abcabc"));
    }

    @Test
    public void test3(){
        PalindromicSubstrings test = new PalindromicSubstrings();
        Assert.assertEquals(6, test.countSubstrings("aaa"));
    }

    @Test
    public void test4(){
        PalindromicSubstrings test = new PalindromicSubstrings();
        Assert.assertEquals(0, test.countSubstrings(""));
    }

    @Test
    public void test5(){
        PalindromicSubstrings test = new PalindromicSubstrings();
        Assert.assertEquals(77, test.countSubstrings("dnncbwoneinoplypwgbwktmvkoimcooyiwirgbxlcttgteqthcvyoueyftiwgwwxvxvg"));
    }

    @Test
    public void test6(){
        PalindromicSubstrings test = new PalindromicSubstrings();
        Assert.assertEquals(9, test.countSubstrings("aabaa"));
    }

    @Test
    public void test7(){
        PalindromicSubstrings test = new PalindromicSubstrings();
        Assert.assertEquals(6, test.countSubstrings("vxvx"));
    }

    @Test
    public void test8(){
        PalindromicSubstrings test = new PalindromicSubstrings();
        Assert.assertEquals(9, test.countSubstrings("xvxvx"));
    }
}
