package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class OddStringDifferenceTest {

    @Test
    public void test1() {
        OddStringDifference temp = new OddStringDifference();
        Assert.assertEquals("abc", temp.oddString(new String[]{"adc","wzy","abc"}));
    }

    @Test
    public void test2() {
        OddStringDifference temp = new OddStringDifference();
        Assert.assertEquals("bob", temp.oddString(new String[]{"aaa","bob","ccc","ddd"}));
    }
}
