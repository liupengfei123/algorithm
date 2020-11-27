package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsOfAStringTest {
    @Test
    public void test1(){
        ReverseVowelsOfAString test = new ReverseVowelsOfAString();
        Assert.assertEquals("holle", test.reverseVowels("hello"));
    }

    @Test
    public void test2(){
        ReverseVowelsOfAString test = new ReverseVowelsOfAString();
        Assert.assertEquals("leotcede", test.reverseVowels("leetcode"));
    }

    @Test
    public void test3(){
        ReverseVowelsOfAString test = new ReverseVowelsOfAString();
        Assert.assertEquals("a.", test.reverseVowels("a."));
    }

    @Test
    public void test4(){
        ReverseVowelsOfAString test = new ReverseVowelsOfAString();
        Assert.assertEquals("Aa", test.reverseVowels("aA"));
    }
}
