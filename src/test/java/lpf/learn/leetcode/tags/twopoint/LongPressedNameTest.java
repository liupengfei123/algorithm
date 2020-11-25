package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class LongPressedNameTest {
    @Test
    public void test1(){
        LongPressedName test = new LongPressedName();
        Assert.assertTrue(test.isLongPressedName("alex", "aaleex"));
    }

    @Test
    public void test2(){
        LongPressedName test = new LongPressedName();
        Assert.assertFalse(test.isLongPressedName("saeed", "ssaaedd"));
    }


    @Test
    public void test3(){
        LongPressedName test = new LongPressedName();
        Assert.assertTrue(test.isLongPressedName("leelee", "lleeelee"));
    }

    @Test
    public void test4(){
        LongPressedName test = new LongPressedName();
        Assert.assertTrue(test.isLongPressedName("leelee", "lleeeleeee"));
    }

    @Test
    public void test5(){
        LongPressedName test = new LongPressedName();
        Assert.assertTrue(test.isLongPressedName("laiden", "laiden"));
    }

    @Test
    public void test6(){
        LongPressedName test = new LongPressedName();
        Assert.assertFalse(test.isLongPressedName("laidenee", "laideeeeen"));
    }
}
