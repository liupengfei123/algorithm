package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class AddBinaryTest {

    @Test
    public void test1() {
        AddBinary temp = new AddBinary();
        Assert.assertEquals("100", temp.addBinary("11", "1"));
    }

    @Test
    public void test2() {
        AddBinary temp = new AddBinary();
        Assert.assertEquals("10101", temp.addBinary("1010", "1011"));
    }

    @Test
    public void test3() {
        AddBinary temp = new AddBinary();
        Assert.assertEquals("11", temp.addBinary("10", "1"));
    }
}
