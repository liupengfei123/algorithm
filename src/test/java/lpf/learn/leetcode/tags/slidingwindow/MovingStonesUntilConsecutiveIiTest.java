package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MovingStonesUntilConsecutiveIiTest {
    @Test
    public void test1(){
        MovingStonesUntilConsecutiveIi test = new MovingStonesUntilConsecutiveIi();
        Assert.assertArrayEquals(new int[]{1,2}, test.numMovesStonesII(new int[]{7,4,9}));
    }

    @Test
    public void test2(){
        MovingStonesUntilConsecutiveIi test = new MovingStonesUntilConsecutiveIi();
        Assert.assertArrayEquals(new int[]{2,3}, test.numMovesStonesII(new int[]{6,5,4,3,10}));
    }


    @Test
    public void test3(){
        MovingStonesUntilConsecutiveIi test = new MovingStonesUntilConsecutiveIi();
        Assert.assertArrayEquals(new int[]{2,92}, test.numMovesStonesII(new int[]{1,2,3,4,5,6,7,100}));
    }

    @Test
    public void test4(){
        MovingStonesUntilConsecutiveIi test = new MovingStonesUntilConsecutiveIi();
        Assert.assertArrayEquals(new int[]{2,98}, test.numMovesStonesII(new int[]{1,100,101,102,103,104,105,106}));
    }

    @Test
    public void test5(){
        MovingStonesUntilConsecutiveIi test = new MovingStonesUntilConsecutiveIi();
        Assert.assertArrayEquals(new int[]{1,1}, test.numMovesStonesII(new int[]{8,7,6,5,10}));
    }

    @Test
    public void test6(){
        MovingStonesUntilConsecutiveIi test = new MovingStonesUntilConsecutiveIi();
        Assert.assertArrayEquals(new int[]{2,999999991}, test.numMovesStonesII(new int[]{8,7,6,5,1000000000}));
    }

}