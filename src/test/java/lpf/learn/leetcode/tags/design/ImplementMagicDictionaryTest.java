package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class ImplementMagicDictionaryTest {

    @Test
    public void test1() {
        ImplementMagicDictionary temp = new ImplementMagicDictionary();
        temp.buildDict(new String[]{"hello", "leetcode"});

        Assert.assertFalse(temp.search("hello"));
        Assert.assertTrue(temp.search("hhllo"));
        Assert.assertTrue(temp.search("eello"));
        Assert.assertFalse(temp.search("hell"));
        Assert.assertFalse(temp.search("leetcoded"));
        Assert.assertTrue(temp.search("leeccode"));
    }

    @Test
    public void test2() {
        ImplementMagicDictionary temp = new ImplementMagicDictionary();
        temp.buildDict(new String[]{"a", "b", "ab"});

        Assert.assertTrue(temp.search("a"));
        Assert.assertTrue(temp.search("b"));
        Assert.assertTrue(temp.search("c"));
        Assert.assertTrue(temp.search("d"));
        Assert.assertTrue(temp.search("e"));
        Assert.assertTrue(temp.search("f"));
        Assert.assertFalse(temp.search("ab"));
        Assert.assertFalse(temp.search("ba"));
        Assert.assertFalse(temp.search("abc"));
    }
}
