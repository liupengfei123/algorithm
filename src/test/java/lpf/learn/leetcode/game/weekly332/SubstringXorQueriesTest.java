package lpf.learn.leetcode.game.weekly332;

import org.junit.Assert;
import org.junit.Test;

public class SubstringXorQueriesTest {
    @Test
    public void test1(){
        SubstringXorQueries test = new SubstringXorQueries();
        Assert.assertArrayEquals(new int[][]{{0,2},{2,3}}, test.substringXorQueries("101101", new int[][]{{0,5},{1,2}}));
    }

    @Test
    public void test2(){
        SubstringXorQueries test = new SubstringXorQueries();
        Assert.assertArrayEquals(new int[][]{{-1,-1}}, test.substringXorQueries("0101", new int[][]{{12,8}}));
    }


    @Test
    public void test3(){
        SubstringXorQueries test = new SubstringXorQueries();
        Assert.assertArrayEquals(new int[][]{{0,0}}, test.substringXorQueries("1", new int[][]{{4,5}}));
    }
}
