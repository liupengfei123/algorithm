package lpf.learn.leetcode.tags.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class ReplaceAllSToAvoidConsecutiveRepeatingCharactersTest {

    @Test
    public void test1() {
        ReplaceAllSToAvoidConsecutiveRepeatingCharacters temp = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters();
        Assert.assertEquals("azs", temp.modifyString("?zs"));
    }

    @Test
    public void test2() {
        ReplaceAllSToAvoidConsecutiveRepeatingCharacters temp = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters();
        Assert.assertEquals("ubvaw", temp.modifyString("ubv?w"));
    }

    @Test
    public void test3() {
        ReplaceAllSToAvoidConsecutiveRepeatingCharacters temp = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters();
        Assert.assertEquals("jaqgacb", temp.modifyString("j?qg??b"));
    }

    @Test
    public void test4() {
        ReplaceAllSToAvoidConsecutiveRepeatingCharacters temp = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters();
        Assert.assertEquals("abywaipkja", temp.modifyString("??yw?ipkj?"));
    }
}
