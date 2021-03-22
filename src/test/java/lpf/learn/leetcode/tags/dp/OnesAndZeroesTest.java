package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class OnesAndZeroesTest {
    @Test
    public void test1(){
        OnesAndZeroes test = new OnesAndZeroes();
        Assert.assertEquals(4, test.findMaxForm(new String[]{"10", "0001", "111001", "1", "0"}, 5,3));
    }

    @Test
    public void test2(){
        OnesAndZeroes test = new OnesAndZeroes();
        Assert.assertEquals(2, test.findMaxForm(new String[]{"10", "0", "1"}, 1,1));
    }

    @Test
    public void test3(){
        OnesAndZeroes test = new OnesAndZeroes();
        Assert.assertEquals(3, test.findMaxForm(new String[]{"10", "0", "1"}, 2,2));
    }

    @Test
    public void test4(){
        OnesAndZeroes test = new OnesAndZeroes();
        Assert.assertEquals(0, test.findMaxForm(new String[]{"00","000"}, 1,3));
    }

    @Test
    public void test5(){
        OnesAndZeroes test = new OnesAndZeroes();
        Assert.assertEquals(3, test.findMaxForm(new String[]{"10", "0001", "111001", "1", "0"}, 3,4));
    }

    @Test
    public void test6(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(1, test.numberOfArithmeticSlices(new int[]{-230, 0, 230}));
    }

    @Test
    public void test7(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(6, test.numberOfArithmeticSlices(new int[]{2, 4, 4, 6, 8}));
    }

    @Test
    public void test8(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(5, test.numberOfArithmeticSlices(new int[]{7,7,7,7}));
    }

    @Test
    public void test9(){
        ArithmeticSlicesIiSubsequence test = new ArithmeticSlicesIiSubsequence();
        Assert.assertEquals(16, test.numberOfArithmeticSlices(new int[]{7,7,7,7,7}));
    }
}
