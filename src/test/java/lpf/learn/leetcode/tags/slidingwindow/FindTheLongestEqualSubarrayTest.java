package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class FindTheLongestEqualSubarrayTest {

    @Test
    public void test1() {
        FindTheLongestEqualSubarray temp = new FindTheLongestEqualSubarray();
        Assert.assertEquals(3, temp.longestEqualSubarray(Arrays.asList(1,3,2,3,1,3), 3));
    }

    @Test
    public void test2() {
        FindTheLongestEqualSubarray temp = new FindTheLongestEqualSubarray();
        Assert.assertEquals(4, temp.longestEqualSubarray(Arrays.asList(1,1,2,2,1,1), 2));
    }

    @Test
    public void test3() {
        FindTheLongestEqualSubarray temp = new FindTheLongestEqualSubarray();
        Assert.assertEquals(4, temp.longestEqualSubarray(Arrays.asList(4,4,4,3,4), 1));
    }

    @Test
    public void test4() {
        FindTheLongestEqualSubarray temp = new FindTheLongestEqualSubarray();
        Assert.assertEquals(2, temp.longestEqualSubarray(Arrays.asList(1,2,3,4,5,1), 6));
    }

}
