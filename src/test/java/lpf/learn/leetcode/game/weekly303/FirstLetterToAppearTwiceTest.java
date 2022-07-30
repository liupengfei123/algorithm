package lpf.learn.leetcode.game.weekly303;

import org.junit.Assert;
import org.junit.Test;

public class FirstLetterToAppearTwiceTest {

    @Test
    public void test1(){
        FirstLetterToAppearTwice test = new FirstLetterToAppearTwice();
        Assert.assertEquals('c', test.repeatedCharacter("abccbaacz"));
    }

    @Test
    public void test2(){
        FirstLetterToAppearTwice test = new FirstLetterToAppearTwice();
        Assert.assertEquals('d', test.repeatedCharacter("abcdd"));
    }
}
