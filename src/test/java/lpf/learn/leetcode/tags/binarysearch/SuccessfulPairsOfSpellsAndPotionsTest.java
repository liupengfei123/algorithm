package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class SuccessfulPairsOfSpellsAndPotionsTest {
    @Test
    public void test1(){
        SuccessfulPairsOfSpellsAndPotions test = new SuccessfulPairsOfSpellsAndPotions();
        Assert.assertArrayEquals(new int[]{4,0,3}, test.successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7));
    }

    @Test
    public void test2(){
        SuccessfulPairsOfSpellsAndPotions test = new SuccessfulPairsOfSpellsAndPotions();
        Assert.assertArrayEquals(new int[]{2,0,2}, test.successfulPairs(new int[]{3,1,2}, new int[]{8,5,8}, 16));
    }

    @Test
    public void test3(){
        SuccessfulPairsOfSpellsAndPotions test = new SuccessfulPairsOfSpellsAndPotions();
        Assert.assertArrayEquals(new int[]{1,0,0}, test.successfulPairs(new int[]{3,1,2}, new int[]{7,5,8}, 24));
    }


    @Test
    public void test4(){
        SuccessfulPairsOfSpellsAndPotions test = new SuccessfulPairsOfSpellsAndPotions();
        Assert.assertArrayEquals(new int[]{2,0,1}, test.successfulPairs(new int[]{3,1,2}, new int[]{1,2,3}, 6));
    }
}
