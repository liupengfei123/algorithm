package lpf.learn.leetcode.game.biweekly83;

import org.junit.Assert;
import org.junit.Test;

public class ShortestImpossibleSequenceOfRollsTest {
    @Test
    public void test1(){
        ShortestImpossibleSequenceOfRolls test = new ShortestImpossibleSequenceOfRolls();
        Assert.assertEquals(2, test.shortestSequence(new int[]{1,2,3,4,5}, 5));
    }

    @Test
    public void test2(){
        ShortestImpossibleSequenceOfRolls test = new ShortestImpossibleSequenceOfRolls();
        Assert.assertEquals(3, test.shortestSequence(new int[]{4,2,1,2,3,3,2,4,1}, 4));
    }

    @Test
    public void test3(){
        ShortestImpossibleSequenceOfRolls test = new ShortestImpossibleSequenceOfRolls();
        Assert.assertEquals(2, test.shortestSequence(new int[]{1,1,2,2}, 2));
    }

    @Test
    public void test4(){
        ShortestImpossibleSequenceOfRolls test = new ShortestImpossibleSequenceOfRolls();
        Assert.assertEquals(1, test.shortestSequence(new int[]{1,1,3,2,2,2,3,3}, 4));
    }

    @Test
    public void test5(){
        ShortestImpossibleSequenceOfRolls test = new ShortestImpossibleSequenceOfRolls();
        Assert.assertEquals(6, test.shortestSequence(new int[]{3,2,1,3,3,3,3,3,1,2,2,3,1,3,3,1,1,3,1,1,1,3,1,3,3,1,2,3,2,1,1,2}, 3));
    }

    @Test
    public void test6(){
        ShortestImpossibleSequenceOfRolls test = new ShortestImpossibleSequenceOfRolls();
        Assert.assertEquals(93, test.shortestSequence(new int[]{2,2,2,2,2,2,1,2,2,2,1,1,1,2,2,2,2,1,2,1,1,2,2,2,2,1,1,1,1,2,1,1,2,1,1,2,2,1,1,1,2,1,1,1,2,2,1,2,1,2,1,1,1,1,1,1,2,1,1,1,2,1,1,1,1,1,2,2,1,2,1,2,1,2,2,1,1,2,1,1,1,1,2,2,2,2,1,2,1,1,2,1,2,1,1,2,2,1,2,1,1,2,2,2,1,2,2,1,1,2,2,1,2,1,1,2,1,1,1,1,2,2,1,2,2,1,2,2,2,2,1,1,2,2,2,2,1,1,2,2,1,1,2,1,1,1,1,2,1,1,2,2,2,2,2,2,2,1,2,2,2,2,2,2,1,2,1,1,2,1,2,1,2,2,2,2,2,2,1,1,2,1,2,2,2,2,1,2,1,2,1,2,1,1,1,2,1,1,1,2,1,1,2,2,1,1,1,1,2,2,2,2,1,2,1,1,1,1,1,2,1,1,1,1,2,2,1,1,1,2,2,1,2,1,2,1,1,2,2,2,1,1,2,1,2,1,2,2,1,1,1,1,2,2,2,1,1,2,2,1,1,1,1,1,1,2,1,1,2,2,2,1,1,2,1,2,2,2,2,2}, 2));
    }
}
