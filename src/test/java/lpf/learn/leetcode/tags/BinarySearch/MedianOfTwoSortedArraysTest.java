package lpf.learn.leetcode.tags.BinarySearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-05-09 18:17
 */
public class MedianOfTwoSortedArraysTest {
    @Test
    public void test1(){
        MedianOfTwoSortedArrays test = new MedianOfTwoSortedArrays();
        Assert.assertEquals(2.00000, test.findMedianSortedArrays(new int[]{1,3}, new int[]{2}), 0.00001);
    }

    @Test
    public void test2(){
        MedianOfTwoSortedArrays test = new MedianOfTwoSortedArrays();
        Assert.assertEquals(2.50000, test.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}), 0.00001);
    }

    @Test
    public void test3(){
        MedianOfTwoSortedArrays test = new MedianOfTwoSortedArrays();
        Assert.assertEquals(0, test.findMedianSortedArrays(new int[]{0,0}, new int[]{0,0}), 0.00001);
    }

    @Test
    public void test4(){
        MedianOfTwoSortedArrays test = new MedianOfTwoSortedArrays();
        Assert.assertEquals(1.00000, test.findMedianSortedArrays(new int[]{1}, new int[]{}), 0.00001);
    }

    @Test
    public void test5(){
        MedianOfTwoSortedArrays test = new MedianOfTwoSortedArrays();
        Assert.assertEquals(2.00000, test.findMedianSortedArrays(new int[]{}, new int[]{2}), 0.00001);
    }

    @Test
    public void test6(){
        MedianOfTwoSortedArrays test = new MedianOfTwoSortedArrays();
        Assert.assertEquals(2.50000, test.findMedianSortedArrays(new int[]{1,3}, new int[]{2,7}), 0.00001);
    }

    @Test
    public void test7(){
        MedianOfTwoSortedArrays test = new MedianOfTwoSortedArrays();
        Assert.assertEquals(2.50000, test.findMedianSortedArrays(new int[]{2,3}, new int[]{}), 0.00001);
    }

    @Test
    public void test8(){
        MedianOfTwoSortedArrays test = new MedianOfTwoSortedArrays();
        Assert.assertEquals(2.50000, test.findMedianSortedArrays(new int[]{2}, new int[]{1,3,4}), 0.00001);
    }

    @Test
    public void test9(){
        MedianOfTwoSortedArrays test = new MedianOfTwoSortedArrays();
        Assert.assertEquals(2.50000, test.findMedianSortedArrays(new int[]{1,3,4}, new int[]{2}), 0.00001);
    }
}
