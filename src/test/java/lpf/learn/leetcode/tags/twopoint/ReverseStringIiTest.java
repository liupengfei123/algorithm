package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringIiTest {

    @Test
    public void test1() {
        ReverseStringIi temp = new ReverseStringIi();
        Assert.assertEquals("bacdfeg", temp.reverseStr("abcdefg", 2));
    }

    @Test
    public void test2() {
        ReverseStringIi temp = new ReverseStringIi();
        Assert.assertEquals("bacd", temp.reverseStr("abcd", 2));
    }

    @Test
    public void test3() {
        ReverseStringIi temp = new ReverseStringIi();
        Assert.assertEquals("cbadefg", temp.reverseStr("abcdefg", 3));
    }

}
