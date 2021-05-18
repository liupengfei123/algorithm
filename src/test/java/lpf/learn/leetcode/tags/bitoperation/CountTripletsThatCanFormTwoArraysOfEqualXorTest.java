package lpf.learn.leetcode.tags.bitoperation;

import org.junit.Assert;
import org.junit.Test;

public class CountTripletsThatCanFormTwoArraysOfEqualXorTest {

    @Test
    public void test1(){
        CountTripletsThatCanFormTwoArraysOfEqualXor test = new CountTripletsThatCanFormTwoArraysOfEqualXor();
        Assert.assertEquals(4, test.countTriplets(new int[]{2,3,1,6,7}));
    }


    @Test
    public void test2(){
        CountTripletsThatCanFormTwoArraysOfEqualXor test = new CountTripletsThatCanFormTwoArraysOfEqualXor();
        Assert.assertEquals(10, test.countTriplets(new int[]{1,1,1,1,1}));
    }

    @Test
    public void test3(){
        CountTripletsThatCanFormTwoArraysOfEqualXor test = new CountTripletsThatCanFormTwoArraysOfEqualXor();
        Assert.assertEquals(0, test.countTriplets(new int[]{2,3}));
    }

    @Test
    public void test4(){
        CountTripletsThatCanFormTwoArraysOfEqualXor test = new CountTripletsThatCanFormTwoArraysOfEqualXor();
        Assert.assertEquals(3, test.countTriplets(new int[]{1,3,5,7,9}));
    }

    @Test
    public void test5(){
        CountTripletsThatCanFormTwoArraysOfEqualXor test = new CountTripletsThatCanFormTwoArraysOfEqualXor();
        Assert.assertEquals(8, test.countTriplets(new int[]{7,11,12,9,5,2,7,17,22}));
    }
}
