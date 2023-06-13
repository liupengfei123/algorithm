package lpf.learn.leetcode.game.weekly320;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfUnequalTripletsInArrayTest {
    @Test
    public void test1(){
        NumberOfUnequalTripletsInArray test = new NumberOfUnequalTripletsInArray();
        Assert.assertEquals(3, test.unequalTriplets(new int[]{4,4,2,4,3}));
    }

    @Test
    public void test2(){
        NumberOfUnequalTripletsInArray test = new NumberOfUnequalTripletsInArray();
        Assert.assertEquals(0, test.unequalTriplets(new int[]{1,1,1,1,1}));
    }

}
