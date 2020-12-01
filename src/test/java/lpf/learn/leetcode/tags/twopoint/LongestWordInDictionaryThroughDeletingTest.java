package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LongestWordInDictionaryThroughDeletingTest {
    @Test
    public void test1(){
        LongestWordInDictionaryThroughDeleting test = new LongestWordInDictionaryThroughDeleting();
        List<String> list = Arrays.asList("ale","apple","monkey","plea");
        Assert.assertEquals("apple", test.findLongestWord("abpcplea", list));
    }

    @Test
    public void test2(){
        LongestWordInDictionaryThroughDeleting test = new LongestWordInDictionaryThroughDeleting();
        List<String> list = Arrays.asList("ale","apple","monkey","plea");
        Assert.assertEquals("plea", test.findLongestWord("pabcplea", list));
    }

    @Test
    public void test3(){
        LongestWordInDictionaryThroughDeleting test = new LongestWordInDictionaryThroughDeleting();
        List<String> list = Arrays.asList("a","b","c");
        Assert.assertEquals("a", test.findLongestWord("pabcplea", list));
    }

    @Test
    public void test4(){
        LongestWordInDictionaryThroughDeleting test = new LongestWordInDictionaryThroughDeleting();
        List<String> list = Arrays.asList("aap","b","c");
        Assert.assertEquals("b", test.findLongestWord("pabcplea", list));
    }

    @Test
    public void test5(){
        LongestWordInDictionaryThroughDeleting test = new LongestWordInDictionaryThroughDeleting();
        List<String> list = Arrays.asList("ap","bpea","c");
        Assert.assertEquals("bpea", test.findLongestWord("pabcplea", list));
    }

    @Test
    public void test6(){
        LongestWordInDictionaryThroughDeleting test = new LongestWordInDictionaryThroughDeleting();
        List<String> list = Arrays.asList("ba","ab","a","b");
        Assert.assertEquals("ab", test.findLongestWord("bab", list));
    }
}
