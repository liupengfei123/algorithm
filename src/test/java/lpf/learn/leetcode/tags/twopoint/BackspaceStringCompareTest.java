package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class BackspaceStringCompareTest {
    @Test
    public void test1(){
        BackspaceStringCompare test = new BackspaceStringCompare();
        Assert.assertTrue(test.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    public void test2(){
        BackspaceStringCompare test = new BackspaceStringCompare();
        Assert.assertTrue(test.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void test3(){
        BackspaceStringCompare test = new BackspaceStringCompare();
        Assert.assertFalse(test.backspaceCompare("a#c", "b"));
    }

    @Test
    public void test4(){
        BackspaceStringCompare test = new BackspaceStringCompare();
        Assert.assertTrue(test.backspaceCompare("abdfawezdzz##gagaea#wz#ezz", "abdfaf##awezdgagaewezzppp###"));
    }

    @Test
    public void test5(){
        BackspaceStringCompare test = new BackspaceStringCompare();
        Assert.assertTrue(test.backspaceCompare("nzp#o#g", "b#nzp#o#g"));
    }
}
