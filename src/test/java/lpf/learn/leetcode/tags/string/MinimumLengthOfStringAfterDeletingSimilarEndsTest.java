package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class MinimumLengthOfStringAfterDeletingSimilarEndsTest {

    @Test
    public void test1() {
        MinimumLengthOfStringAfterDeletingSimilarEnds temp = new MinimumLengthOfStringAfterDeletingSimilarEnds();
        Assert.assertEquals(2, temp.minimumLength("ca"));
    }

    @Test
    public void test2() {
        MinimumLengthOfStringAfterDeletingSimilarEnds temp = new MinimumLengthOfStringAfterDeletingSimilarEnds();
        Assert.assertEquals(0, temp.minimumLength("cabaabac"));
    }

    @Test
    public void test3() {
        MinimumLengthOfStringAfterDeletingSimilarEnds temp = new MinimumLengthOfStringAfterDeletingSimilarEnds();
        Assert.assertEquals(3, temp.minimumLength("aabccabba"));
    }
}
