package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class IsSubsequenceTest {
    @Test
    public void test1(){
        IsSubsequence	 test = new IsSubsequence();
        Assert.assertTrue(test.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void test2(){
        IsSubsequence	 test = new IsSubsequence();
        Assert.assertFalse(test.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void test3(){
        IsSubsequence	 test = new IsSubsequence();
        Assert.assertTrue(test.isSubsequence("abc", "ahbcgdc"));
    }


}
