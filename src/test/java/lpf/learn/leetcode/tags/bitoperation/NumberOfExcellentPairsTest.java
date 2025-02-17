package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfExcellentPairsTest {

    @Test
    public void test1(){
        NumberOfExcellentPairs test = new NumberOfExcellentPairs();
        Assert.assertEquals(5, test.countExcellentPairs(new int[]{1,2,3,1}, 3));
    }


    @Test
    public void test2(){
        NumberOfExcellentPairs test = new NumberOfExcellentPairs();
        Assert.assertEquals(0, test.countExcellentPairs(new int[]{5,1,1}, 10));
    }

    @Test
    public void test3(){
        NumberOfExcellentPairs test = new NumberOfExcellentPairs();
        Assert.assertEquals(1, test.countExcellentPairs(new int[]{5,5,5}, 1));
    }
}
