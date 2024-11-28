package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class FindTheMedianOfTheUniquenessArrayTest {
    @Test
    public void test1(){
        FindTheMedianOfTheUniquenessArray test = new FindTheMedianOfTheUniquenessArray();
        Assert.assertEquals(1, test.medianOfUniquenessArray(new int[]{1,2,3}));
    }

    @Test
    public void test2(){
        FindTheMedianOfTheUniquenessArray test = new FindTheMedianOfTheUniquenessArray();
        Assert.assertEquals(2, test.medianOfUniquenessArray(new int[]{3,4,3,4,5}));
    }


    @Test
    public void test3(){
        FindTheMedianOfTheUniquenessArray test = new FindTheMedianOfTheUniquenessArray();
        Assert.assertEquals(2, test.medianOfUniquenessArray(new int[]{4,3,5,4}));
    }


    @Test
    public void test4(){
        FindTheMedianOfTheUniquenessArray test = new FindTheMedianOfTheUniquenessArray();
        Assert.assertEquals(5, test.medianOfUniquenessArray(new int[]{4,3,5,4,12,45,13,5,2,31,4,2,2,5,67,5,23,1}));
    }

    @Test
    public void test5(){
        FindTheMedianOfTheUniquenessArray test = new FindTheMedianOfTheUniquenessArray();
        Assert.assertEquals(3, test.medianOfUniquenessArray(new int[]{1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3}));
    }

    @Test
    public void test6(){
        FindTheMedianOfTheUniquenessArray test = new FindTheMedianOfTheUniquenessArray();
        Assert.assertEquals(1, test.medianOfUniquenessArray(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
    }

    @Test
    public void test7(){
        FindTheMedianOfTheUniquenessArray test = new FindTheMedianOfTheUniquenessArray();
        Assert.assertEquals(1, test.medianOfUniquenessArray(new int[]{2,15,15,15}));
    }

    @Test
    public void test8(){
        FindTheMedianOfTheUniquenessArray test = new FindTheMedianOfTheUniquenessArray();
        Assert.assertEquals(1, test.medianOfUniquenessArray(new int[]{1,2,3}));
    }

}