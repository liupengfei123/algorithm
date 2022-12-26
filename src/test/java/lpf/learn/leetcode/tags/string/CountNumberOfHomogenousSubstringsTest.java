package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

public class CountNumberOfHomogenousSubstringsTest {
    @Test
    public void test1() {
        CountNumberOfHomogenousSubstrings temp = new CountNumberOfHomogenousSubstrings();
        Assert.assertEquals(13, temp.countHomogenous("abbcccaa"));
    }

    @Test
    public void test2() {
        CountNumberOfHomogenousSubstrings temp = new CountNumberOfHomogenousSubstrings();
        Assert.assertEquals(2, temp.countHomogenous("xy"));
    }

    @Test
    public void test3() {
        CountNumberOfHomogenousSubstrings temp = new CountNumberOfHomogenousSubstrings();
        Assert.assertEquals(15, temp.countHomogenous("zzzzz"));
    }
}
