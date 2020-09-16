package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class LargestNumberAtLeastTwiceOfOthersTest {

    @Test
    public void test1(){
        LargestNumberAtLeastTwiceOfOthers test = new LargestNumberAtLeastTwiceOfOthers();
        Assert.assertEquals(-1, test.dominantIndex(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2(){
        LargestNumberAtLeastTwiceOfOthers test = new LargestNumberAtLeastTwiceOfOthers();
        Assert.assertEquals(1, test.dominantIndex(new int[]{3, 6, 1, 0}));
    }

}
