package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class SumOfFlooredPairsTest {
    @Test
    public void test1(){
        SumOfFlooredPairs test = new SumOfFlooredPairs();
        Assert.assertEquals(10, test.sumOfFlooredPairs(new int[]{2,5,9}));
    }

    @Test
    public void test2(){
        SumOfFlooredPairs test = new SumOfFlooredPairs();
        Assert.assertEquals(49, test.sumOfFlooredPairs(new int[]{7,7,7,7,7,7,7}));
    }

    @Test
    public void test3(){
        FrequencyoftheMostFrequentElement test = new FrequencyoftheMostFrequentElement();
        Assert.assertEquals(1, test.maxFrequency(new int[]{3,9,6}, 2));
    }
}
