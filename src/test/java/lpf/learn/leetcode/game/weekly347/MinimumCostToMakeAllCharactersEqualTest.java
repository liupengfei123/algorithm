package lpf.learn.leetcode.game.weekly347;

import org.junit.Assert;
import org.junit.Test;

public class MinimumCostToMakeAllCharactersEqualTest {

    @Test
    public void test1(){
        MinimumCostToMakeAllCharactersEqual test = new MinimumCostToMakeAllCharactersEqual();
        Assert.assertEquals(0, test.minimumCost("0"));
    }


    @Test
    public void test2(){
        MinimumCostToMakeAllCharactersEqual test = new MinimumCostToMakeAllCharactersEqual();
        Assert.assertEquals(2, test.minimumCost("0011"));
    }

    @Test
    public void test3(){
        MinimumCostToMakeAllCharactersEqual test = new MinimumCostToMakeAllCharactersEqual();
        Assert.assertEquals(9, test.minimumCost("010101"));
    }
}
