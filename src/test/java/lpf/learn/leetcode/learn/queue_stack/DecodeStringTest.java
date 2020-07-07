package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Assert;
import org.junit.Test;

public class DecodeStringTest {

    @Test
    public void test() {
        DecodeString temp = new DecodeString();

        Assert.assertEquals("ddddddd", temp.decodeString("ddddddd"));
        Assert.assertEquals("aaabcbc", temp.decodeString("3[a]2[bc]"));
        Assert.assertEquals("accaccacc", temp.decodeString("3[a2[c]]"));
        Assert.assertEquals("abdaccaccacc", temp.decodeString("abd3[a2[c]]"));
        Assert.assertEquals("abcabccdcdcdef", temp.decodeString("2[abc]3[cd]ef"));
        Assert.assertEquals("abdabcabccdcdcdef", temp.decodeString("abd2[abc]3[cd]ef"));
        Assert.assertEquals("abccdcdcdxyz", temp.decodeString("abc3[cd]xyz"));

        Assert.assertEquals("abccdcdcdcdcdcdcdcdcdcdcdxyz", temp.decodeString("abc11[cd]xyz"));

        Assert.assertEquals("", temp.decodeString(""));





    }


}
