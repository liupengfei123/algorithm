package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class CountCompleteSubstringsTest {

    @Test
    public void test1(){
        CountCompleteSubstrings test = new CountCompleteSubstrings();
        Assert.assertEquals(3, test.countCompleteSubstrings("igigee", 2));
    }

    @Test
    public void test2(){
        CountCompleteSubstrings test = new CountCompleteSubstrings();
        Assert.assertEquals(6, test.countCompleteSubstrings("aaabbbccc", 3));
    }

    @Test
    public void test3(){
        CountCompleteSubstrings test = new CountCompleteSubstrings();
        Assert.assertEquals(11, test.countCompleteSubstrings("igigee", 1));
    }

    @Test
    public void test4(){
        CountCompleteSubstrings test = new CountCompleteSubstrings();
        Assert.assertEquals(1, test.countCompleteSubstrings("gvgvvgv", 2));
    }

}
