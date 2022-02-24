package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class WhereWillTheBallFallTest {
    @Test
    public void test1(){
        WhereWillTheBallFall test = new WhereWillTheBallFall();
        Assert.assertArrayEquals(new int[]{1,-1,-1,-1,-1},
                test.findBall(new int[][]{{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}}));
    }

    @Test
    public void test2(){
        WhereWillTheBallFall test = new WhereWillTheBallFall();
        Assert.assertArrayEquals(new int[]{-1},
                test.findBall(new int[][]{{-1}}));
    }

    @Test
    public void test3(){
        WhereWillTheBallFall test = new WhereWillTheBallFall();
        Assert.assertArrayEquals(new int[]{0,1,2,3,4,-1},
                test.findBall(new int[][]{{1,1,1,1,1,1},{-1,-1,-1,-1,-1,-1},{1,1,1,1,1,1},{-1,-1,-1,-1,-1,-1}}));
    }

    @Test
    public void test4(){
        WhereWillTheBallFall test = new WhereWillTheBallFall();
        Assert.assertArrayEquals(new int[]{-1,-1,-1,2,3,4,5,6,-1,-1,9,10,11,14,-1,-1,15,16,19,20,-1,-1,21,24,-1,-1,25,-1,-1,28,29,30,31,32,33,34,35,-1,-1,-1,-1,40,41,42,43,44,45,-1,-1,48,-1,-1,-1,-1,53,56,-1,-1,-1,-1,59,60,61,64,65,66,67,68,-1,-1,71,72,-1,-1,75,76,-1,-1,77,78,-1,-1,-1,-1,83,86,-1,-1,87,-1,-1,-1,-1,94,95,-1,-1,96,97,98},
                test.findBall(new int[][]{{-1,1,-1,-1,-1,-1,-1,-1,1,-1,-1,-1,-1,1,1,-1,-1,-1,1,1,1,-1,-1,1,1,-1,-1,1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,-1,1,-1,-1,-1,-1,-1,-1,-1,1,-1,-1,1,-1,1,-1,-1,1,1,-1,1,-1,-1,-1,-1,1,1,1,1,1,1,-1,1,1,1,-1,1,1,1,-1,-1,-1,1,-1,1,-1,-1,1,1,-1,-1,1,-1,1,-1,1,1,1,-1,-1,-1,-1}}));
    }

    @Test
    public void test5(){
        CoinChange test = new CoinChange();
        Assert.assertEquals(0, test.coinChange(new int[]{2}, 0));
    }

    @Test
    public void test6(){
        CoinChange test = new CoinChange();
        Assert.assertEquals(3, test.coinChange(new int[]{1}, 3));
    }



}
