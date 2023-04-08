package lpf.learn.leetcode.game.weekly332;

import org.junit.Assert;
import org.junit.Test;

public class FindTheArrayConcatenationValueTest {
    @Test
    public void test1(){
        FindTheArrayConcatenationValue test = new FindTheArrayConcatenationValue();
        Assert.assertEquals(596, test.findTheArrayConcVal(new int[]{7,52,2,4}));
    }

    @Test
    public void test2(){
        FindTheArrayConcatenationValue test = new FindTheArrayConcatenationValue();
        Assert.assertEquals(673, test.findTheArrayConcVal(new int[]{5,14,13,8,12}));
    }
}
