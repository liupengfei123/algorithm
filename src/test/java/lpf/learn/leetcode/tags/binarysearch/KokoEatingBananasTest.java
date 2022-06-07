package lpf.learn.leetcode.tags.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-05-09 18:17
 */
public class KokoEatingBananasTest {
    @Test
    public void test1(){
        KokoEatingBananas test = new KokoEatingBananas();
        Assert.assertEquals(4, test.minEatingSpeed(new int[]{3,6,7,11}, 8));
    }

    @Test
    public void test2(){
        KokoEatingBananas test = new KokoEatingBananas();
        Assert.assertEquals(30, test.minEatingSpeed(new int[]{30,11,23,4,20}, 5));
    }

    @Test
    public void test3(){
        KokoEatingBananas test = new KokoEatingBananas();
        Assert.assertEquals(23, test.minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }
}
