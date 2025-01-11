package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class CountSubmatricesWithAllOnesTest {

    @Test
    public void test1(){
        CountSubmatricesWithAllOnes test = new CountSubmatricesWithAllOnes();
        Assert.assertEquals(13, test.numSubmat(new int[][]{{1,0,1},{1,1,0},{1,1,0}}));
    }
    
    @Test
    public void test2(){
        CountSubmatricesWithAllOnes test = new CountSubmatricesWithAllOnes();
        Assert.assertEquals(24, test.numSubmat(new int[][]{{0,1,1,0},{0,1,1,1},{1,1,1,0}}));
    }

    @Test
    public void test3(){
        CountSubmatricesWithAllOnes test = new CountSubmatricesWithAllOnes();
        Assert.assertEquals(7, test.numSubmat(new int[][]{{0,1},{1,1},{1,0}}));
    }
}
