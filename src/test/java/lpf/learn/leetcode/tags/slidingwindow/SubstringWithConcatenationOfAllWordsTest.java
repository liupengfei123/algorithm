package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class SubstringWithConcatenationOfAllWordsTest {
    @Test
    public void test1() {
        SubstringWithConcatenationOfAllWords test = new SubstringWithConcatenationOfAllWords();
        Assert.assertEquals(Arrays.asList(0, 9), test.findSubstring("barfoothefoobarman", new String[] {"foo", "bar"}));
    }

    @Test
    public void test2() {
        SubstringWithConcatenationOfAllWords test = new SubstringWithConcatenationOfAllWords();
        Assert.assertEquals(Collections.emptyList(), test.findSubstring("wordgoodgoodgoodbestword", new String[] {"word","good","best","word"}));
    }

    @Test
    public void test3() {
        SubstringWithConcatenationOfAllWords test = new SubstringWithConcatenationOfAllWords();
        Assert.assertEquals(Arrays.asList(6,9,12), test.findSubstring("barfoofoobarthefoobarman", new String[] {"bar","foo","the"}));
    }

    @Test
    public void test4() {
        SubstringWithConcatenationOfAllWords test = new SubstringWithConcatenationOfAllWords();
        Assert.assertEquals(Arrays.asList(0, 9), test.findSubstring("barfoothefoobarman", new String[] {"foo", "bar" }));
    }
}
