package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class LongestRepeatingCharacterReplacementTest {
    @Test
    public void test1(){
        LongestRepeatingCharacterReplacement test = new LongestRepeatingCharacterReplacement();
        Assert.assertEquals(4, test.characterReplacement("ABAB", 2));
    }

    @Test
    public void test2(){
        LongestRepeatingCharacterReplacement test = new LongestRepeatingCharacterReplacement();
        Assert.assertEquals(4, test.characterReplacement("AABABBA", 1));
    }

    @Test
    public void test3(){
        LongestRepeatingCharacterReplacement test = new LongestRepeatingCharacterReplacement();
        Assert.assertEquals(5, test.characterReplacement("AABABBA", 2));
    }

    @Test
    public void test4(){
        LongestRepeatingCharacterReplacement test = new LongestRepeatingCharacterReplacement();
        Assert.assertEquals(7, test.characterReplacement("AABABBA", 3));
    }

    @Test
    public void test5(){
        LongestRepeatingCharacterReplacement test = new LongestRepeatingCharacterReplacement();
        Assert.assertEquals(3, test.characterReplacement("ACADBABEBA", 1));
    }

    @Test
    public void test6(){
        LongestRepeatingCharacterReplacement test = new LongestRepeatingCharacterReplacement();
        Assert.assertEquals(5, test.characterReplacement("ACADBABEBA", 2));
    }

    @Test
    public void test7(){
        LongestRepeatingCharacterReplacement test = new LongestRepeatingCharacterReplacement();
        Assert.assertEquals(9, test.characterReplacement("AAABCBEBDBEB", 4));
    }
}
