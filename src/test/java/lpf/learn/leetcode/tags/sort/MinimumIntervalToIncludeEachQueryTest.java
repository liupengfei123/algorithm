package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class MinimumIntervalToIncludeEachQueryTest {
    @Test
    public void test1(){
        MinimumIntervalToIncludeEachQuery test = new MinimumIntervalToIncludeEachQuery();
        Assert.assertArrayEquals(new int[]{3,3,1,4}, test.minInterval(new int[][]{{1,4},{2,4},{3,6},{4,4}}, new int[]{2,3,4,5}));
    }

    @Test
    public void test2(){
        MinimumIntervalToIncludeEachQuery test = new MinimumIntervalToIncludeEachQuery();
        Assert.assertArrayEquals(new int[]{2,-1,4,6}, test.minInterval(new int[][]{{2,3},{2,5},{1,8},{20,25}}, new int[]{2,19,5,22}));
    }
}
