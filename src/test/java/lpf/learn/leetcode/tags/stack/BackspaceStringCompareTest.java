package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class BackspaceStringCompareTest {

    @Test
    public void test(){
        BackspaceStringCompare test = new BackspaceStringCompare();

        Assert.assertTrue(test.backspaceCompare("ab#c", "ad#c"));
        Assert.assertTrue(test.backspaceCompare("ab##", "c#d#"));
        Assert.assertTrue(test.backspaceCompare("a##c", "#a#c"));
        Assert.assertFalse(test.backspaceCompare("a#c", "b"));

    }
}
