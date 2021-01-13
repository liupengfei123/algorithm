package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class HIndexTest {
    @Test
    public void test1(){
        HIndex test = new HIndex();
        Assert.assertEquals(3, test.hIndex(new int[]{3,0,6,1,5}));
    }

    @Test
    public void test2(){
        HIndex test = new HIndex();
        Assert.assertEquals(2, test.hIndex(new int[]{3,0,6,1,1,}));
    }

    @Test
    public void test3(){
        HIndex test = new HIndex();
        Assert.assertEquals(4, test.hIndex(new int[]{3,1,6,1,5,5,4}));
    }

    @Test
    public void test4(){
        HIndex test = new HIndex();
        Assert.assertEquals(2, test.hIndex(new int[]{3,1,6,1,1}));
    }
}
