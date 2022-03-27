package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class FindMissingObservationsTest {
    @Test
    public void test1(){
        FindMissingObservations test = new FindMissingObservations();
        Assert.assertArrayEquals(new int[]{6,6}, test.missingRolls(new int[]{3,2,4,3}, 4,2));
    }

    @Test
    public void test2(){
        FindMissingObservations test = new FindMissingObservations();
        Assert.assertArrayEquals(new int[]{3,2,2,2}, test.missingRolls(new int[]{1,5,6}, 3,4));
    }

    @Test
    public void test3(){
        FindMissingObservations test = new FindMissingObservations();
        Assert.assertArrayEquals(new int[]{}, test.missingRolls(new int[]{1,2,3,4}, 6,4));
    }


    @Test
    public void test4(){
        FindMissingObservations test = new FindMissingObservations();
        Assert.assertArrayEquals(new int[]{5}, test.missingRolls(new int[]{1}, 3,1));
    }

    @Test
    public void test5(){
        FindMissingObservations test = new FindMissingObservations();
        Assert.assertArrayEquals(new int[]{}, test.missingRolls(new int[]{3,2,4,3,4,1,4,1,5,3,4,2,6}, 4,4));
    }

    @Test
    public void test6(){
        FindMissingObservations test = new FindMissingObservations();
        Assert.assertArrayEquals(new int[]{6,6,6,5}, test.missingRolls(new int[]{3,2,4,3,4,1,4,1,5,3,4,5,6}, 4,4));
    }

    @Test
    public void test7(){
        FindMissingObservations test = new FindMissingObservations();
        Assert.assertArrayEquals(new int[]{}, test.missingRolls(new int[]{6,3,4,3,5,3}, 1,6));
    }
}
