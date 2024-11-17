package lpf.learn.leetcode.game.weekly340;

import org.junit.Assert;
import org.junit.Test;

public class PrimeInDiagonalTest {

    @Test
    public void test1(){
        PrimeInDiagonal test = new PrimeInDiagonal();
        Assert.assertEquals(11, test.diagonalPrime(new int[][]{{1,2,3},{5,6,7},{9,10,11}}));
    }
}
