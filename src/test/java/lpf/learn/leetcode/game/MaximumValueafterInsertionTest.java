package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueafterInsertionTest {
    @Test
    public void test1(){
        MaximumValueafterInsertion test = new MaximumValueafterInsertion();
        Assert.assertEquals("9999", test.maxValue("999", 9));
    }

    @Test
    public void test2(){
        MaximumValueafterInsertion test = new MaximumValueafterInsertion();
        Assert.assertEquals("-1323", test.maxValue("-132", 3));
    }

    @Test
    public void test3(){
        MaximumValueafterInsertion test = new MaximumValueafterInsertion();
        Assert.assertEquals("-123", test.maxValue("-13", 2));
    }

    @Test
    public void test4(){
        MaximumValueafterInsertion test = new MaximumValueafterInsertion();
        Assert.assertEquals("763", test.maxValue("73", 6));
    }

    @Test
    public void test5(){
        MaximumValueafterInsertion test = new MaximumValueafterInsertion();
        Assert.assertEquals("-5648468153646", test.maxValue("-648468153646",5));
    }

    @Test
    public void test6(){
        MaximumValueafterInsertion test = new MaximumValueafterInsertion();
        Assert.assertEquals("4699757879438632651173569913153377", test.maxValue("469975787943862651173569913153377",3));
    }
}
