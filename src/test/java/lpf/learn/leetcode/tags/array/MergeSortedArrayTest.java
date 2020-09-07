package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MergeSortedArrayTest {

    @Test
    public void test1(){
        MergeSortedArray test = new MergeSortedArray();
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        test.merge(nums1, 3, new int[]{2,5,6}, 3);
        Assert.assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }

    @Test
    public void test2(){
        MergeSortedArray test = new MergeSortedArray();
        int[] nums1 = new int[10];
        nums1[0] = 4;
        nums1[1] = 7;
        nums1[2] = 9;
        test.merge(nums1, 3, new int[]{2,5,6}, 3);
        Assert.assertArrayEquals(new int[]{2,4,5,6,7,9,0,0,0,0}, nums1);
    }

    @Test
    public void test3(){
        MergeSortedArray test = new MergeSortedArray();
        int[] nums1 = new int[6];
        nums1[0] = 4;
        nums1[1] = 5;
        nums1[2] = 6;
        test.merge(nums1, 3, new int[]{1,2,3}, 3);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6}, nums1);
    }
}
