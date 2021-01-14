package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class WiggleSortIiTest {
    @Test
    public void test1(){
        WiggleSortIi test = new WiggleSortIi();
        int[] nums = new int[]{1,3,2,2,3,1};
        test.wiggleSort(nums);
        Assert.assertTrue(test.verify(nums));
    }

    @Test
    public void test2(){
        WiggleSortIi test = new WiggleSortIi();
        int[] nums = new int[]{1,5,1,1,6,4};
        test.wiggleSort(nums);
        Assert.assertTrue(test.verify(nums));
    }

    @Test
    public void test3(){
        WiggleSortIi test = new WiggleSortIi();
        int[] nums = new int[]{1,3,2,2,3,1,4};
        test.wiggleSort(nums);
        Assert.assertTrue(test.verify(nums));
    }


    @Test
    public void test4(){
        WiggleSortIi test = new WiggleSortIi();
        int[] nums = new int[]{4,5,5,6};
        test.wiggleSort(nums);
        Assert.assertTrue( test.verify(nums));
    }
}
