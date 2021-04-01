package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class KnightProbabilityInChessboardTest {
    @Test
    public void test1(){
        KnightProbabilityInChessboard test = new KnightProbabilityInChessboard();
        Assert.assertEquals(0.0625, test.knightProbability(3,2,0,0), 0.000001);
    }

    @Test
    public void test2(){
        KnightProbabilityInChessboard test = new KnightProbabilityInChessboard();
        Assert.assertEquals(0.00019, test.knightProbability(8,30,6,4), 0.000001);
    }

    @Test
    public void test3(){
        KnightProbabilityInChessboard test = new KnightProbabilityInChessboard();
        Assert.assertEquals(0.00098, test.knightProbability(3,5,0,0), 0.00001);
    }

    @Test
    public void test4(){
        KnightProbabilityInChessboard test = new KnightProbabilityInChessboard();
        Assert.assertEquals(0.01562,test.knightProbability(3,3,0,0), 0.00001);
    }


}
