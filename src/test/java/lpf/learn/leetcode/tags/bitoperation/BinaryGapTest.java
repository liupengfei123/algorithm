package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class BinaryGapTest {
    @Test
    public void test1(){
        BinaryGap test = new BinaryGap();
        Assert.assertEquals(2, test.binaryGap(22));
    }

    @Test
    public void test2(){
        BinaryGap test = new BinaryGap();
        Assert.assertEquals(0, test.binaryGap(8));
    }

    @Test
    public void test3(){
        BinaryGap test = new BinaryGap();
        Assert.assertEquals(2, test.binaryGap(5));
    }


    @Test
    public void test4(){
        BinaryGap test = new BinaryGap();
        Assert.assertEquals(3, test.binaryGap(513168167));
    }

    @Test
    public void test5(){
        BinaryGap test = new BinaryGap();
        Assert.assertEquals(5, test.binaryGap(1000000));
    }
}
