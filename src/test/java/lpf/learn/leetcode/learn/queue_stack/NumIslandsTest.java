package lpf.learn.leetcode.learn.queue_stack;

import org.junit.Assert;
import org.junit.Test;

public class NumIslandsTest {

    @Test
    public void test() {
        NumberOfIslands numIslands = new NumberOfIslands(); // 设置长度为 3

        Assert.assertEquals(1, numIslands.numIslands(new char[][]{"11110".toCharArray(), "11010".toCharArray(), "11000".toCharArray(), "00000".toCharArray()}));

        Assert.assertEquals(3, numIslands.numIslands(new char[][]{"11000".toCharArray(), "11000".toCharArray(), "00100".toCharArray(), "00011".toCharArray()}));

        Assert.assertEquals(1, numIslands.numIslands(new char[][]{"1".toCharArray()}));
    }
}
