package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsTest {

    @Test
    public void reverseWordsTest(){
        ReverseWordsInAString reverseWords = new ReverseWordsInAString();

        Assert.assertEquals("blue is sky the", reverseWords.reverseWords("the sky is blue"));
        Assert.assertEquals("world! hello", reverseWords.reverseWords("  hello  world!  "));
        Assert.assertEquals("example good a", reverseWords.reverseWords("a good    example"));
        Assert.assertEquals("a", reverseWords.reverseWords("a"));
        Assert.assertEquals("a", reverseWords.reverseWords("   a   "));
        Assert.assertEquals("", reverseWords.reverseWords(""));


    }
}
