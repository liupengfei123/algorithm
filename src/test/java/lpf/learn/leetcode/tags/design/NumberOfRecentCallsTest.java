package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class NumberOfRecentCallsTest {

    @Test
    public void test1() {
        NumberOfRecentCalls temp = new NumberOfRecentCalls();
        Assert.assertEquals(1, temp.ping(1));
        Assert.assertEquals(2, temp.ping(100));
        Assert.assertEquals(3, temp.ping(3001));
        Assert.assertEquals(3, temp.ping(3002));
    }
}
