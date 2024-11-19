package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MaximumBeautyOfAnArrayAfterApplyingOperationTest {
    @Test
    public void test1(){
        MaximumBeautyOfAnArrayAfterApplyingOperation test = new MaximumBeautyOfAnArrayAfterApplyingOperation();
        Assert.assertEquals(3, test.maximumBeauty(new int[]{4,6,1,2}, 2));
    }
    @Test
    public void test2(){
        MaximumBeautyOfAnArrayAfterApplyingOperation test = new MaximumBeautyOfAnArrayAfterApplyingOperation();
        Assert.assertEquals(4, test.maximumBeauty(new int[]{1,1,1,1}, 2));
    }
    @Test
    public void test3(){
        MaximumBeautyOfAnArrayAfterApplyingOperation test = new MaximumBeautyOfAnArrayAfterApplyingOperation();
        Assert.assertEquals(2, test.maximumBeauty(new int[]{49,26}, 12));
    }
}
