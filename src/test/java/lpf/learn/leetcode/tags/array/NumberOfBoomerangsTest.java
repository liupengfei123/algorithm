package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class NumberOfBoomerangsTest {

    @Test
    public void test1(){
        NumberOfBoomerangs test = new NumberOfBoomerangs();
        Assert.assertEquals(2, test.numberOfBoomerangs(new int[][]{{0,0},{1,0},{2,0}}));
    }

    @Test
    public void test2(){
        NumberOfBoomerangs test = new NumberOfBoomerangs();
        Assert.assertEquals(2, test.numberOfBoomerangs(new int[][]{{1,1},{2,2},{3,3}}));
    }

    @Test
    public void test3(){
        NumberOfBoomerangs test = new NumberOfBoomerangs();
        Assert.assertEquals(0, test.numberOfBoomerangs(new int[][]{{1,1}}));
    }

}
