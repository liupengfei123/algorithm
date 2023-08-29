package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class BinaryTreesWithFactorsTest {

    @Test
    public void test1(){
        BinaryTreesWithFactors test = new BinaryTreesWithFactors();

        Assert.assertEquals(3, test.numFactoredBinaryTrees(new int[]{2, 4}));
    }

    @Test
    public void test2(){
        BinaryTreesWithFactors test = new BinaryTreesWithFactors();

        Assert.assertEquals(7, test.numFactoredBinaryTrees(new int[]{2, 4, 5, 10}));
    }

    @Test
    public void test3(){
        BinaryTreesWithFactors test = new BinaryTreesWithFactors();

        Assert.assertEquals(993, test.numFactoredBinaryTrees(new int[]{2, 4, 8, 16, 32, 64, 128}));
    }

    @Test
    public void test4(){
        BinaryTreesWithFactors test = new BinaryTreesWithFactors();

        Assert.assertEquals(509730797, test.numFactoredBinaryTrees(new int[]{46,144,5040,4488,544,380,4410,34,11,5,3063808,5550,34496,12,540,28,18,13,2,1056,32710656,31,91872,23,26,240,18720,33,49,4,38,37,1457,3,799,557568,32,1400,47,10,20774,1296,9,21,92928,8704,29,2162,22,1883700,49588,1078,36,44,352,546,19,523370496,476,24,6000,42,30,8,16262400,61600,41,24150,1968,7056,7,35,16,87,20,2730,11616,10912,690,150,25,6,14,1689120,43,3128,27,197472,45,15,585,21645,39,40,2205,17,48,136}));
    }
}
