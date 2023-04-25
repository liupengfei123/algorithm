package lpf.learn.leetcode.game.weekly342;

import org.junit.Assert;
import org.junit.Test;

public class MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1Test {
    @Test
    public void test1(){
        MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 test = new MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1();
        Assert.assertEquals(4, test.minOperations(new int[]{2,6,3,4}));
    }

    @Test
    public void test2(){
        MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 test = new MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1();
        Assert.assertEquals(-1, test.minOperations(new int[]{2,10,6,14}));
    }

    @Test
    public void test3(){
        MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 test = new MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1();
        Assert.assertEquals(4, test.minOperations(new int[]{6, 10 ,15}));
    }

    @Test
    public void test5(){
        MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 test = new MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1();
        Assert.assertEquals(5, test.minOperations(new int[]{4,2,6,3}));
    }

    @Test
    public void test6(){
        MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 test = new MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1();
        Assert.assertEquals(10, test.minOperations(new int[]{25,10,10,10,10,4}));
    }


    @Test
    public void test7(){
        MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 test = new MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1();
        Assert.assertEquals(-1, test.minOperations(new int[]{5, 10}));
    }
}
