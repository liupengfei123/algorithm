package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class InterleavingStringTest {
    @Test
    public void test1(){
        InterleavingString test = new InterleavingString();
        Assert.assertTrue(test.isInterleave("", "", ""));
    }

    @Test
    public void test2(){
        InterleavingString test = new InterleavingString();
        Assert.assertFalse(test.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    public void test3(){
        InterleavingString test = new InterleavingString();
        Assert.assertTrue(test.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    public void test4(){
        InterleavingString test = new InterleavingString();
        Assert.assertTrue(test.isInterleave("bc", "cd", "bcdc"));
    }

    @Test
    public void test5(){
        InterleavingString test = new InterleavingString();
        Assert.assertTrue(test.isInterleave("aaaaaa", "aaaaaa", "aaaaaaaaaaaa"));
    }

    @Test
    public void test6(){
        InterleavingString test = new InterleavingString();
        Assert.assertTrue(test.isInterleave("aabccabc", "dbbabc", "aabdbbccababcc"));
    }

    @Test
    public void test7(){
        InterleavingString test = new InterleavingString();
        Assert.assertFalse(test.isInterleave(
                "abababababababababababababababababababababababababababababababababababababababababababababababababbb",
                "babababababababababababababababababababababababababababababababababababababababababababababababaaaba",
                "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababbb"));
    }
}
