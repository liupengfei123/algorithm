package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class MinimumNumberOfFrogsCroakingTest {

    @Test
    public void test1() {
        MinimumNumberOfFrogsCroaking temp = new MinimumNumberOfFrogsCroaking();
        Assert.assertEquals(1, temp.minNumberOfFrogs("croakcroak"));
    }

    @Test
    public void test2() {
        MinimumNumberOfFrogsCroaking temp = new MinimumNumberOfFrogsCroaking();
        Assert.assertEquals(2, temp.minNumberOfFrogs("crcoakroak"));
    }

    @Test
    public void test3() {
        MinimumNumberOfFrogsCroaking temp = new MinimumNumberOfFrogsCroaking();
        Assert.assertEquals(-1, temp.minNumberOfFrogs("croakcrook"));
    }

    @Test
    public void test4() {
        MinimumNumberOfFrogsCroaking temp = new MinimumNumberOfFrogsCroaking();
        Assert.assertEquals(-1, temp.minNumberOfFrogs("croakcroa"));
    }
}
