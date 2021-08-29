package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class SumOfAllOddLengthSubarraysTest {

    @Test
    public void test1(){
        SumOfAllOddLengthSubarrays test = new SumOfAllOddLengthSubarrays();
        Assert.assertEquals(58, test.sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
    }

    @Test
    public void test2(){
        SumOfAllOddLengthSubarrays test = new SumOfAllOddLengthSubarrays();
        Assert.assertEquals(3, test.sumOddLengthSubarrays(new int[]{1,2}));
    }

    @Test
    public void test3(){
        SumOfAllOddLengthSubarrays test = new SumOfAllOddLengthSubarrays();
        Assert.assertEquals(66, test.sumOddLengthSubarrays(new int[]{10,11,12}));
    }
}
