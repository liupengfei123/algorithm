package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class SumOfDigitDifferencesOfAllPairsTest {

    @Test
    public void test1(){
        SumOfDigitDifferencesOfAllPairs test = new SumOfDigitDifferencesOfAllPairs();
        Assert.assertEquals(4, test.sumDigitDifferences(new int[]{13,23,12}));
    }


    @Test
    public void test2(){
        SumOfDigitDifferencesOfAllPairs test = new SumOfDigitDifferencesOfAllPairs();
        Assert.assertEquals(0, test.sumDigitDifferences(new int[]{10,10,10,10}));
    }

    @Test
    public void test3(){
        SumOfDigitDifferencesOfAllPairs test = new SumOfDigitDifferencesOfAllPairs();
        Assert.assertEquals(23, test.sumDigitDifferences(new int[]{100,100,103,103,107,107,107,105}));
    }

    @Test
    public void test4(){
        SumOfDigitDifferencesOfAllPairs test = new SumOfDigitDifferencesOfAllPairs();
        Assert.assertEquals(90, test.sumDigitDifferences(new int[]{1231,5532,1566,6278,1235,7245,7381,1461}));
    }

}
