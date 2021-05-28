package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class TotalHammingDistanceTest {

    @Test
    public void test1(){
        TotalHammingDistance test = new TotalHammingDistance();
        Assert.assertEquals(6, test.totalHammingDistance(new int[]{4, 14, 2}));
    }
}
