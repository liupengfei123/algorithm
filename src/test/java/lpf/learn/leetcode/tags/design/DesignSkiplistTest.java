package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class DesignSkiplistTest {

    @Test
    public void test1() {
        DesignSkiplist temp = new DesignSkiplist();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        Assert.assertFalse(temp.search(0));   // 返回 false
        temp.add(4);
        Assert.assertTrue(temp.search(1));   // 返回 true
        Assert.assertFalse(temp.erase(0));    // 返回 false，0 不在跳表中
        Assert.assertTrue(temp.erase(1));    // 返回 true
        Assert.assertFalse(temp.search(1));   // 返回 false，1 已被擦除
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
