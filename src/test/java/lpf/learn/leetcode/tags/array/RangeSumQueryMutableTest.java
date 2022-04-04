package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class RangeSumQueryMutableTest {

    @Test
    public void test1(){
        RangeSumQueryMutable test = new RangeSumQueryMutable(new int[]{1, 3, 5});
        Assert.assertEquals(9, test.sumRange(0, 2));
        test.update(1, 2);
        Assert.assertEquals(8, test.sumRange(0, 2));
    }

    @Test
    public void test2(){
        RangeSumQueryMutable test = new RangeSumQueryMutable(new int[]{1});
        Assert.assertEquals(1, test.sumRange(0, 0));
        test.update(0, 5);
        Assert.assertEquals(5, test.sumRange(0, 0));
    }

    @Test
    public void test3(){
        RangeSumQueryMutable test = new RangeSumQueryMutable(new int[]{1,3,4,2,6,7,25,77,4,2,5,12,4,55,5});
        Assert.assertEquals(125, test.sumRange(0,7));
        test.update(1,99);
        Assert.assertEquals(23, test.sumRange(9,12));
        test.update(11,-12);
        Assert.assertEquals(-1, test.sumRange(9,12));
    }

    @Test
    public void test4(){
        RangeSumQueryMutable test = new RangeSumQueryMutable(new int[]{7,2,7,2,0});
        test.update(4,6);
        test.update(0,2);
        test.update(0,9);
        Assert.assertEquals(6, test.sumRange(4,4));
        test.update(3,8);
        Assert.assertEquals(32, test.sumRange(0,4));
        test.update(4,1);
        Assert.assertEquals(26, test.sumRange(0,3));
        Assert.assertEquals(27, test.sumRange(0,4));
        test.update(0,4);
    }
}
