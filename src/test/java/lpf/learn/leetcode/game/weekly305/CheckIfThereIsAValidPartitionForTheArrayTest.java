package lpf.learn.leetcode.game.weekly305;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfThereIsAValidPartitionForTheArrayTest {
    @Test
    public void test1(){
        CheckIfThereIsAValidPartitionForTheArray test = new CheckIfThereIsAValidPartitionForTheArray();
        Assert.assertFalse(test.validPartition(new int[]{1, 2, 2, 2, 3}));
    }

    @Test
    public void test2(){
        CheckIfThereIsAValidPartitionForTheArray test = new CheckIfThereIsAValidPartitionForTheArray();
        Assert.assertTrue(test.validPartition(new int[]{4, 4, 4, 5, 6}));
    }

    @Test
    public void test3(){
        CheckIfThereIsAValidPartitionForTheArray test = new CheckIfThereIsAValidPartitionForTheArray();
        Assert.assertFalse(test.validPartition(new int[]{4, 4, 4, 5}));
    }

    @Test
    public void test4(){
        CheckIfThereIsAValidPartitionForTheArray test = new CheckIfThereIsAValidPartitionForTheArray();
        Assert.assertTrue(test.validPartition(new int[]{4, 4, 4, 5, 6, 6, 6}));
    }

    @Test
    public void test5(){
        CheckIfThereIsAValidPartitionForTheArray test = new CheckIfThereIsAValidPartitionForTheArray();
        Assert.assertTrue(test.validPartition(new int[]{4, 4, 4, 9, 9, 6, 6, 7, 7, 7}));
    }

    @Test
    public void test6(){
        CheckIfThereIsAValidPartitionForTheArray test = new CheckIfThereIsAValidPartitionForTheArray();
        Assert.assertFalse(test.validPartition(new int[]{4, 4, 5, 6}));
    }
}
