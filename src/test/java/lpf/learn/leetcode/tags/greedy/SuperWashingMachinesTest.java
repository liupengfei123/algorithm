package lpf.learn.leetcode.tags.greedy;

import org.junit.Assert;
import org.junit.Test;

public class SuperWashingMachinesTest {
    @Test
    public void test1(){
        SuperWashingMachines test = new SuperWashingMachines();
        Assert.assertEquals(3, test.findMinMoves(new int[]{1,0,5}));
    }

    @Test
    public void test2(){
        SuperWashingMachines test = new SuperWashingMachines();
        Assert.assertEquals(2, test.findMinMoves(new int[]{0,3,0}));
    }

    @Test
    public void test3(){
        SuperWashingMachines test = new SuperWashingMachines();
        Assert.assertEquals(-1, test.findMinMoves(new int[]{0,2,0}));
    }

    @Test
    public void test4(){
        SuperWashingMachines test = new SuperWashingMachines();
        Assert.assertEquals(109, test.findMinMoves(new int[]{0,2,0,1,122,4,9,4,83,1,6,86,23,51}));
    }


    @Test
    public void test5(){
        SuperWashingMachines test = new SuperWashingMachines();
        Assert.assertEquals(84, test.findMinMoves(new int[]{0,1,120,9,4,82}));
    }

    @Test
    public void test6(){
        SuperWashingMachines test = new SuperWashingMachines();
        Assert.assertEquals(7, test.findMinMoves(new int[]{1,9,1,13}));
    }

    @Test
    public void test7(){
        SuperWashingMachines test = new SuperWashingMachines();
        Assert.assertEquals(2, test.findMinMoves(new int[]{4,0,0,4}));
    }
}
