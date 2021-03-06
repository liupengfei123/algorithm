package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WordBreakTest {
    @Test
    public void test1(){
        WordBreak test = new WordBreak();
        List<String> wordDict = Arrays.asList("leet", "code");
        Assert.assertTrue(test.wordBreak("leetcode", wordDict));
    }

    @Test
    public void test2(){
        WordBreak test = new WordBreak();
        List<String> wordDict = Arrays.asList("apple", "pen");
        Assert.assertTrue(test.wordBreak("applepenapple", wordDict));
    }

    @Test
    public void test3(){
        WordBreak test = new WordBreak();
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        Assert.assertFalse(test.wordBreak("catsandog", wordDict));
    }

    @Test
    public void test4(){
        WordBreak test = new WordBreak();
        List<String> wordDict = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        Assert.assertFalse(test.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", wordDict));
    }


}
