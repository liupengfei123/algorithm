package lpf.learn.leetcode.game.weekly345;

import org.junit.Assert;
import org.junit.Test;

public class FindTheLosersOfTheCircularGameTest {
    @Test
    public void test1(){
        FindTheLosersOfTheCircularGame test = new FindTheLosersOfTheCircularGame();
        Assert.assertArrayEquals(new int[]{4, 5}, test.circularGameLosers(5, 2));
    }

    @Test
    public void test2(){
        FindTheLosersOfTheCircularGame test = new FindTheLosersOfTheCircularGame();
        Assert.assertArrayEquals(new int[]{2, 3, 4}, test.circularGameLosers(4, 4));
    }
}
