package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-05-09 18:17
 */
public class MinimumNumberOfDaysToMakeMBouquetsTest {
    @Test
    public void test1(){
        MinimumNumberOfDaysToMakeMBouquets test = new MinimumNumberOfDaysToMakeMBouquets();
        Assert.assertEquals(3, test.minDays(new int[]{1,10,3,10,2}, 3, 1));
    }

    @Test
    public void test2(){
        MinimumNumberOfDaysToMakeMBouquets test = new MinimumNumberOfDaysToMakeMBouquets();
        Assert.assertEquals(-1, test.minDays(new int[]{1,10,3,10,2}, 3, 2));
    }

    @Test
    public void test3(){
        MinimumNumberOfDaysToMakeMBouquets test = new MinimumNumberOfDaysToMakeMBouquets();
        Assert.assertEquals(10, test.minDays(new int[]{1,10,3,10,2}, 2, 2));
    }

    @Test
    public void test4(){
        MinimumNumberOfDaysToMakeMBouquets test = new MinimumNumberOfDaysToMakeMBouquets();
        Assert.assertEquals(2, test.minDays(new int[]{1,10,3,10,2}, 2, 1));
    }

    @Test
    public void test5(){
        MinimumNumberOfDaysToMakeMBouquets test = new MinimumNumberOfDaysToMakeMBouquets();
        Assert.assertEquals(12, test.minDays(new int[]{7,7,7,7,12,7,7}, 2, 3));
    }

    @Test
    public void test6(){
        MinimumNumberOfDaysToMakeMBouquets test = new MinimumNumberOfDaysToMakeMBouquets();
        Assert.assertEquals(1000000000, test.minDays(new int[]{1000000000,1000000000}, 1, 1));
    }
}
