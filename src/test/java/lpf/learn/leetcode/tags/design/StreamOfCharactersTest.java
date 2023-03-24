package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class StreamOfCharactersTest {

    @Test
    public void test1() {
        StreamOfCharacters temp = new StreamOfCharacters(new String[]{"cd", "f", "kl"});

        Assert.assertFalse(temp.query('a'));
        Assert.assertFalse(temp.query('b'));
        Assert.assertFalse(temp.query('c'));
        Assert.assertTrue(temp.query('d'));
        Assert.assertFalse(temp.query('e'));
        Assert.assertTrue(temp.query('f'));
        Assert.assertFalse(temp.query('g'));
        Assert.assertFalse(temp.query('h'));
        Assert.assertFalse(temp.query('i'));
        Assert.assertFalse(temp.query('j'));
        Assert.assertFalse(temp.query('k'));
        Assert.assertTrue(temp.query('l'));
    }

    @Test
    public void test2() {
        StreamOfCharacters temp = new StreamOfCharacters(new String[]{"abcd", "fd", "kil"});

        Assert.assertFalse(temp.query('a'));
        Assert.assertFalse(temp.query('b'));
        Assert.assertFalse(temp.query('c'));
        Assert.assertTrue(temp.query('d'));
        Assert.assertFalse(temp.query('e'));
        Assert.assertFalse(temp.query('f'));
        Assert.assertFalse(temp.query('g'));
        Assert.assertFalse(temp.query('h'));
        Assert.assertFalse(temp.query('i'));
        Assert.assertFalse(temp.query('j'));
        Assert.assertFalse(temp.query('k'));
        Assert.assertFalse(temp.query('l'));
    }


}
