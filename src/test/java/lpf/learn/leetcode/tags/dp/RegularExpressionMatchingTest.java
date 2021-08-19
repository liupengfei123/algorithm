package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatchingTest {
    @Test
    public void test1(){
        RegularExpressionMatching test = new RegularExpressionMatching();
        Assert.assertFalse(test.isMatch("aa", "a"));
    }

    @Test
    public void test2(){
        RegularExpressionMatching test = new RegularExpressionMatching();
        Assert.assertTrue(test.isMatch("aa", "a*"));
    }

    @Test
    public void test3(){
        RegularExpressionMatching test = new RegularExpressionMatching();
        Assert.assertTrue(test.isMatch("aaab", ".*"));
    }

    @Test
    public void test4(){
        RegularExpressionMatching test = new RegularExpressionMatching();
        Assert.assertTrue(test.isMatch("ab", ".*ab"));
    }

    @Test
    public void test5(){
        RegularExpressionMatching test = new RegularExpressionMatching();
        Assert.assertTrue(test.isMatch("aaaab", "c*a*b"));
    }

    @Test
    public void test6(){
        RegularExpressionMatching test = new RegularExpressionMatching();
        Assert.assertFalse(test.isMatch("mississippi", "mis*is*p*."));
    }


    @Test
    public void test7(){
        RegularExpressionMatching test = new RegularExpressionMatching();
        Assert.assertTrue(test.isMatch("aaa", "ab*ac*a"));
    }

    @Test
    public void test8(){
        RegularExpressionMatching test = new RegularExpressionMatching();
        Assert.assertTrue(test.isMatch("aaa", "ab*a*c*a"));
    }


    @Test
    public void test9(){
        RegularExpressionMatching test = new RegularExpressionMatching();
        Assert.assertFalse(test.isMatch("a", "ab*a"));
    }


    @Test
    public void test10(){
        RegularExpressionMatching test = new RegularExpressionMatching();
        Assert.assertTrue(test.isMatch("a", "ab*"));
    }

}
