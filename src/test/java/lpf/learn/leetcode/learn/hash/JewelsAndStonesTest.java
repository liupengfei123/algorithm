package lpf.learn.leetcode.learn.hash;


import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {

    @Test
    public void test1(){
        JewelsAndStones test = new JewelsAndStones();
        Assert.assertEquals(3, test.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    public void test2(){
        JewelsAndStones test = new JewelsAndStones();
        Assert.assertEquals(0, test.numJewelsInStones("z", "ZZ"));
    }
}
