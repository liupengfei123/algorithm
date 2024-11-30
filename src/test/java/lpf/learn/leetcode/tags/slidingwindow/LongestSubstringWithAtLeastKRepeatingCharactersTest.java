package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithAtLeastKRepeatingCharactersTest {
    @Test
    public void test1(){
        System.out.println((int) 'a');
        System.out.println((int) 'A');
        System.out.println((int) 'z' - 'Z');


        LongestSubstringWithAtLeastKRepeatingCharacters test = new LongestSubstringWithAtLeastKRepeatingCharacters();
        Assert.assertEquals(3, test.longestSubstring("aaabb", 3));
    }

    @Test
    public void test2(){
        LongestSubstringWithAtLeastKRepeatingCharacters test = new LongestSubstringWithAtLeastKRepeatingCharacters();
        Assert.assertEquals(3, test.longestSubstring("bbaaacbd", 3));
    }

    @Test
    public void test3(){
        LongestSubstringWithAtLeastKRepeatingCharacters test = new LongestSubstringWithAtLeastKRepeatingCharacters();
        Assert.assertEquals(5, test.longestSubstring("ababbc", 2));
    }

    @Test
    public void test4(){
        LongestSubstringWithAtLeastKRepeatingCharacters test = new LongestSubstringWithAtLeastKRepeatingCharacters();
        Assert.assertEquals(0, test.longestSubstring("ababacb", 3));
    }

    @Test
    public void test5(){
        LongestSubstringWithAtLeastKRepeatingCharacters test = new LongestSubstringWithAtLeastKRepeatingCharacters();
        Assert.assertEquals(0, test.longestSubstring("aabcabb", 3));
    }

    @Test
    public void test6(){
        LongestSubstringWithAtLeastKRepeatingCharacters test = new LongestSubstringWithAtLeastKRepeatingCharacters();
        Assert.assertEquals(52, test.longestSubstring("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz", 2));
    }

}