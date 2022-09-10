package lpf.learn.leetcode.game.weekly309;

import org.junit.Assert;
import org.junit.Test;

public class CheckDistancesBetweenSameLettersTest {
    @Test
    public void test1(){
        CheckDistancesBetweenSameLetters test = new CheckDistancesBetweenSameLetters();
        Assert.assertTrue(test.checkDistances("abaccb", new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }


    @Test
    public void test2(){
        CheckDistancesBetweenSameLetters test = new CheckDistancesBetweenSameLetters();
        Assert.assertFalse(test.checkDistances("aa", new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }

}
