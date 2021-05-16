package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class FindingPairsWithACertainSumTest {
    @Test
    public void test1(){
        FindingPairsWithACertainSum test = new FindingPairsWithACertainSum(new int[]{1, 1, 2, 2, 2, 3}, new int[]{1, 4, 5, 2, 5, 4});
        Assert.assertEquals(8, test.count(7));
        test.add(3,2);
        Assert.assertEquals(2, test.count(8));
        Assert.assertEquals(1, test.count(4));
        test.add(0,1);
        test.add(1,1);
        Assert.assertEquals(11, test.count(7));
    }

    @Test
    public void test2(){
        SumOfAllSubsetXORTotals test = new SumOfAllSubsetXORTotals();
        Assert.assertEquals(480, test.subsetXORSum(new int[]{3,4,5,6,7,8}));
    }
}
