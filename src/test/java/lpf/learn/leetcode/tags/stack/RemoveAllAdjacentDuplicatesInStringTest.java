package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class RemoveAllAdjacentDuplicatesInStringTest {

    @Test
    public void test(){
        RemoveAllAdjacentDuplicatesInString test = new RemoveAllAdjacentDuplicatesInString();

        Assert.assertEquals("ca", test.removeDuplicates("abbaca"));
        Assert.assertEquals("cac", test.removeDuplicates("abbacac"));
        Assert.assertEquals("", test.removeDuplicates(""));
        Assert.assertEquals(null, test.removeDuplicates(null));
        Assert.assertEquals("a", test.removeDuplicates("abbacca"));

        Assert.assertEquals("", test.removeDuplicates("abcdeedcba"));
    }
}
