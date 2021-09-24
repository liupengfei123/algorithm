package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class FlipStringToMonotoneIncreasingTest {

    @Test
    public void test1(){
        FlipStringToMonotoneIncreasing test = new FlipStringToMonotoneIncreasing();
        Assert.assertEquals(1, test.minFlipsMonoIncr("00110"));
    }

    @Test
    public void test2(){
        FlipStringToMonotoneIncreasing test = new FlipStringToMonotoneIncreasing();
        Assert.assertEquals(2, test.minFlipsMonoIncr("010110"));
    }

    @Test
    public void test3(){
        FlipStringToMonotoneIncreasing test = new FlipStringToMonotoneIncreasing();
        Assert.assertEquals(2, test.minFlipsMonoIncr("00011000"));
    }

}
