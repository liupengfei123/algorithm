package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class LetterTilePossibilitiesTest {

    @Test
    public void test1() {
        LetterTilePossibilities temp = new LetterTilePossibilities();
        Assert.assertEquals(8, temp.numTilePossibilities("AAB"));
    }

    @Test
    public void test2() {
        LetterTilePossibilities temp = new LetterTilePossibilities();
        Assert.assertEquals(188, temp.numTilePossibilities("AAABBC"));
    }

    @Test
    public void test3() {
        LetterTilePossibilities temp = new LetterTilePossibilities();
        Assert.assertEquals(1, temp.numTilePossibilities("V"));
    }

    @Test
    public void test4() {
        LetterTilePossibilities temp = new LetterTilePossibilities();
        Assert.assertEquals(2467, temp.numTilePossibilities("AADMAFV"));
    }

    @Test
    public void test5() {
        LetterTilePossibilities temp = new LetterTilePossibilities();
        Assert.assertEquals(7012, temp.numTilePossibilities("QWERTYY"));
    }
    @Test
    public void test6() {
        LetterTilePossibilities temp = new LetterTilePossibilities();
        Assert.assertEquals(13699, temp.numTilePossibilities("QWERTYU"));
    }
}
