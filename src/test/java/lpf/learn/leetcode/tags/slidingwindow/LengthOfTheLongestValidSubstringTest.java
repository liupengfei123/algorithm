package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LengthOfTheLongestValidSubstringTest {
    @Test
    public void test1(){
        LengthOfTheLongestValidSubstring test = new LengthOfTheLongestValidSubstring();
        Assert.assertEquals(4, test.longestValidSubstring("cbaaaabc", Arrays.asList("aaa","cb")));
    }

    @Test
    public void test2(){
        LengthOfTheLongestValidSubstring test = new LengthOfTheLongestValidSubstring();
        Assert.assertEquals(4, test.longestValidSubstring("leetcode", Arrays.asList("de","le","e")));
    }


    @Test
    public void test3(){
        LengthOfTheLongestValidSubstring test = new LengthOfTheLongestValidSubstring();
        Assert.assertEquals(4, test.longestValidSubstring("aaaabaaacc", Arrays.asList("bcca","aaa","aabaa","baaac")));
    }
}