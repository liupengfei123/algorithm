package lpf.learn.leetcode.game.weekly349;

import org.junit.Assert;
import org.junit.Test;

public class LexicographicallySmallestStringAfterSubstringOperationTest {
    @Test
    public void test1(){
        LexicographicallySmallestStringAfterSubstringOperation test = new LexicographicallySmallestStringAfterSubstringOperation();
        Assert.assertEquals("baabc", test.smallestString("cbabc"));
    }

    @Test
    public void test2(){
        LexicographicallySmallestStringAfterSubstringOperation test = new LexicographicallySmallestStringAfterSubstringOperation();
        Assert.assertEquals("abaab", test.smallestString("acbbc"));
    }

    @Test
    public void test3(){
        LexicographicallySmallestStringAfterSubstringOperation test = new LexicographicallySmallestStringAfterSubstringOperation();
        Assert.assertEquals("kddsbncd", test.smallestString("leetcode"));
    }

    @Test
    public void test4(){
        LexicographicallySmallestStringAfterSubstringOperation test = new LexicographicallySmallestStringAfterSubstringOperation();
        Assert.assertEquals("z", test.smallestString("a"));
    }

    @Test
    public void test5(){
        LexicographicallySmallestStringAfterSubstringOperation test = new LexicographicallySmallestStringAfterSubstringOperation();
        Assert.assertEquals("aaaz", test.smallestString("aaaa"));
    }
}
