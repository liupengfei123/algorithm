package lpf.learn.leetcode.game.biweekly83;

import org.junit.Assert;
import org.junit.Test;

public class BestPokerHandTest {
    @Test
    public void test1(){
        BestPokerHand test = new BestPokerHand();
        Assert.assertEquals("Flush", test.bestHand(new int[]{13,2,3,1,9}, new char[]{'a','a','a','a','a'}));
    }

    @Test
    public void test2(){
        BestPokerHand test = new BestPokerHand();
        Assert.assertEquals("Three of a Kind", test.bestHand(new int[]{4,4,2,4,4}, new char[]{'d','a','a','b','c'}));
    }

    @Test
    public void test3(){
        BestPokerHand test = new BestPokerHand();
        Assert.assertEquals("Pair", test.bestHand(new int[]{10,10,2,12,9}, new char[]{'a','b','c','a','d'}));
    }
}
