package lpf.learn.leetcode.game.biweekly83;

import org.junit.Assert;
import org.junit.Test;

public class DesignANumberContainerSystemTest {
    @Test
    public void test1(){
        DesignANumberContainerSystem test = new DesignANumberContainerSystem();
        Assert.assertEquals(-1, test.find(10)); // 没有数字 10 ，所以返回 -1 。
        test.change(2, 10); // 容器中下标为 2 处填入数字 10 。
        test.change(1, 10); // 容器中下标为 1 处填入数字 10 。
        test.change(3, 10); // 容器中下标为 3 处填入数字 10 。
        test.change(5, 10); // 容器中下标为 5 处填入数字 10 。

        Assert.assertEquals(1, test.find(10)); // 数字 10 所在的下标为 1 ，2 ，3 和 5 。因为最小下标为 1 ，所以返回 1 。

        test.change(1, 20); // 容器中下标为 1 处填入数字 20 。注意，下标 1 处之前为 10 ，现在被替换为 20 。

        Assert.assertEquals(2, test.find(10)); // 数字 10 所在下标为 2 ，3 和 5 。最小下标为 2 ，所以返回 2 。
    }

    @Test
    public void test2(){
        DesignANumberContainerSystem test = new DesignANumberContainerSystem();
        test.change(1, 10);
        Assert.assertEquals(1, test.find(10));
        test.change(1, 20);

        Assert.assertEquals(-1, test.find(10));
        Assert.assertEquals(1, test.find(20));
        Assert.assertEquals(-1, test.find(30));
    }
}
