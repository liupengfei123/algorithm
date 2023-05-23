package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class LargestValuesFromLabelsTest {
    @Test
    public void test1(){
        LargestValuesFromLabels test = new LargestValuesFromLabels();
        Assert.assertEquals(9, test.largestValsFromLabels(new int[]{5,4,3,2,1}, new int[]{1,1,2,2,3}, 3, 1));
    }

    @Test
    public void test2(){
        LargestValuesFromLabels test = new LargestValuesFromLabels();
        Assert.assertEquals(12, test.largestValsFromLabels(new int[]{5,4,3,2,1}, new int[]{1,1,2,2,3}, 3, 2));
    }

    @Test
    public void test3(){
        LargestValuesFromLabels test = new LargestValuesFromLabels();
        Assert.assertEquals(12, test.largestValsFromLabels(new int[]{5,4,3,2,1}, new int[]{1,3,3,3,2}, 3, 2));
    }

    @Test
    public void test4(){
        LargestValuesFromLabels test = new LargestValuesFromLabels();
        Assert.assertEquals(16, test.largestValsFromLabels(new int[]{9,8,8,7,6}, new int[]{0,0,0,1,1}, 3, 1));
    }

}
