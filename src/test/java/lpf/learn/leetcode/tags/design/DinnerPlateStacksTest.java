package lpf.learn.leetcode.tags.design;

import org.junit.Assert;

/**
 * @author liupf
 * @date 2021-04-10 20:04
 */
public class DinnerPlateStacksTest {

    @org.junit.Test
    public void test1() {
        DinnerPlateStacks temp = new DinnerPlateStacks(2);
        temp.push(1);
        temp.push(2);
        temp.push(3);
        temp.push(4);
        temp.push(5);

        Assert.assertEquals(2, temp.popAtStack(0));
        temp.push(20);
        temp.push(21);

        Assert.assertEquals(20, temp.popAtStack(0));
        Assert.assertEquals(21, temp.popAtStack(2));
        Assert.assertEquals(5, temp.pop());
        Assert.assertEquals(4, temp.pop());
        Assert.assertEquals(3, temp.pop());
        Assert.assertEquals(1, temp.pop());
        Assert.assertEquals(-1, temp.pop());
    }

    @org.junit.Test
    public void test2() {
        DinnerPlateStacks temp = new DinnerPlateStacks(1);
        temp.push(1);
        temp.push(2);
        Assert.assertEquals(2, temp.popAtStack(1));
        Assert.assertEquals(1, temp.pop());
        temp.push(1);
        temp.push(2);

        Assert.assertEquals(2, temp.pop());
        Assert.assertEquals(1, temp.pop());
    }
}
