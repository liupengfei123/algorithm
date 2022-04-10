package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCodeWordsTest {

    @Test
    public void test1() {
        UniqueMorseCodeWords temp = new UniqueMorseCodeWords();
        Assert.assertEquals(2, temp.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }

    @Test
    public void test2() {
        UniqueMorseCodeWords temp = new UniqueMorseCodeWords();
        Assert.assertEquals(1, temp.uniqueMorseRepresentations(new String[]{"a"}));
    }

}
