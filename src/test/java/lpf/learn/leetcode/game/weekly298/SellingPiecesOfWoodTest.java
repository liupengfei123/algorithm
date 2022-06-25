package lpf.learn.leetcode.game.weekly298;

import org.junit.Assert;
import org.junit.Test;

public class SellingPiecesOfWoodTest {
    @Test
    public void test1(){
        SellingPiecesOfWood test = new SellingPiecesOfWood();
        Assert.assertEquals(19, test.sellingWood(3,5,new int[][]{{1,4,2},{2,2,7},{2,1,3}}));
    }

    @Test
    public void test2(){
        SellingPiecesOfWood test = new SellingPiecesOfWood();
        Assert.assertEquals(32, test.sellingWood(4,6,new int[][]{{3,2,10},{1,4,2},{4,1,3}}));
    }
}
