package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfOccurrencesOfASubstringTest {
    @Test
    public void test1() {
        MaximumNumberOfOccurrencesOfASubstring test = new MaximumNumberOfOccurrencesOfASubstring();
        Assert.assertEquals(2, test.maxFreq("aababcaab", 2,3,4));
    }

    @Test
    public void test2() {
        MaximumNumberOfOccurrencesOfASubstring test = new MaximumNumberOfOccurrencesOfASubstring();
        Assert.assertEquals(2, test.maxFreq("aaaa", 1,3,3));
    }

    @Test
    public void test3() {
        MaximumNumberOfOccurrencesOfASubstring test = new MaximumNumberOfOccurrencesOfASubstring();
        Assert.assertEquals(3, test.maxFreq("aabcabcab", 2,2,3));
    }

    @Test
    public void test4() {
        MaximumNumberOfOccurrencesOfASubstring test = new MaximumNumberOfOccurrencesOfASubstring();
        Assert.assertEquals(0, test.maxFreq("abcde", 2,3,3));
    }
}
