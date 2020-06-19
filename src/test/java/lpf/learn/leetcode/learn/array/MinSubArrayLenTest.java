package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class MinSubArrayLenTest {

    @Test
    public void minSubArrayLenTest(){
        MinSubArrayLen temp = new MinSubArrayLen();

        Assert.assertEquals(2, temp.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));

        Assert.assertEquals(0, temp.minSubArrayLen(111, new int[]{2,3,1,2,4,3}));

        Assert.assertEquals(6, temp.minSubArrayLen(15, new int[]{2,3,1,2,4,3}));

        Assert.assertEquals(1, temp.minSubArrayLen(2, new int[]{2}));
    }
}
