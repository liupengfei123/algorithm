package lpf.learn.leetcode.tags.backtrack;

import org.junit.Assert;
import org.junit.Test;

public class MatchsticksToSquareTest {
    @Test
    public void test1(){
        MatchsticksToSquare test = new MatchsticksToSquare();
        Assert.assertEquals(true, test.makesquare(new int[]{1,1,2,2,2}));
    }

    @Test
    public void test2(){
        MatchsticksToSquare test = new MatchsticksToSquare();
        Assert.assertEquals(false, test.makesquare(new int[]{3,3,3,3,4}));
    }

    @Test
    public void test3(){
        MatchsticksToSquare test = new MatchsticksToSquare();
        Assert.assertEquals(true, test.makesquare(new int[]{6,1,2,1,3,1,3,1,2,4}));
    }

    @Test
    public void test4(){
        MatchsticksToSquare test = new MatchsticksToSquare();
        Assert.assertEquals(true, test.makesquare(new int[]{6,1,1,1,3,1,3,1,3,4}));
    }

    @Test
    public void test5(){
        MatchsticksToSquare test = new MatchsticksToSquare();
        Assert.assertEquals(true, test.makesquare(new int[]{5,5,5,5,4,4,4,4,3,3,3,3}));
    }

    @Test
    public void test6(){
        MatchsticksToSquare test = new MatchsticksToSquare();
        Assert.assertEquals(true, test.makesquare(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));
    }

    @Test
    public void test7(){
        MatchsticksToSquare test = new MatchsticksToSquare();
        Assert.assertEquals(false, test.makesquare(new int[]{1,2,3,4,5,6,7,8,9,10,5,4,3,2,1}));
    }

    @Test
    public void test8(){
        MatchsticksToSquare test = new MatchsticksToSquare();
        Assert.assertEquals(true, test.makesquare(new int[]{13,11,1,8,6,7,8,8,6,7,8,9,8}));
    }
}
