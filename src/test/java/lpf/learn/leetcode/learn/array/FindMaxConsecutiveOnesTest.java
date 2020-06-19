package lpf.learn.leetcode.learn.array;


import org.junit.Assert;
import org.junit.Test;

public class FindMaxConsecutiveOnesTest {
    @Test
    public void findMaxConsecutiveOnesTest(){
        FindMaxConsecutiveOnes temp = new FindMaxConsecutiveOnes();

        Assert.assertEquals(3, temp.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));

        Assert.assertEquals(2, temp.findMaxConsecutiveOnes(new int[]{1,1}));

        Assert.assertEquals(1, temp.findMaxConsecutiveOnes(new int[]{1}));

        Assert.assertEquals(0, temp.findMaxConsecutiveOnes(new int[]{0}));

    }

}
