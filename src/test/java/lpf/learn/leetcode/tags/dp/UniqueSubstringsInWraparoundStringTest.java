package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class UniqueSubstringsInWraparoundStringTest {
    @Test
    public void test1(){
        UniqueSubstringsInWraparoundString test = new UniqueSubstringsInWraparoundString();
        Assert.assertEquals(1, test.findSubstringInWraproundString("a"));
    }

    @Test
    public void test2(){
        UniqueSubstringsInWraparoundString test = new UniqueSubstringsInWraparoundString();
        Assert.assertEquals(2, test.findSubstringInWraproundString("cac"));
    }

    @Test
    public void test3(){
        UniqueSubstringsInWraparoundString test = new UniqueSubstringsInWraparoundString();
        Assert.assertEquals(6, test.findSubstringInWraproundString("zab"));
    }

    @Test
    public void test4(){
        UniqueSubstringsInWraparoundString test = new UniqueSubstringsInWraparoundString();
        Assert.assertEquals(1079, test.findSubstringInWraproundString("zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyza"));
    }

    @Test
    public void test5(){
        UniqueSubstringsInWraparoundString test = new UniqueSubstringsInWraparoundString();
        Assert.assertEquals(400, test.findSubstringInWraproundString("zabcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwxyza"));
    }

    @Test
    public void test6(){
        UniqueSubstringsInWraparoundString test = new UniqueSubstringsInWraparoundString();
        Assert.assertEquals(55, test.findSubstringInWraproundString("zabcdefghiazabcdefghi"));
    }

    @Test
    public void test7(){
        UniqueSubstringsInWraparoundString test = new UniqueSubstringsInWraparoundString();
        Assert.assertEquals(10, test.findSubstringInWraproundString("zabcabc"));
    }

    @Test
    public void test8(){
        UniqueSubstringsInWraparoundString test = new UniqueSubstringsInWraparoundString();
        Assert.assertEquals(6, test.findSubstringInWraproundString("abcabc"));
    }

    @Test
    public void test9(){
        UniqueSubstringsInWraparoundString test = new UniqueSubstringsInWraparoundString();
        Assert.assertEquals(6, test.findSubstringInWraproundString("ababc"));
    }

    @Test
    public void test10(){
        UniqueSubstringsInWraparoundString test = new UniqueSubstringsInWraparoundString();
        Assert.assertEquals(6, test.findSubstringInWraproundString("bcabc"));
    }

    @Test
    public void test11(){
        UniqueSubstringsInWraparoundString test = new UniqueSubstringsInWraparoundString();
        Assert.assertEquals(0, test.findSubstringInWraproundString(""));
    }
}
