package lpf.learn.leetcode.game.biweekly80;

import org.junit.Assert;
import org.junit.Test;

public class CountSubarraysWithScoreLessThanKTest {
    @Test
    public void test1(){
        CountSubarraysWithScoreLessThanK test = new CountSubarraysWithScoreLessThanK();
        Assert.assertEquals(6, test.countSubarrays(new int[]{2,1,4,3,5}, 10));
    }

    @Test
    public void test2(){
        CountSubarraysWithScoreLessThanK test = new CountSubarraysWithScoreLessThanK();
        Assert.assertEquals(5, test.countSubarrays(new int[]{1,1,1}, 5));
    }
}
