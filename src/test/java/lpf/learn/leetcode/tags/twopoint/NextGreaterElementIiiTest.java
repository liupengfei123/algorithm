package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

public class NextGreaterElementIiiTest {
    @Test
    public void test1(){
        NextGreaterElementIii test = new NextGreaterElementIii();
        Assert.assertEquals(21, test.nextGreaterElement(12));
    }

    @Test
    public void test2(){
        NextGreaterElementIii test = new NextGreaterElementIii();
        Assert.assertEquals(-1, test.nextGreaterElement(21));
    }

    @Test
    public void test3(){
        NextGreaterElementIii test = new NextGreaterElementIii();
        Assert.assertEquals(1324, test.nextGreaterElement(1243));
    }

    @Test
    public void test4(){
        NextGreaterElementIii test = new NextGreaterElementIii();
        Assert.assertEquals(136145, test.nextGreaterElement(135641));
    }

    @Test
    public void test5(){
        NextGreaterElementIii test = new NextGreaterElementIii();
        Assert.assertEquals(230412, test.nextGreaterElement(230241));
    }
    @Test
    public void test6(){
        NextGreaterElementIii test = new NextGreaterElementIii();
        Assert.assertEquals(-1, test.nextGreaterElement(2147483486));
    }

}
