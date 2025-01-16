package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

public class ShortestBridgeTest {
    @Test
    public void test1(){
        ShortestBridge test = new ShortestBridge();
        Assert.assertEquals(1, test.shortestBridge(new int[][]{{0,1},{1,0}}));
    }

    @Test
    public void test2(){
        ShortestBridge test = new ShortestBridge();
        Assert.assertEquals(2, test.shortestBridge(new int[][]{{0,1,0},{0,0,0},{0,0,1}}));
    }

    @Test
    public void test3(){
        ShortestBridge test = new ShortestBridge();
        Assert.assertEquals(1, test.shortestBridge(new int[][]{{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}}));
    }

    @Test
    public void test4(){
        ShortestBridge test = new ShortestBridge();
        Assert.assertEquals(1, test.shortestBridge(new int[][]{{0,1},{1,0}}));
    }

    @Test
    public void test5(){
        ShortestBridge test = new ShortestBridge();
        Assert.assertEquals(1, test.shortestBridge(new int[][]{{0,1},{1,0}}));
    }
}
