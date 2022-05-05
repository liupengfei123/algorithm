package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class SubarrayProductLessThanKTest {

    @Test
    public void test1(){
        SubarrayProductLessThanK test = new SubarrayProductLessThanK();
        Assert.assertEquals(8, test.numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
    }

    @Test
    public void test2(){
        SubarrayProductLessThanK test = new SubarrayProductLessThanK();
        Assert.assertEquals(0, test.numSubarrayProductLessThanK(new int[]{1,2,3}, 0));
    }

    @Test
    public void test3(){
        SubarrayProductLessThanK test = new SubarrayProductLessThanK();
        Assert.assertEquals(3, test.numSubarrayProductLessThanK(new int[]{1,2,4}, 3));
    }


    @Test
    public void test4(){
        SubarrayProductLessThanK test = new SubarrayProductLessThanK();
        Assert.assertEquals(6, test.numSubarrayProductLessThanK(new int[]{10,5,110,2,6}, 100));
    }

    @Test
    public void test5(){
        SubarrayProductLessThanK test = new SubarrayProductLessThanK();
        Assert.assertEquals(0, test.numSubarrayProductLessThanK(new int[]{1,5,1,2,1}, 1));
    }

    @Test
    public void test6(){
        SubarrayProductLessThanK test = new SubarrayProductLessThanK();
        Assert.assertEquals(0, test.numSubarrayProductLessThanK(new int[]{1,1,1,1,1}, 1));
    }
}
