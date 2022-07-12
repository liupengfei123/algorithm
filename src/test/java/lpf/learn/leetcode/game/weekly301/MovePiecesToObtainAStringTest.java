package lpf.learn.leetcode.game.weekly301;

import org.junit.Assert;
import org.junit.Test;

public class MovePiecesToObtainAStringTest {

    @Test
    public void test1(){
        MovePiecesToObtainAString test = new MovePiecesToObtainAString();
        Assert.assertTrue(test.canChange("_L__R__R_", "L______RR"));
    }

    @Test
    public void test2(){
        MovePiecesToObtainAString test = new MovePiecesToObtainAString();
        Assert.assertFalse(test.canChange("R_L_", "__LR"));
    }

    @Test
    public void test3(){
        MovePiecesToObtainAString test = new MovePiecesToObtainAString();
        Assert.assertFalse(test.canChange("_R", "R_"));
    }

    @Test
    public void test4(){
        MovePiecesToObtainAString test = new MovePiecesToObtainAString();
        Assert.assertTrue(test.canChange("_L_L__RRR", "LL____RRR"));
    }


    @Test
    public void test5(){
        MovePiecesToObtainAString test = new MovePiecesToObtainAString();
        Assert.assertFalse(test.canChange("L_L_", "_LL_"));
    }
}
