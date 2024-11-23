package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CountPairsWhoseSumIsLessThanTargetTest {
    @Test
    public void test1(){
        CountPairsWhoseSumIsLessThanTarget test = new CountPairsWhoseSumIsLessThanTarget();
        Assert.assertEquals(3, test.countPairs( Arrays.asList(-1,1,2,3,1), 2));
    }

    @Test
    public void test2(){
        CountPairsWhoseSumIsLessThanTarget test = new CountPairsWhoseSumIsLessThanTarget();
        Assert.assertEquals(10, test.countPairs( Arrays.asList(-6,2,5,-2,-7,-1,3), -2));
    }
}
