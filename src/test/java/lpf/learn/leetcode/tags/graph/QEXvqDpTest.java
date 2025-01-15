package lpf.learn.leetcode.tags.graph;

import org.junit.Assert;
import org.junit.Test;

public class QEXvqDpTest {
    @Test
    public void test1(){
        QEXvqDp test = new QEXvqDp();
        Assert.assertArrayEquals(new int[][]{{2,1}}, test.ballGame(4, new String[]{"..E.",".EOW","..W."}));
    }

    @Test
    public void test2(){
        QEXvqDp test = new QEXvqDp();
        Assert.assertArrayEquals(new int[][]{{1,0},{2,4},{0,1},{3,2}}, test.ballGame(5, new String[]{".....","..E..",".WO..","....."}));
    }

    @Test
    public void test3(){
        QEXvqDp test = new QEXvqDp();
        Assert.assertArrayEquals(new int[0][0], test.ballGame(3, new String[]{".....","....O","....O","....."}));
    }


}
