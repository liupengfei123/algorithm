package lpf.learn.leetcode.tags.design;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class StockPriceFluctuationTest {

    @Test
    public void test1() {
        StockPriceFluctuation temp = new StockPriceFluctuation();
        temp.update(1, 10);
        temp.update(2, 5);
        Assert.assertEquals(temp.current(), 5);
        Assert.assertEquals(temp.maximum(), 10);

        temp.update(1, 3);
        Assert.assertEquals(temp.maximum(), 5);
        temp.update(4, 2);
        Assert.assertEquals(temp.minimum(), 2);
    }
}
