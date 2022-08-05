package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfWaysToDivideALongCorridorTest {
    @Test
    public void test1(){
        NumberOfWaysToDivideALongCorridor test = new NumberOfWaysToDivideALongCorridor();
        Assert.assertEquals(3, test.numberOfWays("SSPPSPS"));
    }

    @Test
    public void test2(){
        NumberOfWaysToDivideALongCorridor test = new NumberOfWaysToDivideALongCorridor();
        Assert.assertEquals(1, test.numberOfWays("PPSPSP"));
    }

    @Test
    public void test3(){
        NumberOfWaysToDivideALongCorridor test = new NumberOfWaysToDivideALongCorridor();
        Assert.assertEquals(0, test.numberOfWays("S"));
    }

    @Test
    public void test4(){
        NumberOfWaysToDivideALongCorridor test = new NumberOfWaysToDivideALongCorridor();
        Assert.assertEquals(0, test.numberOfWays("P"));
    }

    @Test
    public void test5(){
        NumberOfWaysToDivideALongCorridor test = new NumberOfWaysToDivideALongCorridor();
        Assert.assertEquals(1, test.numberOfWays("PPSSP"));
    }

    @Test
    public void test6(){
        NumberOfWaysToDivideALongCorridor test = new NumberOfWaysToDivideALongCorridor();
        Assert.assertEquals(5, test.numberOfWays("PPSSPPPPSSPPPPP"));
    }

    @Test
    public void test7(){
        NumberOfWaysToDivideALongCorridor test = new NumberOfWaysToDivideALongCorridor();
        Assert.assertEquals(20, test.numberOfWays("PPSSPPPPSSPPPSSPPPPP"));
    }


}
