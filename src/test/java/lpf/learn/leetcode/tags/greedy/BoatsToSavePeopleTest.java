package lpf.learn.leetcode.tags.greedy;

import org.junit.Assert;
import org.junit.Test;

public class BoatsToSavePeopleTest {
    @Test
    public void test1(){
        BoatsToSavePeople test = new BoatsToSavePeople();
        Assert.assertEquals(1, test.numRescueBoats(new int[]{2,1}, 3));
    }

    @Test
    public void test2(){
        BoatsToSavePeople test = new BoatsToSavePeople();
        Assert.assertEquals(3, test.numRescueBoats(new int[]{3,2,2,1}, 3));
    }

    @Test
    public void test3(){
        BoatsToSavePeople test = new BoatsToSavePeople();
        Assert.assertEquals(4, test.numRescueBoats(new int[]{3,5,3,4}, 5));
    }
}
