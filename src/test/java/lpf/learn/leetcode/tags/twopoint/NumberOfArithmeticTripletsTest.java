package lpf.learn.leetcode.tags.twopoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class NumberOfArithmeticTripletsTest {

    @Test
    public void test1(){
        NumberOfArithmeticTriplets test = new NumberOfArithmeticTriplets();
        Assert.assertEquals(2, test.arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3));
    }

    @Test
    public void test2(){
        NumberOfArithmeticTriplets test = new NumberOfArithmeticTriplets();
        Assert.assertEquals(2, test.arithmeticTriplets(new int[]{4,5,6,7,8,9}, 2));
    }
}
