package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

public class RangeModuleTest {

    @Test
    public void test1() {
        RangeModule temp = new RangeModule();

        temp.addRange(10, 20);
        temp.removeRange(14, 16);


        Assert.assertTrue(temp.queryRange(10, 14));
        Assert.assertFalse(temp.queryRange(13, 15));
        Assert.assertTrue(temp.queryRange(16, 17));
    }
}
