package lpf.learn.leetcode.game.weekly299;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfMatrixIsXMatrixTest {

    @Test
    public void test1(){
        CheckIfMatrixIsXMatrix test = new CheckIfMatrixIsXMatrix();
        Assert.assertTrue(test.checkXMatrix(new int[][]{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}}));
    }

    @Test
    public void test2(){
        CheckIfMatrixIsXMatrix test = new CheckIfMatrixIsXMatrix();
        Assert.assertFalse(test.checkXMatrix(new int[][]{{5, 7, 0}, {0, 3, 1}, {0, 5, 0}}));
    }

}
