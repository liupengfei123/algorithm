package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class SplitAStringInBalancedStringsTest {

    @Test
    public void test1() {
        SplitAStringInBalancedStrings temp = new SplitAStringInBalancedStrings();
        Assert.assertEquals(4, temp.balancedStringSplit("RLRRLLRLRL"));
    }

    @Test
    public void test2() {
        SplitAStringInBalancedStrings temp = new SplitAStringInBalancedStrings();
        Assert.assertEquals(3, temp.balancedStringSplit("RLLLLRRRLR"));
    }

    @Test
    public void test3() {
        SplitAStringInBalancedStrings temp = new SplitAStringInBalancedStrings();
        Assert.assertEquals(1, temp.balancedStringSplit("LLLLRRRR"));
    }

    @Test
    public void test4() {
        SplitAStringInBalancedStrings temp = new SplitAStringInBalancedStrings();
        Assert.assertEquals(2, temp.balancedStringSplit("RLRRRLLRLL"));
    }
}
