package lpf.learn.leetcode.tags.array;

import lpf.learn.leetcode.tags.binarysearch.CapacityToShipPackagesWithinDDays;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class CapacityToShipPackagesWithinDDaysTest {

    @Test
    public void test1(){
        CapacityToShipPackagesWithinDDays test = new CapacityToShipPackagesWithinDDays();
        Assert.assertEquals(15, test.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));
    }

    @Test
    public void test2(){
        CapacityToShipPackagesWithinDDays test = new CapacityToShipPackagesWithinDDays();
        Assert.assertEquals(6, test.shipWithinDays(new int[]{3,2,2,4,1,4}, 3));
    }

    @Test
    public void test3(){
        CapacityToShipPackagesWithinDDays test = new CapacityToShipPackagesWithinDDays();
        Assert.assertEquals(3, test.shipWithinDays(new int[]{1,2,3,1,1}, 4));
    }

}
