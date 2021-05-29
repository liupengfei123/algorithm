package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSubmatricesThatSumToTargetTest {
    @Test
    public void test1(){
        NumberOfSubmatricesThatSumToTarget test = new NumberOfSubmatricesThatSumToTarget();
        Assert.assertEquals(4, test.numSubmatrixSumTarget(new int[][]{{0,1,0},{1,1,1},{0,1,0}}, 0));
    }

    @Test
    public void test2(){
        NumberOfSubmatricesThatSumToTarget test = new NumberOfSubmatricesThatSumToTarget();
        Assert.assertEquals(5, test.numSubmatrixSumTarget(new int[][]{{1,-1},{-1,1}}, 0));
    }

    @Test
    public void test3(){
        NumberOfSubmatricesThatSumToTarget test = new NumberOfSubmatricesThatSumToTarget();
        Assert.assertEquals(0, test.numSubmatrixSumTarget(new int[][]{{999}}, 0));
    }

    @Test
    public void test4(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(11, test.numberOfArithmeticSlices(new int[]{1, 2, 3, 4, 5, 6, 8, 10}));
    }

    @Test
    public void test5(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(3, test.numberOfArithmeticSlices(new int[]{7, 7, 7, 7}));
    }

    @Test
    public void test6(){
        ArithmeticSlices test = new ArithmeticSlices();
        Assert.assertEquals(0, test.numberOfArithmeticSlices(new int[]{1, 1, 2, 5, 7}));
    }



}
