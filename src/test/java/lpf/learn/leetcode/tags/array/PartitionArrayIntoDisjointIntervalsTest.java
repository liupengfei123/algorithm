package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class PartitionArrayIntoDisjointIntervalsTest {

    @Test
    public void test1(){
        PartitionArrayIntoDisjointIntervals test = new PartitionArrayIntoDisjointIntervals();
        Assert.assertEquals(3, test.partitionDisjoint(new int[]{5,0,3,8,6}));
    }

    @Test
    public void test2(){
        PartitionArrayIntoDisjointIntervals test = new PartitionArrayIntoDisjointIntervals();
        Assert.assertEquals(4, test.partitionDisjoint(new int[]{1,1,1,0,6,12}));
    }

    @Test
    public void test3(){
        PartitionArrayIntoDisjointIntervals test = new PartitionArrayIntoDisjointIntervals();
        Assert.assertEquals(4, test.partitionDisjoint(new int[]{1,2,1,0,6,12}));
    }

    @Test
    public void test4(){
        PartitionArrayIntoDisjointIntervals test = new PartitionArrayIntoDisjointIntervals();
        Assert.assertEquals(1, test.partitionDisjoint(new int[]{1,1}));
    }

    @Test
    public void test5(){
        BeautifulArrangementIi test = new BeautifulArrangementIi();
        Assert.assertArrayEquals(new int[]{1,5,2,4,3}, test.constructArray(5, 4));
    }

    @Test
    public void test6(){
        BeautifulArrangementIi test = new BeautifulArrangementIi();
        Assert.assertArrayEquals(new int[]{1,4,2,3,5,6,7,8,9,10}, test.constructArray(10, 3));
    }

}
