package lpf.learn.leetcode.learn.hash;


import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test1(){
        LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
        Assert.assertEquals(2, test.lengthOfLongestSubstring("aAAbbbb"));
    }

    @Test
    public void test2(){
        LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
        Assert.assertEquals(3, test.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test3(){
        LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
        Assert.assertEquals(1, test.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test4(){
        LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
        Assert.assertEquals(3, test.lengthOfLongestSubstring("pwwkew"));
    }
}
