package lpf.learn.leetcode.game.weekly338;

import org.junit.Assert;
import org.junit.Test;

public class PrimeSubtractionOperationTest {
    @Test
    public void test1(){
        PrimeSubtractionOperation test = new PrimeSubtractionOperation();
        Assert.assertTrue(test.primeSubOperation(new int[]{4, 9, 6, 10}));
    }

    @Test
    public void test2(){
        PrimeSubtractionOperation test = new PrimeSubtractionOperation();
        Assert.assertTrue(test.primeSubOperation(new int[]{6, 8, 11, 12}));
    }

    @Test
    public void test3(){
        PrimeSubtractionOperation test = new PrimeSubtractionOperation();
        Assert.assertFalse(test.primeSubOperation(new int[]{5, 8, 3}));
    }
}
