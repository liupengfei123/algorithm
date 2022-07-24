package lpf.learn.leetcode.game.biweekly83;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfZeroFilledSubarraysTest {
    @Test
    public void test1(){
        NumberOfZeroFilledSubarrays test = new NumberOfZeroFilledSubarrays();
        Assert.assertEquals(6, test.zeroFilledSubarray(new int[]{1,3,0,0,2,0,0,4}));
    }


    @Test
    public void test2(){
        NumberOfZeroFilledSubarrays test = new NumberOfZeroFilledSubarrays();
        Assert.assertEquals(9, test.zeroFilledSubarray(new int[]{0,0,0,2,0,0}));
    }


    @Test
    public void test3(){
        NumberOfZeroFilledSubarrays test = new NumberOfZeroFilledSubarrays();
        Assert.assertEquals(0, test.zeroFilledSubarray(new int[]{2,10,2019}));
    }


}
