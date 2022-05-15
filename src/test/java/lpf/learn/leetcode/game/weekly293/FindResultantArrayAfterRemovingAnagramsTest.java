package lpf.learn.leetcode.game.weekly293;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindResultantArrayAfterRemovingAnagramsTest {
    @Test
    public void test1(){

        FindResultantArrayAfterRemovingAnagrams test = new FindResultantArrayAfterRemovingAnagrams();

        Assert.assertEquals(Arrays.asList("abba","cd"), test.removeAnagrams(new String[]{"abba","baba","bbaa","cd","cd"}));
    }

    @Test
    public void test2(){

        FindResultantArrayAfterRemovingAnagrams test = new FindResultantArrayAfterRemovingAnagrams();

        Assert.assertEquals(Arrays.asList("a","b","c","d","e"), test.removeAnagrams(new String[]{"a","b","c","d","e"}));
    }

    @Test
    public void test3(){
        FindResultantArrayAfterRemovingAnagrams test = new FindResultantArrayAfterRemovingAnagrams();

        Assert.assertEquals(Arrays.asList("a","b","a"), test.removeAnagrams(new String[]{"a","b","a"}));
    }
}
