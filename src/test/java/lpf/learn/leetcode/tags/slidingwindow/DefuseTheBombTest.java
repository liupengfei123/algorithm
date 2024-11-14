package lpf.learn.leetcode.tags.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class DefuseTheBombTest {
    @Test
    public void test1() {
        DefuseTheBomb test = new DefuseTheBomb();
        Assert.assertArrayEquals(new int[]{12,10,16,13}, test.decrypt(new int[]{5,7,1,4}, 3));
    }

    @Test
    public void test2() {
        DefuseTheBomb test = new DefuseTheBomb();
        Assert.assertArrayEquals(new int[]{0,0,0,0}, test.decrypt(new int[]{1,2,3,4}, 0));
    }

    @Test
    public void test3() {
        DefuseTheBomb test = new DefuseTheBomb();
        Assert.assertArrayEquals(new int[]{12,5,6,13}, test.decrypt(new int[]{2,4,9,3}, -2));
    }

    @Test
    public void test4() {
        DefuseTheBomb test = new DefuseTheBomb();
        Assert.assertArrayEquals(new int[]{22,26,22,28,29,22,19,22,18,21,28,19}, test.decrypt(new int[]{10,5,7,7,3,2,10,3,6,9,1,6}, -4));
    }
}
