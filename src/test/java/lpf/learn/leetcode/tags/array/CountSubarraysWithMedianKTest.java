package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class CountSubarraysWithMedianKTest {

    @Test
    public void test1(){
        CountSubarraysWithMedianK test = new CountSubarraysWithMedianK();
        Assert.assertEquals(3, test.countSubarrays(new int[]{3,2,1,4,5}, 4));
    }

    @Test
    public void test2(){
        CountSubarraysWithMedianK test = new CountSubarraysWithMedianK();
        Assert.assertEquals(1, test.countSubarrays(new int[]{2,3,1}, 3));
    }

    @Test
    public void test3(){
        CountSubarraysWithMedianK test = new CountSubarraysWithMedianK();
        Assert.assertEquals(3, test.countSubarrays(new int[]{4,1,3,2}, 1));
    }

    @Test
    public void test4(){
        CountSubarraysWithMedianK test = new CountSubarraysWithMedianK();
        Assert.assertEquals(3, test.countSubarrays(new int[]{2,5,1,4,3,6}, 1));
    }

    @Test
    public void test5(){
        CountSubarraysWithMedianK test = new CountSubarraysWithMedianK();
        Assert.assertEquals(2, test.countSubarrays(new int[]{3,1,2}, 2));
    }
}
