package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 */
public class GuessNumberHigherOrLowerTest {
    @Test
    public void test1(){
        GuessNumberHigherOrLower test = new GuessNumberHigherOrLower();
        test.setPick(2);
        Assert.assertEquals(2, test.guessNumber(2));
    }

    @Test
    public void test2(){
        GuessNumberHigherOrLower test = new GuessNumberHigherOrLower();
        test.setPick(1);
        Assert.assertEquals(1, test.guessNumber(1));
    }

    @Test
    public void test3(){
        GuessNumberHigherOrLower test = new GuessNumberHigherOrLower();
        test.setPick(1);
        Assert.assertEquals(1, test.guessNumber(2));
    }

    @Test
    public void test4(){
        GuessNumberHigherOrLower test = new GuessNumberHigherOrLower();
        test.setPick(6);
        Assert.assertEquals(6, test.guessNumber(10));
    }

    @Test
    public void test5(){
        GuessNumberHigherOrLower test = new GuessNumberHigherOrLower();
        test.setPick(13);
        Assert.assertEquals(13, test.guessNumber(100));
    }

    @Test
    public void test6(){
        GuessNumberHigherOrLower test = new GuessNumberHigherOrLower();
        test.setPick(12411423);
        Assert.assertEquals(12411423, test.guessNumber(1000000000));
    }

    @Test
    public void test7(){
        GuessNumberHigherOrLower test = new GuessNumberHigherOrLower();
        test.setPick(1);
        Assert.assertEquals(1, test.guessNumber(1000000000));
    }

    @Test
    public void test8(){
        GuessNumberHigherOrLower test = new GuessNumberHigherOrLower();
        test.setPick(1000000000);
        Assert.assertEquals(1000000000, test.guessNumber(1000000000));
    }
}
