package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class DivisorGameTest {
    @Test
    public void test1(){
        DivisorGame test = new DivisorGame();
        Assert.assertTrue(test.divisorGame(2));
    }

    @Test
    public void test2(){
        DivisorGame test = new DivisorGame();
        Assert.assertFalse(test.divisorGame(3));
    }

    @Test
    public void test3(){
        DivisorGame test = new DivisorGame();
        Assert.assertTrue(test.divisorGame(10));
    }

    @Test
    public void test4(){
        DivisorGame test = new DivisorGame();
        Assert.assertFalse(test.divisorGame(11));
    }

    @Test
    public void test5(){
        DivisorGame test = new DivisorGame();
        Assert.assertFalse(test.divisorGame(21));
    }

    @Test
    public void test6(){
        DivisorGame test = new DivisorGame();
        Assert.assertTrue(test.divisorGame(1000));
    }



}
