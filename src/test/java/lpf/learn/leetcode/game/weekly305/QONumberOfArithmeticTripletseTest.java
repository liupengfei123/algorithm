package lpf.learn.leetcode.game.weekly305;

import org.junit.Assert;
import org.junit.Test;

public class QONumberOfArithmeticTripletseTest {
    @Test
    public void test1(){
        QONumberOfArithmeticTripletse test = new QONumberOfArithmeticTripletse();
        Assert.assertEquals(2, test.arithmeticTriplets(new int[]{4,5,6,7,8,9}, 2));
    }



}
