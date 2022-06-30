package lpf.learn.leetcode.game.biweekly81;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfDistinctRollSequencesTest {

    @Test
    public void test1(){
        NumberOfDistinctRollSequences test = new NumberOfDistinctRollSequences();
        Assert.assertEquals(6, test.distinctSequences(1));
    }

    @Test
    public void test2(){
        NumberOfDistinctRollSequences test = new NumberOfDistinctRollSequences();
        Assert.assertEquals(22, test.distinctSequences(2));
    }

    @Test
    public void test3(){
        NumberOfDistinctRollSequences test = new NumberOfDistinctRollSequences();
        Assert.assertEquals(66, test.distinctSequences(3));
    }

    @Test
    public void test4(){
        NumberOfDistinctRollSequences test = new NumberOfDistinctRollSequences();
        Assert.assertEquals(184, test.distinctSequences(4));
    }

    @Test
    public void test5(){
        NumberOfDistinctRollSequences test = new NumberOfDistinctRollSequences();
        Assert.assertEquals(516, test.distinctSequences(5));
    }

    @Test
    public void test6(){
        NumberOfDistinctRollSequences test = new NumberOfDistinctRollSequences();
        Assert.assertEquals(93120, test.distinctSequences(10));
    }

    @Test
    public void test7(){
        NumberOfDistinctRollSequences test = new NumberOfDistinctRollSequences();
        Assert.assertEquals(427275925, test.distinctSequences(1531));
    }

    @Test
    public void test8(){
        NumberOfDistinctRollSequences test = new NumberOfDistinctRollSequences();
        Assert.assertEquals(455330915, test.distinctSequences(9999));
    }

    @Test
    public void test9(){
        NumberOfDistinctRollSequences test = new NumberOfDistinctRollSequences();
        Assert.assertEquals(586536780, test.distinctSequences(30));
    }
}
