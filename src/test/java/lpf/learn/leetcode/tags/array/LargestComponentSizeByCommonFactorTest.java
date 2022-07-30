package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class LargestComponentSizeByCommonFactorTest {

    @Test
    public void test1(){
        LargestComponentSizeByCommonFactor test = new LargestComponentSizeByCommonFactor();
        Assert.assertEquals(4, test.largestComponentSize(new int[]{4,6,15,35}));
    }

    @Test
    public void test2(){
        LargestComponentSizeByCommonFactor test = new LargestComponentSizeByCommonFactor();
        Assert.assertEquals(2, test.largestComponentSize(new int[]{20,50,9,63}));
    }

    @Test
    public void test3(){
        LargestComponentSizeByCommonFactor test = new LargestComponentSizeByCommonFactor();
        Assert.assertEquals(8, test.largestComponentSize(new int[]{2,3,6,7,4,12,21,39}));
    }
}
