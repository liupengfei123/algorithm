package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Assert;
import org.junit.Test;

public class OpenLockTest {

    @Test
    public void test() {
        OpenLock temp = new OpenLock();

        Assert.assertEquals(6, temp.openLock(new String[]{"0201","0101","0102","1212","2002"}, "0202"));

        Assert.assertEquals(1, temp.openLock(new String[]{"8888"}, "0009"));

        Assert.assertEquals(-1, temp.openLock(new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888"));

        Assert.assertEquals(-1, temp.openLock(new String[]{"0000"}, "8888"));

    }
}
