package lpf.learn.leetcode.game.weekly341;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAdditionsToMakeValidStringTest {

    @Test
    public void test1(){
        MinimumAdditionsToMakeValidString test = new MinimumAdditionsToMakeValidString();
        Assert.assertEquals(2, test.addMinimum("b"));
    }

    @Test
    public void test2(){
        MinimumAdditionsToMakeValidString test = new MinimumAdditionsToMakeValidString();
        Assert.assertEquals(6, test.addMinimum("aaa"));
    }

    @Test
    public void test3(){
        MinimumAdditionsToMakeValidString test = new MinimumAdditionsToMakeValidString();
        Assert.assertEquals(0, test.addMinimum("abc"));
    }


    @Test
    public void test4(){
        MinimumAdditionsToMakeValidString test = new MinimumAdditionsToMakeValidString();
        Assert.assertEquals(1, test.addMinimum("ac"));
    }
}
