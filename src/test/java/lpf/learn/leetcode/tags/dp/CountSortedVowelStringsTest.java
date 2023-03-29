package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class CountSortedVowelStringsTest {
    @Test
    public void test1(){
        CountSortedVowelStrings test = new CountSortedVowelStrings();
        Assert.assertEquals(5, test.countVowelStrings(1));
    }

    @Test
    public void test2(){
        CountSortedVowelStrings test = new CountSortedVowelStrings();
        Assert.assertEquals(15, test.countVowelStrings(2));
    }

    @Test
    public void test3(){
        CountSortedVowelStrings test = new CountSortedVowelStrings();
        Assert.assertEquals(66045, test.countVowelStrings(33));
    }
}
