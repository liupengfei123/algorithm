package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class IncreasingDecreasingStringTest {
    @Test
    public void test1(){
        IncreasingDecreasingString test = new IncreasingDecreasingString();
        Assert.assertEquals("abccbaabccba", test.sortString("aaaabbbbcccc"));
    }

    @Test
    public void test2(){
        IncreasingDecreasingString test = new IncreasingDecreasingString();
        Assert.assertEquals("art", test.sortString("rat"));
    }

    @Test
    public void test3(){
        IncreasingDecreasingString test = new IncreasingDecreasingString();
        Assert.assertEquals("cdelotee", test.sortString("leetcode"));
    }

    @Test
    public void test4(){
        IncreasingDecreasingString test = new IncreasingDecreasingString();
        Assert.assertEquals("ggggggg", test.sortString("ggggggg"));
    }

    @Test
    public void test5(){
        IncreasingDecreasingString test = new IncreasingDecreasingString();
        Assert.assertEquals("ops", test.sortString("spo"));
    }
}
