package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class DeliveringBoxesFromStorageToPortsTest {
    @Test
    public void test1(){
        DeliveringBoxesFromStorageToPorts test = new DeliveringBoxesFromStorageToPorts();
        Assert.assertEquals(4, test.boxDelivering(new int[][]{{1,1},{2,1},{1,1}}, 
                2, 3,3));
    }

    @Test
    public void test2(){
        DeliveringBoxesFromStorageToPorts test = new DeliveringBoxesFromStorageToPorts();
        Assert.assertEquals(6, test.boxDelivering(new int[][]{{1,2},{3,3},{3,1},{3,1},{2,4}},
                3, 3,6));
    }

    @Test
    public void test3(){
        DeliveringBoxesFromStorageToPorts test = new DeliveringBoxesFromStorageToPorts();
        Assert.assertEquals(6, test.boxDelivering(new int[][]{{1,4},{1,2},{2,1},{2,1},{3,2},{3,4}},
                3, 6,7));
    }

    @Test
    public void test4(){
        DeliveringBoxesFromStorageToPorts test = new DeliveringBoxesFromStorageToPorts();
        Assert.assertEquals(14, test.boxDelivering(new int[][]{{2,4},{2,5},{3,1},{3,2},{3,7},{3,1},{4,4},{1,3},{5,2}},
                5, 5,7));
    }

    @Test
    public void test5(){
    }

    @Test
    public void test6(){
    }



}
