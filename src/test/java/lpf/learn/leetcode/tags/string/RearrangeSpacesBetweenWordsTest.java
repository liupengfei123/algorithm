package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class RearrangeSpacesBetweenWordsTest {

    @Test
    public void test1() {
        RearrangeSpacesBetweenWords temp = new RearrangeSpacesBetweenWords();
        Assert.assertEquals("this   is   a   sentence", temp.reorderSpaces("  this   is  a sentence "));
    }

    @Test
    public void test2() {
        RearrangeSpacesBetweenWords temp = new RearrangeSpacesBetweenWords();
        Assert.assertEquals("a ", temp.reorderSpaces("a "));
    }

    @Test
    public void test3() {
        RearrangeSpacesBetweenWords temp = new RearrangeSpacesBetweenWords();
        Assert.assertEquals("practice   makes   perfect ", temp.reorderSpaces(" practice   makes   perfect"));
    }
    @Test
    public void test4() {
        RearrangeSpacesBetweenWords temp = new RearrangeSpacesBetweenWords();
        Assert.assertEquals("hello   world", temp.reorderSpaces("hello   world"));
    }

    @Test
    public void test5() {
        RearrangeSpacesBetweenWords temp = new RearrangeSpacesBetweenWords();
        Assert.assertEquals("walks  udp  package  into  bar  a ", temp.reorderSpaces("  walks  udp package   into  bar a"));
    }
}
