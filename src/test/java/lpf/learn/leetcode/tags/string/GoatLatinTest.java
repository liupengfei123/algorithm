package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class GoatLatinTest {

    @Test
    public void test1() {
        GoatLatin temp = new GoatLatin();
        Assert.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", temp.toGoatLatin("I speak Goat Latin"));
    }

    @Test
    public void test2() {
        GoatLatin temp = new GoatLatin();
        Assert.assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                temp.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

    @Test
    public void test3() {
        GoatLatin temp = new GoatLatin();
        Assert.assertEquals("Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa",
                temp.toGoatLatin("Each word consists of lowercase and uppercase letters only"));
    }

    @Test
    public void test4() {
        CountAndSay temp = new CountAndSay();
        Assert.assertEquals("13211311123113112211", temp.countAndSay(10));
    }
}
