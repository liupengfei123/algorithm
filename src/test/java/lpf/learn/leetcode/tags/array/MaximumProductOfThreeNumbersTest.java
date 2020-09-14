package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MaximumProductOfThreeNumbersTest {

    @Test
    public void test1() {
        MaximumProductOfThreeNumbers test = new MaximumProductOfThreeNumbers();
        Assert.assertEquals(24, test.maximumProduct(new int[]{-100, 1, 2, 3, 4}));
    }

    @Test
    public void test2() {
        MaximumProductOfThreeNumbers test = new MaximumProductOfThreeNumbers();
        Assert.assertEquals(400, test.maximumProduct(new int[]{-100, -1, 2, 3, 4}));
    }

    @Test
    public void test3() {
        MaximumProductOfThreeNumbers test = new MaximumProductOfThreeNumbers();
        Assert.assertEquals(24, test.maximumProduct(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test4() {
        MaximumProductOfThreeNumbers test = new MaximumProductOfThreeNumbers();
        Assert.assertEquals(6, test.maximumProduct(new int[]{1, 2, 3}));
    }
}
