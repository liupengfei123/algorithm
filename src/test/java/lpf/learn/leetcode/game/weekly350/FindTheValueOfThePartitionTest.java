package lpf.learn.leetcode.game.weekly350;

import org.junit.Assert;
import org.junit.Test;

public class FindTheValueOfThePartitionTest {
    @Test
    public void test1(){
        FindTheValueOfThePartition test = new FindTheValueOfThePartition();
        Assert.assertEquals(1, test.findValueOfPartition(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test2(){
        FindTheValueOfThePartition test = new FindTheValueOfThePartition();
        Assert.assertEquals(1, test.findValueOfPartition(new int[]{1,3,2,4}));
    }

    @Test
    public void test3(){
        FindTheValueOfThePartition test = new FindTheValueOfThePartition();
        Assert.assertEquals(9, test.findValueOfPartition(new int[]{100,1,10}));
    }
}
