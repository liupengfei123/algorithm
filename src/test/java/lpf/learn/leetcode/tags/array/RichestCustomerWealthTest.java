package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

public class RichestCustomerWealthTest {

    @Test
    public void test1(){
        RichestCustomerWealth test = new RichestCustomerWealth();
        Assert.assertEquals(6, test.maximumWealth(new int[][]{{1,2,3},{3,2,1}}));
    }

    @Test
    public void test2(){
        RichestCustomerWealth test = new RichestCustomerWealth();
        Assert.assertEquals(10, test.maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));
    }

    @Test
    public void test3(){
        RichestCustomerWealth test = new RichestCustomerWealth();
        Assert.assertEquals(17, test.maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}}));
    }

}
