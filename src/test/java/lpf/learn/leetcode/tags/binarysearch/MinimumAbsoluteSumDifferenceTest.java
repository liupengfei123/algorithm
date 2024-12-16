package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-05-09 18:17
 */
public class MinimumAbsoluteSumDifferenceTest {
    @Test
    public void test1(){
        MinimumAbsoluteSumDifference test = new MinimumAbsoluteSumDifference();
        Assert.assertEquals(3, test.minAbsoluteSumDiff(new int[]{1,7,5}, new int[]{2,3,5}));
    }

    @Test
    public void test2(){
        MinimumAbsoluteSumDifference test = new MinimumAbsoluteSumDifference();
        Assert.assertEquals(0, test.minAbsoluteSumDiff(new int[]{2,4,6,8,10}, new int[]{2,4,6,8,10}));
    }

    @Test
    public void test3(){
        MinimumAbsoluteSumDifference test = new MinimumAbsoluteSumDifference();
        Assert.assertEquals(20, test.minAbsoluteSumDiff(new int[]{1,10,4,4,2,7}, new int[]{9,3,5,1,7,4}));
    }

    @Test
    public void test4(){
        BinarySearch test = new BinarySearch();
        Assert.assertEquals(0, test.search(new int[]{-1,0,3,5,9,12}, -1));
    }
}
