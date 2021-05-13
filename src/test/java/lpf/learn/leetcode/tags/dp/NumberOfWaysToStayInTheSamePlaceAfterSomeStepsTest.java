package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfWaysToStayInTheSamePlaceAfterSomeStepsTest {
    @Test
    public void test1(){
        NumberOfWaysToStayInTheSamePlaceAfterSomeSteps test = new NumberOfWaysToStayInTheSamePlaceAfterSomeSteps();
        Assert.assertEquals(4, test.numWays(3,2));
    }

    @Test
    public void test2(){
        NumberOfWaysToStayInTheSamePlaceAfterSomeSteps test = new NumberOfWaysToStayInTheSamePlaceAfterSomeSteps();
        Assert.assertEquals(2, test.numWays(2,4));
    }

    @Test
    public void test3(){
        NumberOfWaysToStayInTheSamePlaceAfterSomeSteps test = new NumberOfWaysToStayInTheSamePlaceAfterSomeSteps();
        Assert.assertEquals(8, test.numWays(4,2));
    }

    @Test
    public void test4(){
        NumberOfWaysToStayInTheSamePlaceAfterSomeSteps test = new NumberOfWaysToStayInTheSamePlaceAfterSomeSteps();
        Assert.assertEquals(2188, test.numWays(10,10000));
    }

    @Test
    public void test5(){
        NumberOfWaysToStayInTheSamePlaceAfterSomeSteps test = new NumberOfWaysToStayInTheSamePlaceAfterSomeSteps();
        Assert.assertEquals(4, test.numWays(3,7));
    }

    @Test
    public void test6(){
        NumberOfWaysToStayInTheSamePlaceAfterSomeSteps test = new NumberOfWaysToStayInTheSamePlaceAfterSomeSteps();
        Assert.assertEquals(331940473, test.numWays(100,7));
    }

    @Test
    public void test7(){
        NumberOfWaysToStayInTheSamePlaceAfterSomeSteps test = new NumberOfWaysToStayInTheSamePlaceAfterSomeSteps();
        Assert.assertEquals(179785402, test.numWays(100,40));
    }

    @Test
    public void test8(){
        NumberOfWaysToStayInTheSamePlaceAfterSomeSteps test = new NumberOfWaysToStayInTheSamePlaceAfterSomeSteps();
        Assert.assertEquals(374847123, test.numWays(500,10000));
    }
}
