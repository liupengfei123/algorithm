package lpf.learn.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;


public class DivingBoardLcciTest {
    @Test
    public void test() {

        DivingBoardLcci temp = new DivingBoardLcci();


        Assert.assertArrayEquals(new int[]{3,4,5,6}, temp.divingBoard(1,2,3));


    }


}
