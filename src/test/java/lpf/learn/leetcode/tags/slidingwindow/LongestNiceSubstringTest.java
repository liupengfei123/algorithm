package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class LongestNiceSubstringTest {
    @Test
    public void test1(){
        LongestNiceSubstring test = new LongestNiceSubstring();
        Assert.assertEquals("aAa", test.longestNiceSubstring("YazaAay"));
    }

    @Test
    public void test2(){
        LongestNiceSubstring test = new LongestNiceSubstring();
        Assert.assertEquals("Bb", test.longestNiceSubstring("Bb"));
    }


    @Test
    public void test3(){
        LongestNiceSubstring test = new LongestNiceSubstring();
        Assert.assertEquals("", test.longestNiceSubstring("c"));
    }

    @Test
    public void test4(){
        LongestNiceSubstring test = new LongestNiceSubstring();
        Assert.assertEquals("Aaa", test.longestNiceSubstring("FbAaabGzerB"));
    }

    @Test
    public void test5(){
        LongestNiceSubstring test = new LongestNiceSubstring();
        Assert.assertEquals("cChH", test.longestNiceSubstring("cChH"));
    }

}