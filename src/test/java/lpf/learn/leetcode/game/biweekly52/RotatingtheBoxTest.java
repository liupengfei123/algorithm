package lpf.learn.leetcode.game.biweekly52;

import org.junit.Assert;
import org.junit.Test;

public class RotatingtheBoxTest {
    @Test
    public void test1(){
        RotatingtheBox test = new RotatingtheBox();
        Assert.assertArrayEquals(new char[][]{{'.'},{'#'},{'#'}}, test.rotateTheBox(new char[][]{{'#','.','#'}}));
    }

    @Test
    public void test2(){
        RotatingtheBox test = new RotatingtheBox();
        Assert.assertArrayEquals(new char[][]{{'#','.'},{'#','#'},{'*','*'},{'.','.'}}, test.rotateTheBox(new char[][]{{'#','.','*','.'}, {'#','#','*','.'}}));
    }

    @Test
    public void test3(){
        RotatingtheBox test = new RotatingtheBox();
        Assert.assertArrayEquals(new char[][]{{'.','#','#'},{'.','#','#'},{'#','#','*'},{'#','*','.'},{'#','.','*'},{'#','.','.'}}, test.rotateTheBox(new char[][]{{'#','#','*','.','*','.'}, {'#','#','#','*','.','.'},{'#','#','#','.','#','.'}}));
    }

    @Test
    public void test4(){
        RotatingtheBox test = new RotatingtheBox();
        Assert.assertArrayEquals(new char[][]{{'.'},{'.'},{'#'}}, test.rotateTheBox(new char[][]{{'.','#','.'}}));
    }
}
