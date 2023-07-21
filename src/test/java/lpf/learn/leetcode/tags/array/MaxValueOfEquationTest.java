package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MaxValueOfEquationTest {

    @Test
    public void test1(){
        MaxValueOfEquation test = new MaxValueOfEquation();
        Assert.assertEquals(4, test.findMaxValueOfEquation(new int[][]{{1,3},{2,0},{5,10},{6,-10}}, 1));
    }

    @Test
    public void test2(){
        MaxValueOfEquation test = new MaxValueOfEquation();
        Assert.assertEquals(3, test.findMaxValueOfEquation(new int[][]{{0,0},{3,0},{9,2}}, 3));
    }
}
