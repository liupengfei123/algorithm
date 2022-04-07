package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class RotateStringTest {

    @Test
    public void test1() {
        RotateString temp = new RotateString();
        Assert.assertTrue(temp.rotateString("abcde", "cdeab"));
    }

    @Test
    public void test2() {
        RotateString temp = new RotateString();
        Assert.assertFalse(temp.rotateString("abcde", "abced"));
    }

    @Test
    public void test3() {
        RotateString temp = new RotateString();
        Assert.assertTrue(temp.rotateString("aaababaabbbaab", "babaabbbaabaaa"));
    }

    @Test
    public void test4() {
        RotateString temp = new RotateString();
        Assert.assertFalse(temp.rotateString("aaaaaabaaaaaaaaaaaabaaaabaaa", "aaaaabaaaaaaaaaaaaabaaaabaaa"));
    }

    @Test
    public void test5() {
        RotateString temp = new RotateString();
        Assert.assertTrue(temp.rotateString("a", "a"));
    }

    @Test
    public void test6() {
        RotateString temp = new RotateString();
        Assert.assertFalse(temp.rotateString("a", "b"));
    }
}
