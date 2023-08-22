package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class MaximizeDistanceToClosestPersonTest {

    @Test
    public void test1(){
        MaximizeDistanceToClosestPerson test = new  MaximizeDistanceToClosestPerson();
        Assert.assertEquals(2, test.maxDistToClosest(new int[]{1,0,0,0,1,0,1}));
    }

    @Test
    public void test2(){
        MaximizeDistanceToClosestPerson test = new  MaximizeDistanceToClosestPerson();
        Assert.assertEquals(3, test.maxDistToClosest(new int[]{1,0,0,0}));
    }
}
