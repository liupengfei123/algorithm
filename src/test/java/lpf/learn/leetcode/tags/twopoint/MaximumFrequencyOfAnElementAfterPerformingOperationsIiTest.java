package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class MaximumFrequencyOfAnElementAfterPerformingOperationsIiTest {
    @Test
    public void test1(){
        MaximumFrequencyOfAnElementAfterPerformingOperationsIi test = new MaximumFrequencyOfAnElementAfterPerformingOperationsIi();
        Assert.assertEquals(2, test.maxFrequency(new int[]{1,4,5}, 1, 2));
    }

    @Test
    public void test2(){
        MaximumFrequencyOfAnElementAfterPerformingOperationsIi test = new MaximumFrequencyOfAnElementAfterPerformingOperationsIi();
        Assert.assertEquals(2, test.maxFrequency(new int[]{5,11,20,20}, 5, 1));
    }

    @Test
    public void test3(){
        MaximumFrequencyOfAnElementAfterPerformingOperationsIi test = new MaximumFrequencyOfAnElementAfterPerformingOperationsIi();
        Assert.assertEquals(9, test.maxFrequency(new int[]{1,4,4,4,4,4,4,4,4,9}, 3, 2));
    }

    @Test
    public void test4(){
        MaximumFrequencyOfAnElementAfterPerformingOperationsIi test = new MaximumFrequencyOfAnElementAfterPerformingOperationsIi();
        Assert.assertEquals(8, test.maxFrequency(new int[]{1,2,3,4,4,5,6,5,6,3,6,7,2,8,9,10,11,23,12,7,6,5}, 3, 4));
    }


    @Test
    public void test5(){
        MaximumFrequencyOfAnElementAfterPerformingOperationsIi test = new MaximumFrequencyOfAnElementAfterPerformingOperationsIi();
        Assert.assertEquals(1, test.maxFrequency(new int[]{5}, 0, 0));
    }

    @Test
    public void test6(){
        MaximumFrequencyOfAnElementAfterPerformingOperationsIi test = new MaximumFrequencyOfAnElementAfterPerformingOperationsIi();
        Assert.assertEquals(2, test.maxFrequency(new int[]{5,64}, 42, 2));
    }

    @Test
    public void test7(){
        MaximumFrequencyOfAnElementAfterPerformingOperationsIi test = new MaximumFrequencyOfAnElementAfterPerformingOperationsIi();
        Assert.assertEquals(3, test.maxFrequency(new int[]{1,78,70}, 39, 3));
    }

    @Test
    public void test8(){
        MaximumFrequencyOfAnElementAfterPerformingOperationsIi test = new MaximumFrequencyOfAnElementAfterPerformingOperationsIi();
        Assert.assertEquals(4, test.maxFrequency(new int[]{1,2,4,5}, 2, 4));
    }

    @Test
    public void test9(){
        MaximumFrequencyOfAnElementAfterPerformingOperationsIi test = new MaximumFrequencyOfAnElementAfterPerformingOperationsIi();
        Assert.assertEquals(3, test.maxFrequency(new int[]{39,2,17,82,25,2}, 14, 2));
    }
}
