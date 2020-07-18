package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class RemoveAllAdjacentDuplicatesInStringIITest {

    @Test
    public void test(){
        RemoveAllAdjacentDuplicatesInStringII test = new RemoveAllAdjacentDuplicatesInStringII();

        Assert.assertEquals("abcd", test.removeDuplicates("abcd", 2));

        Assert.assertEquals("aa", test.removeDuplicates("deeedbbcccbdaa", 3));

        Assert.assertEquals("ps", test.removeDuplicates("pbbcggttciiippooaais", 2));

        Assert.assertEquals("pis", test.removeDuplicates("pbbcggttciiippooaaiis", 2));



        Assert.assertEquals("abcd", test.removeDuplicates2("abcd", 2));

        Assert.assertEquals("aa", test.removeDuplicates2("deeedbbcccbdaa", 3));

        Assert.assertEquals("ps", test.removeDuplicates2("pbbcggttciiippooaais", 2));

        Assert.assertEquals("pis", test.removeDuplicates2("pbbcggttciiippooaaiis", 2));

    }
}
