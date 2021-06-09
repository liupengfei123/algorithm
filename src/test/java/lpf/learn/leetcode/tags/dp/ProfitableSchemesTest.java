package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class ProfitableSchemesTest {
    @Test
    public void test1(){
        ProfitableSchemes test = new ProfitableSchemes();
        Assert.assertEquals(2, test.profitableSchemes(5, 3, new int[]{2, 2}, new int[]{2, 3}));
    }

    @Test
    public void test2(){
        ProfitableSchemes test = new ProfitableSchemes();
        Assert.assertEquals(7, test.profitableSchemes(10, 5, new int[]{2, 3, 5}, new int[]{6,7,8}));
    }

    @Test
    public void test3(){
        ProfitableSchemes test = new ProfitableSchemes();
        Assert.assertEquals(6566, test.profitableSchemes(20, 20, new int[]{2,2,4,1,1,5,5,1,3,6,1,6,12,3,9,6,7}, new int[]{2,3,3,6,7,7,2,4,5,6,2,1,8,5,8,8,9}));
    }

    @Test
    public void test4(){
        ProfitableSchemes test = new ProfitableSchemes();
        Assert.assertEquals(2, test.profitableSchemes(64, 0, new int[]{80, 40}, new int[]{88, 88}));
    }

    @Test
    public void test5(){
        ProfitableSchemes test = new ProfitableSchemes();
        int[] group = new int[]{6,37,1,24,35,31,1,2,15,4,7,3,1,1,1,2,7,13,6,2,21,31,4,7,7,8,7,4,15,2,1,24,27,8,30,10,8,6,4,9,2,6,12,3,4,11,8,29,3,1,8,4,1,6,1,9,3,11,1,5,1,1,3,8,7,4,15,2,3,15,9,2,12,12,11,3,10,5,12,13,7,33,10,42,11,2,9,32,1,1,3,44,7,15,4,1,9,19,6,15};
        int[] profit = new int[]{2,7,1,29,1,5,0,0,1,0,14,4,7,0,22,2,0,13,4,6,13,9,3,0,9,7,21,21,23,1,13,10,5,13,2,15,3,5,6,20,11,1,14,36,0,20,12,14,0,5,8,4,24,18,12,23,7,6,7,4,12,24,5,6,25,9,11,21,13,10,49,2,0,1,6,1,18,35,1,19,0,17,2,39,21,3,34,8,13,13,0,0,4,20,35,2,31,8,3,70};

        Assert.assertEquals(332911349, test.profitableSchemes(100, 100, group, profit));
    }



}
