package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class ShortestAndLexicographicallySmallestBeautifulStringTest {
    @Test
    public void test1() {
        ShortestAndLexicographicallySmallestBeautifulString test = new ShortestAndLexicographicallySmallestBeautifulString();
        Assert.assertEquals("11001", test.shortestBeautifulSubstring("100011001",3));
    }

    @Test
    public void test2() {
        ShortestAndLexicographicallySmallestBeautifulString test = new ShortestAndLexicographicallySmallestBeautifulString();
        Assert.assertEquals("11", test.shortestBeautifulSubstring("1011",2));
    }

    @Test
    public void test3() {
        ShortestAndLexicographicallySmallestBeautifulString test = new ShortestAndLexicographicallySmallestBeautifulString();
        Assert.assertEquals("", test.shortestBeautifulSubstring("000",1));
    }

    @Test
    public void test4() {
        ShortestAndLexicographicallySmallestBeautifulString test = new ShortestAndLexicographicallySmallestBeautifulString();
        Assert.assertEquals("11001", test.shortestBeautifulSubstring("100011001",3));
    }
}
