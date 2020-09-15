package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class OneBitAnd2BitCharactersTest {

    @Test
    public void test1() {
        OneBitAnd2BitCharacters test = new OneBitAnd2BitCharacters();
        Assert.assertTrue(test.isOneBitCharacter(new int[]{1, 0, 0}));
    }

    @Test
    public void test2() {
        OneBitAnd2BitCharacters test = new OneBitAnd2BitCharacters();
        Assert.assertTrue(test.isOneBitCharacter(new int[]{1, 1, 0}));
    }

    @Test
    public void test3() {
        OneBitAnd2BitCharacters test = new OneBitAnd2BitCharacters();
        Assert.assertFalse(test.isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }

    @Test
    public void test4() {
        OneBitAnd2BitCharacters test = new OneBitAnd2BitCharacters();
        Assert.assertTrue(test.isOneBitCharacter(new int[]{0, 0, 0, 0}));
    }

    @Test
    public void test5() {
        OneBitAnd2BitCharacters test = new OneBitAnd2BitCharacters();
        Assert.assertTrue(test.isOneBitCharacter(new int[]{0, 1, 0, 0}));
    }
}
