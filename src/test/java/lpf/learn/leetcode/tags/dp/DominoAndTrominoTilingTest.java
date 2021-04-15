package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class DominoAndTrominoTilingTest {
    @Test
    public void test1(){
        DominoAndTrominoTiling test = new DominoAndTrominoTiling();
        Assert.assertEquals(5, test.numTilings(3));
    }

    @Test
    public void test2(){
        DominoAndTrominoTiling test = new DominoAndTrominoTiling();
        Assert.assertEquals(11, test.numTilings(4));
    }

    @Test
    public void test3(){
        DominoAndTrominoTiling test = new DominoAndTrominoTiling();
        Assert.assertEquals(24, test.numTilings(5));
    }

    @Test
    public void test4(){
        DominoAndTrominoTiling test = new DominoAndTrominoTiling();
        Assert.assertEquals(53, test.numTilings(6));
    }


    @Test
    public void test5(){
        DominoAndTrominoTiling test = new DominoAndTrominoTiling();
        Assert.assertEquals(117, test.numTilings(7));
    }

    @Test
    public void test6(){
        DominoAndTrominoTiling test = new DominoAndTrominoTiling();
        Assert.assertEquals(3418626, test.numTilings(20));
    }

    @Test
    public void test7(){
        DominoAndTrominoTiling test = new DominoAndTrominoTiling();
        Assert.assertEquals(312342182, test.numTilings(30));
    }


}
