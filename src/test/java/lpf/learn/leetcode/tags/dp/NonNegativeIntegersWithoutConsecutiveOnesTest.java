package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class NonNegativeIntegersWithoutConsecutiveOnesTest {

    @Test
    public void test1(){
        NonNegativeIntegersWithoutConsecutiveOnes test = new NonNegativeIntegersWithoutConsecutiveOnes();
        Assert.assertEquals(5, test.findIntegers(5));
    }

    @Test
    public void test2(){
        NonNegativeIntegersWithoutConsecutiveOnes test = new NonNegativeIntegersWithoutConsecutiveOnes();
        Assert.assertEquals(5, test.findIntegers(7));
    }

    @Test
    public void test3(){
        NonNegativeIntegersWithoutConsecutiveOnes test = new NonNegativeIntegersWithoutConsecutiveOnes();
        Assert.assertEquals(4, test.findIntegers(4));
    }

    @Test
    public void test4(){
        NonNegativeIntegersWithoutConsecutiveOnes test = new NonNegativeIntegersWithoutConsecutiveOnes();
        Assert.assertEquals(8, test.findIntegers(15));
    }

    @Test
    public void test5(){
        NonNegativeIntegersWithoutConsecutiveOnes test = new NonNegativeIntegersWithoutConsecutiveOnes();
        Assert.assertEquals(9, test.findIntegers(16));
    }

    @Test
    public void test6(){
        NonNegativeIntegersWithoutConsecutiveOnes test = new NonNegativeIntegersWithoutConsecutiveOnes();
        Assert.assertEquals(29, test.findIntegers(77));
    }

    @Test
    public void test7(){
        NonNegativeIntegersWithoutConsecutiveOnes test = new NonNegativeIntegersWithoutConsecutiveOnes();
        Assert.assertEquals(1439005, test.findIntegers(546131845));
    }

    @Test
    public void test8(){
        NonNegativeIntegersWithoutConsecutiveOnes test = new NonNegativeIntegersWithoutConsecutiveOnes();
        Assert.assertEquals(1439005, test.findIntegers(546131846));
    }

    @Test
    public void test9(){
        NonNegativeIntegersWithoutConsecutiveOnes test = new NonNegativeIntegersWithoutConsecutiveOnes();
        Assert.assertEquals(34, test.findIntegers(85));
    }

    @Test
    public void test10(){
        NonNegativeIntegersWithoutConsecutiveOnes test = new NonNegativeIntegersWithoutConsecutiveOnes();
        Assert.assertEquals(33, test.findIntegers(84));
    }

    @Test
    public void test11(){
        NonNegativeIntegersWithoutConsecutiveOnes test = new NonNegativeIntegersWithoutConsecutiveOnes();
        Assert.assertEquals(2, test.findIntegers(1));
    }
}
