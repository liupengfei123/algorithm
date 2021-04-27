package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class CountAndSayTest {

    @Test
    public void test1() {
        CountAndSay temp = new CountAndSay();
        Assert.assertEquals("1", temp.countAndSay(1));
    }

    @Test
    public void test2() {
        CountAndSay temp = new CountAndSay();
        Assert.assertEquals("21", temp.countAndSay(3));
    }

    @Test
    public void test3() {
        CountAndSay temp = new CountAndSay();
        Assert.assertEquals("111221", temp.countAndSay(5));
    }

    @Test
    public void test4() {
        CountAndSay temp = new CountAndSay();
        Assert.assertEquals("13211311123113112211", temp.countAndSay(10));
    }
}
