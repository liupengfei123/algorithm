package lpf.learn.leetcode.tags.hash;

import org.junit.Assert;
import org.junit.Test;

public class CountTheNumberOfConsistentStringsTest {
    @Test
    public void test1(){
        CountTheNumberOfConsistentStrings test = new CountTheNumberOfConsistentStrings();
        Assert.assertEquals(2, test.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
    }

    @Test
    public void test2(){
        CountTheNumberOfConsistentStrings test = new CountTheNumberOfConsistentStrings();
        Assert.assertEquals(7, test.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
    }

    @Test
    public void test3(){
        CountTheNumberOfConsistentStrings test = new CountTheNumberOfConsistentStrings();
        Assert.assertEquals(4, test.countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }
}
