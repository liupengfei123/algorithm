package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class DesignAddAndSearchWordsDataStructureTest {

    @Test
    public void test1() {
        DesignAddAndSearchWordsDataStructure temp = new DesignAddAndSearchWordsDataStructure();
        temp.addWord("bad");
        temp.addWord("dad");
        temp.addWord("mad");
        Assert.assertFalse(temp.search("pad"));
        Assert.assertTrue(temp.search("bad"));
        Assert.assertTrue(temp.search(".ad"));
        Assert.assertTrue(temp.search("b.."));
    }

    @Test
    public void test2() {
        DesignAddAndSearchWordsDataStructure temp = new DesignAddAndSearchWordsDataStructure();
        temp.addWord("bad");
        temp.addWord("dad");
        Assert.assertFalse(temp.search("pad"));
        Assert.assertTrue(temp.search("bad"));
        Assert.assertTrue(temp.search(".ad"));
        Assert.assertFalse(temp.search("m.."));
        temp.addWord("mad");
        Assert.assertTrue(temp.search("m.."));
    }

    @Test
    public void test3() {
        DesignAddAndSearchWordsDataStructure temp = new DesignAddAndSearchWordsDataStructure();
        temp.addWord("at");
        temp.addWord("and");
        temp.addWord("an");
        temp.addWord("add");

        Assert.assertFalse(temp.search("a"));
        Assert.assertFalse(temp.search(".at"));
        temp.addWord("bat");
        Assert.assertTrue(temp.search(".at"));
        Assert.assertTrue(temp.search("an."));
        Assert.assertFalse(temp.search("a.d."));
        Assert.assertFalse(temp.search("b."));
        Assert.assertTrue(temp.search("a.d"));
        Assert.assertFalse(temp.search("."));
    }
}
