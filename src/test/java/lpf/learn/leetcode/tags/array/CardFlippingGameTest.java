package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class CardFlippingGameTest {

    @Test
    public void test1(){
        CardFlippingGame test = new CardFlippingGame();
        Assert.assertEquals(2, test.flipgame(new int[]{1,2,4,4,7}, new int[]{1,3,4,1,3}));
    }

    @Test
    public void test2(){
        CardFlippingGame test = new CardFlippingGame();
        Assert.assertEquals(1, test.flipgame(new int[]{2,2,4,4,7}, new int[]{1,3,4,1,3}));
    }

    @Test
    public void test3(){
        CardFlippingGame test = new CardFlippingGame();
        Assert.assertEquals(0, test.flipgame(new int[]{1}, new int[]{1}));
    }

    @Test
    public void test4(){
        CardFlippingGame test = new CardFlippingGame();
        Assert.assertEquals(2, test.flipgame(new int[]{1,1}, new int[]{1,2}));
    }

    @Test
    public void test5(){
        CardFlippingGame test = new CardFlippingGame();
        Assert.assertEquals(1, test.flipgame(new int[]{2,2,2,5,5,7,2,3,6,7,5,1,2,4,9,8,7,6,4,7}, new int[]{1,2,3,7,5,2,4,6,1,4,8,7,5,3,5,3,3,4,1,3}));
    }
}
