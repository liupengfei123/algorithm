package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class FindThePivotIntegerTest {
    @Test
    public void test1(){
        FindThePivotInteger test = new FindThePivotInteger();
        Assert.assertEquals(6, test.pivotInteger(8));
    }

    @Test
    public void test2(){
        FindThePivotInteger test = new FindThePivotInteger();
        Assert.assertEquals(1, test.pivotInteger(1));
    }

    @Test
    public void test3(){
        FindThePivotInteger test = new FindThePivotInteger();
        Assert.assertEquals(-1, test.pivotInteger(4));
    }


}
