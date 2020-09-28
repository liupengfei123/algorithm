package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class XOfAKindInADeckOfCardsTest {

    @Test
    public void test1(){
        XOfAKindInADeckOfCards test = new XOfAKindInADeckOfCards();
        Assert.assertTrue(test.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
    }

    @Test
    public void test2(){
        XOfAKindInADeckOfCards test = new XOfAKindInADeckOfCards();
        Assert.assertFalse(test.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
    }

    @Test
    public void test3(){
        XOfAKindInADeckOfCards test = new XOfAKindInADeckOfCards();
        Assert.assertFalse(test.hasGroupsSizeX(new int[]{1}));
    }

    @Test
    public void test4(){
        XOfAKindInADeckOfCards test = new XOfAKindInADeckOfCards();
        Assert.assertTrue(test.hasGroupsSizeX(new int[]{1, 1}));
    }

    @Test
    public void test5(){
        XOfAKindInADeckOfCards test = new XOfAKindInADeckOfCards();
        Assert.assertTrue(test.hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2}));
    }

    @Test
    public void test6(){
        XOfAKindInADeckOfCards test = new XOfAKindInADeckOfCards();
        Assert.assertTrue(test.hasGroupsSizeX(new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 2}));
    }


}
