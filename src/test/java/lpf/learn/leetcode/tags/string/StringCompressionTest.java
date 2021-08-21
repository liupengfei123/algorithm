package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class StringCompressionTest {

    @Test
    public void test1() {
        StringCompression temp = new StringCompression();
        Assert.assertEquals(6, temp.compress(new char[]{'a','a','b','b','c','c','c'}));
    }

    @Test
    public void test2() {
        StringCompression temp = new StringCompression();
        Assert.assertEquals(1, temp.compress(new char[]{'a'}));
    }

    @Test
    public void test3() {
        StringCompression temp = new StringCompression();
        Assert.assertEquals(4, temp.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }

    @Test
    public void test4() {
        StringCompression temp = new StringCompression();
        Assert.assertEquals(6, temp.compress(new char[]{'a','b','c','a','b','c'}));
    }
}
