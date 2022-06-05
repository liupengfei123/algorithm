package lpf.learn.leetcode.game.weekly296;

import org.junit.Assert;
import org.junit.Test;

public class MinMaxGameTest {
    @Test
    public void test1(){
        MinMaxGame test = new MinMaxGame();
        Assert.assertEquals(1, test.minMaxGame(new int[]{1,3,5,2,4,8,2,2}));
    }
    @Test
    public void test2(){
        MinMaxGame test = new MinMaxGame();
        Assert.assertEquals(3, test.minMaxGame(new int[]{3}));
    }

    @Test
    public void test3(){
        MinMaxGame test = new MinMaxGame();
        Assert.assertEquals(40, test.minMaxGame(new int[]{93, 40}));
    }
}
