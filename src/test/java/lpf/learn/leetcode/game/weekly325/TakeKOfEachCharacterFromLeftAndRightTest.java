package lpf.learn.leetcode.game.weekly325;

import org.junit.Assert;
import org.junit.Test;

public class TakeKOfEachCharacterFromLeftAndRightTest {
    @Test
    public void test1(){
        TakeKOfEachCharacterFromLeftAndRight test = new TakeKOfEachCharacterFromLeftAndRight();
        Assert.assertEquals(8, test.takeCharacters("aabaaaacaabc", 2));
    }

    @Test
    public void test2(){
        TakeKOfEachCharacterFromLeftAndRight test = new TakeKOfEachCharacterFromLeftAndRight();
        Assert.assertEquals(-1, test.takeCharacters("a", 1));
    }

    @Test
    public void test3(){
        TakeKOfEachCharacterFromLeftAndRight test = new TakeKOfEachCharacterFromLeftAndRight();
        Assert.assertEquals(0, test.takeCharacters("a", 0));
    }

}
