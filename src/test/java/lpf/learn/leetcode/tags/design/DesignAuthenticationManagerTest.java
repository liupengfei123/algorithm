package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class DesignAuthenticationManagerTest {

    @Test
    public void test1() {
        DesignAuthenticationManager temp = new DesignAuthenticationManager(5);
        temp.renew("aaa", 1);
        temp.generate("aaa", 2);
        Assert.assertEquals(1, temp.countUnexpiredTokens(6));
        temp.generate("bbb", 7);
        temp.renew("aaa", 8);
        temp.renew("bbb", 10);
        Assert.assertEquals(0, temp.countUnexpiredTokens(15));
    }

    @Test
    public void test2() {
        DesignAuthenticationManager temp = new DesignAuthenticationManager(233);

        Assert.assertEquals(0, temp.countUnexpiredTokens(41));
        temp.renew("uy", 42);
        temp.renew("aaqj", 49);
        Assert.assertEquals(0, temp.countUnexpiredTokens(72));
        temp.renew("gy", 77);
        Assert.assertEquals(0, temp.countUnexpiredTokens(128));
        temp.generate("qyw", 130);

        Assert.assertEquals(1, temp.countUnexpiredTokens(136));
        temp.renew("vhy", 145);
        Assert.assertEquals(1, temp.countUnexpiredTokens(152));
        temp.renew("tmxe", 186);
        Assert.assertEquals(1, temp.countUnexpiredTokens(205));
        Assert.assertEquals(1, temp.countUnexpiredTokens(218));
        Assert.assertEquals(1, temp.countUnexpiredTokens(235));
        temp.generate("qdj", 255);

        Assert.assertEquals(2, temp.countUnexpiredTokens(267));
        Assert.assertEquals(2, temp.countUnexpiredTokens(270));
        Assert.assertEquals(2, temp.countUnexpiredTokens(328));
        Assert.assertEquals(2, temp.countUnexpiredTokens(330));
        temp.generate("bmji", 361);
        Assert.assertEquals(2, temp.countUnexpiredTokens(383));
        Assert.assertEquals(2, temp.countUnexpiredTokens(400));

        temp.renew("bbacy", 413);
        temp.generate("qz", 453);
        temp.generate("uopu", 496);
        temp.renew("ot", 523);
        Assert.assertEquals(3, temp.countUnexpiredTokens(530));
        temp.renew("wsr", 554);
        Assert.assertEquals(3, temp.countUnexpiredTokens(564));
        Assert.assertEquals(3, temp.countUnexpiredTokens(571));
        temp.generate("bbacy", 582);
        temp.generate("fckwq", 586);
        temp.renew("bmji", 598);
        Assert.assertEquals(4, temp.countUnexpiredTokens(657));
        Assert.assertEquals(3, temp.countUnexpiredTokens(693));
        temp.generate("k", 699);
        temp.renew("g", 720);
        temp.renew("htgrp", 723);
        temp.generate("jhtej", 725);

        Assert.assertEquals(4, temp.countUnexpiredTokens(734));
        temp.renew("uiro", 742);
        temp.generate("simgl", 754);
        Assert.assertEquals(5, temp.countUnexpiredTokens(760));
        temp.generate("wsr", 772);
        Assert.assertEquals(6, temp.countUnexpiredTokens(814));
        temp.generate("d", 822);
        temp.renew("k", 836);
        Assert.assertEquals(5, temp.countUnexpiredTokens(904));

        temp.renew("bvy", 906);
        Assert.assertEquals(5, temp.countUnexpiredTokens(926));
        temp.generate("pou", 941);
        Assert.assertEquals(6, temp.countUnexpiredTokens(953));
        Assert.assertEquals(5, temp.countUnexpiredTokens(959));
        temp.generate("ovhez", 977);
        temp.renew("ns", 990);
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
