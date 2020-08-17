package lpf.learn.leetcode.learn.hash;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsomorphicStringsTest {

    @Test
    public void test1(){
        IsomorphicStrings test = new IsomorphicStrings();
        assertTrue(test.isIsomorphic("egg", "add"));
    }

    @Test
    public void test2(){
        IsomorphicStrings test = new IsomorphicStrings();
        assertFalse(test.isIsomorphic("foo", "bar"));
    }

    @Test
    public void test3(){
        IsomorphicStrings test = new IsomorphicStrings();
        assertTrue(test.isIsomorphic("paper", "title"));
    }


}
