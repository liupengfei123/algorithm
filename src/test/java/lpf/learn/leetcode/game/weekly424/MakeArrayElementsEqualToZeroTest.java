package lpf.learn.leetcode.game.weekly424;

import org.junit.Assert;
import org.junit.Test;

public class MakeArrayElementsEqualToZeroTest {
    @Test
    public void test1(){
        MakeArrayElementsEqualToZero test = new MakeArrayElementsEqualToZero();
        Assert.assertEquals(2, test.countValidSelections(new int[]{1,0,2,0,3}));
    }

    @Test
    public void test2(){
        MakeArrayElementsEqualToZero test = new MakeArrayElementsEqualToZero();
        Assert.assertEquals(0, test.countValidSelections(new int[]{2,3,4,0,4,1,0}));
    }

    @Test
    public void test3(){
        MakeArrayElementsEqualToZero test = new MakeArrayElementsEqualToZero();
        Assert.assertEquals(1, test.countValidSelections(new int[]{1,0,2,0,4}));
    }

}
