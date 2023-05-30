package lpf.learn.leetcode.game.biweekly105;

import org.junit.Assert;
import org.junit.Test;

public class GreatestCommonDivisorTraversalTest {
    @Test
    public void test1(){
        GreatestCommonDivisorTraversal test = new GreatestCommonDivisorTraversal();
        Assert.assertTrue(test.canTraverseAllPairs(new int[]{2, 3, 6}));
    }

    @Test
    public void test2(){
        GreatestCommonDivisorTraversal test = new GreatestCommonDivisorTraversal();
        Assert.assertFalse(test.canTraverseAllPairs(new int[]{3, 9, 5}));
    }

    @Test
    public void test3(){
        GreatestCommonDivisorTraversal test = new GreatestCommonDivisorTraversal();
        Assert.assertTrue(test.canTraverseAllPairs(new int[]{4, 3, 12, 8}));
    }

    @Test
    public void test4(){
        GreatestCommonDivisorTraversal test = new GreatestCommonDivisorTraversal();
        Assert.assertFalse(test.canTraverseAllPairs(new int[]{10, 40, 30, 30, 42, 13, 35, 15, 13, 30, 33, 30, 30, 35, 42, 42, 42, 28, 15, 4, 35, 44, 21, 42, 35, 15, 22, 10, 5, 30, 42}));
    }

    @Test
    public void test5(){
        GreatestCommonDivisorTraversal test = new GreatestCommonDivisorTraversal();
        Assert.assertTrue(test.canTraverseAllPairs(new int[]{39, 42, 45, 35, 30, 44, 14, 42, 40, 14}));
    }

    @Test
    public void test6(){
        GreatestCommonDivisorTraversal test = new GreatestCommonDivisorTraversal();
        Assert.assertTrue(test.canTraverseAllPairs(new int[]{35, 42, 42, 10, 11, 42, 45, 30, 33}));
    }


    @Test
    public void test7(){
        GreatestCommonDivisorTraversal test = new GreatestCommonDivisorTraversal();
        Assert.assertTrue(test.canTraverseAllPairs(new int[]{852, 858, 660, 462, 930, 286, 990, 945, 770, 715, 770, 818, 204, 770, 693, 180, 398, 840, 330, 770}));
    }
}