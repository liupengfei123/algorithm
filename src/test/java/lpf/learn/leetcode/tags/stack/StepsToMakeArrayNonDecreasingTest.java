package lpf.learn.leetcode.tags.stack;

import org.junit.Assert;
import org.junit.Test;

public class StepsToMakeArrayNonDecreasingTest {

    @Test
    public void test1(){
        StepsToMakeArrayNonDecreasing test = new StepsToMakeArrayNonDecreasing();
        Assert.assertEquals(3, test.totalSteps(new int[]{5,3,4,4,7,3,6,11,8,5,11}));
    }

    @Test
    public void test2(){
        StepsToMakeArrayNonDecreasing test = new StepsToMakeArrayNonDecreasing();
        Assert.assertEquals(0, test.totalSteps(new int[]{4,5,7,7,13}));
    }

    @Test
    public void test3(){
        StepsToMakeArrayNonDecreasing test = new StepsToMakeArrayNonDecreasing();
        Assert.assertEquals(6, test.totalSteps(new int[]{10,1,2,3,4,5,6,1,2,3}));
    }

    @Test
    public void test4(){
        StepsToMakeArrayNonDecreasing test = new StepsToMakeArrayNonDecreasing();
        Assert.assertEquals(1, test.totalSteps(new int[]{10,9,8,7,6,5,3}));
    }

    @Test
    public void test5(){
        StepsToMakeArrayNonDecreasing test = new StepsToMakeArrayNonDecreasing();
        Assert.assertEquals(3, test.totalSteps(new int[]{7,14,4,14,13,2,6,13}));
    }

    @Test
    public void test6(){
        StepsToMakeArrayNonDecreasing test = new StepsToMakeArrayNonDecreasing();
        Assert.assertEquals(18, test.totalSteps(new int[]{82,228,317,559,670,1535,1977,890,1243,1502,1720,1808,1819,1966,105,170,194,320,385,433,607,633,1144,1195,1365,1490,1778,921,1560,6,68,69,100,341,595,679,725,775,887,1316,296,613,658,682,777,1203,1350,1431,161,374,784,794,863,1080,1149,1509,1525,128,437,996,1045,1061,1102,1238,1624,1706,1961,808,950,1166,1531,1537,1732,866,1279,1494,1527,1595}));
    }

    @Test
    public void test7(){
        StepsToMakeArrayNonDecreasing test = new StepsToMakeArrayNonDecreasing();
        Assert.assertEquals(2, test.totalSteps(new int[]{10, 9, 5, 1, 4, 1, 3}));
    }

    @Test
    public void test8(){
        StepsToMakeArrayNonDecreasing test = new StepsToMakeArrayNonDecreasing();
        Assert.assertEquals(1, test.totalSteps(new int[]{7, 9, 5, 10, 11, 16}));
    }
}
