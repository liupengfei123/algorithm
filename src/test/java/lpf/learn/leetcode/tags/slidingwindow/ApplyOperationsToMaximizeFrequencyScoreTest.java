package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class ApplyOperationsToMaximizeFrequencyScoreTest {
    @Test
    public void test1(){
        ApplyOperationsToMaximizeFrequencyScore test = new ApplyOperationsToMaximizeFrequencyScore();
        Assert.assertEquals(3, test.maxFrequencyScore(new int[]{1,2,6,4}, 3));
    }

    @Test
    public void test2(){
        ApplyOperationsToMaximizeFrequencyScore test = new ApplyOperationsToMaximizeFrequencyScore();
        Assert.assertEquals(3, test.maxFrequencyScore(new int[]{1,4,4,2,4}, 0));
    }


    @Test
    public void test3(){
        ApplyOperationsToMaximizeFrequencyScore test = new ApplyOperationsToMaximizeFrequencyScore();
        Assert.assertEquals(10, test.maxFrequencyScore(new int[]{1,4,5,3,1,8,4,10,32,4,12,15,4,2,4}, 10));
    }

    @Test
    public void test4(){
        ApplyOperationsToMaximizeFrequencyScore test = new ApplyOperationsToMaximizeFrequencyScore();
        Assert.assertEquals(5, test.maxFrequencyScore(new int[]{1,4,4,2,4}, 20));
    }

    @Test
    public void test5(){
        ApplyOperationsToMaximizeFrequencyScore test = new ApplyOperationsToMaximizeFrequencyScore();
        Assert.assertEquals(7, test.maxFrequencyScore(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,14,15,16,17}, 10));
    }

}