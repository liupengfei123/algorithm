package lpf.learn.leetcode.tags.number;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfThreeTest {
    @Test
    public void test1(){
        PowerOfThree test = new PowerOfThree();
        Assert.assertFalse(test.isPowerOfThree(-10));
    }

    @Test
    public void test2(){
        PowerOfThree test = new PowerOfThree();
        Assert.assertFalse(test.isPowerOfThree(0));
    }

    @Test
    public void test3(){
        PowerOfThree test = new PowerOfThree();
        Assert.assertTrue(test.isPowerOfThree(1));
    }


    @Test
    public void test4(){
        PowerOfThree test = new PowerOfThree();
        Assert.assertTrue(test.isPowerOfThree(3));
    }

    @Test
    public void test5(){
        PowerOfThree test = new PowerOfThree();
        Assert.assertTrue(test.isPowerOfThree(27));
    }

    @Test
    public void test6(){
        PowerOfThree test = new PowerOfThree();
        Assert.assertTrue(test.isPowerOfThree(9));
    }

    @Test
    public void test7(){
        PowerOfThree test = new PowerOfThree();
        Assert.assertFalse(test.isPowerOfThree(45));
    }

}
