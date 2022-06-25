package lpf.learn.leetcode.game.weekly298;

import org.junit.Assert;
import org.junit.Test;

public class GreatestEnglishLetterInUpperAndLowerCaseTest {
    @Test
    public void test1(){
        GreatestEnglishLetterInUpperAndLowerCase test = new GreatestEnglishLetterInUpperAndLowerCase();
        Assert.assertEquals("E", test.greatestLetter("lEeTcOdE"));
    }

    @Test
    public void test2(){
        GreatestEnglishLetterInUpperAndLowerCase test = new GreatestEnglishLetterInUpperAndLowerCase();
        Assert.assertEquals("R", test.greatestLetter("arRAzFif"));
    }

    @Test
    public void test3(){
        GreatestEnglishLetterInUpperAndLowerCase test = new GreatestEnglishLetterInUpperAndLowerCase();
        Assert.assertEquals("", test.greatestLetter("AbCdEfGhIjK"));
    }
}
