package lpf.learn.leetcode.tags.sort;

import org.junit.Assert;
import org.junit.Test;

public class SumOfSubsequenceWidthsTest {

    @Test
    public void test1(){
        SumOfSubsequenceWidths test = new SumOfSubsequenceWidths();
        Assert.assertEquals(114, test.sumSubseqWidths(new int[]{3,7,6,2,1}));
    }

    @Test
    public void test2(){
        SumOfSubsequenceWidths test = new SumOfSubsequenceWidths();
        Assert.assertEquals(93, test.sumSubseqWidths(new int[]{3,2,6,1,5}));
    }

    @Test
    public void test3(){
        SumOfSubsequenceWidths test = new SumOfSubsequenceWidths();
        Assert.assertEquals(459, test.sumSubseqWidths(new int[]{3,1,6,1,5,5,4}));
    }

    @Test
    public void test4(){
        SumOfSubsequenceWidths test = new SumOfSubsequenceWidths();
        Assert.assertEquals(87, test.sumSubseqWidths(new int[]{3,1,6,1,1}));
    }

    @Test
    public void test5(){
        SumOfSubsequenceWidths test = new SumOfSubsequenceWidths();
        Assert.assertEquals(6, test.sumSubseqWidths(new int[]{2,1,3}));
    }

    @Test
    public void test6(){
        SumOfSubsequenceWidths test = new SumOfSubsequenceWidths();
        Assert.assertEquals(0, test.sumSubseqWidths(new int[]{3}));
    }

    @Test
    public void test7(){
        SumOfSubsequenceWidths test = new SumOfSubsequenceWidths();
        Assert.assertEquals(501558635, test.sumSubseqWidths(new int[]{3,1,6,1,5,5,4,12,5,73,7,1,36,8,8,12,43,44,31,32,1,24,67,88,19}));
    }


    @Test
    public void test8(){
        SumOfSubsequenceWidths test = new SumOfSubsequenceWidths();
        Assert.assertEquals(210656556, test.sumSubseqWidths(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65}));
    }

    @Test
    public void test9(){
        SumOfSubsequenceWidths test = new SumOfSubsequenceWidths();
        Assert.assertEquals(857876214, test.sumSubseqWidths(new int[]{5,69,89,92,31,16,25,45,63,40,16,56,24,40,75,82,40,12,50,62,92,44,67,38,92,22,91,24,26,21,100,42,23,56,64,43,95,76,84,79,89,4,16,94,16,77,92,9,30,13}));
    }
}
