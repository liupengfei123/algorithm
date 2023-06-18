package lpf.learn.leetcode.game.biweekly106;

import org.junit.Assert;
import org.junit.Test;

public class FindTheLongestSemiRepetitiveSubstringTest {
    @Test
    public void test1(){
        FindTheLongestSemiRepetitiveSubstring test = new FindTheLongestSemiRepetitiveSubstring();
        Assert.assertEquals(4, test.longestSemiRepetitiveSubstring("52233"));

    }

    @Test
    public void test2(){
        FindTheLongestSemiRepetitiveSubstring test = new FindTheLongestSemiRepetitiveSubstring();
        Assert.assertEquals(4, test.longestSemiRepetitiveSubstring("5494"));

    }

    @Test
    public void test3(){
        FindTheLongestSemiRepetitiveSubstring test = new FindTheLongestSemiRepetitiveSubstring();
        Assert.assertEquals(2, test.longestSemiRepetitiveSubstring("1111111"));
    }

    @Test
    public void test4(){
        FindTheLongestSemiRepetitiveSubstring test = new FindTheLongestSemiRepetitiveSubstring();
        Assert.assertEquals(1, test.longestSemiRepetitiveSubstring("0"));
    }
}
