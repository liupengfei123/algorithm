package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class MaximumBuildingHeightTest {
    @Test
    public void test1(){
        MaximumBuildingHeight test = new MaximumBuildingHeight();
        Assert.assertEquals(2, test.maxBuilding(5, new int[][]{{2,1},{4,1}}));
    }

    @Test
    public void test2(){
        FrequencyoftheMostFrequentElement test = new FrequencyoftheMostFrequentElement();
        Assert.assertEquals(2, test.maxFrequency(new int[]{1,4,8,13}, 5));
    }

    @Test
    public void test3(){
        FrequencyoftheMostFrequentElement test = new FrequencyoftheMostFrequentElement();
        Assert.assertEquals(1, test.maxFrequency(new int[]{3,9,6}, 2));
    }
}
