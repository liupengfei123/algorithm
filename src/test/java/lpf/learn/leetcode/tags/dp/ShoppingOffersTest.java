package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingOffersTest {
    @Test
    public void test1(){
        ShoppingOffers test = new ShoppingOffers();
        List<List<Integer>> special = new ArrayList<>();
        special.add(Arrays.asList(3, 0, 5));
        special.add(Arrays.asList(1, 2, 10));
        Assert.assertEquals(14, test.shoppingOffers(Arrays.asList(2,5), special, Arrays.asList(3,2)));
    }

    @Test
    public void test2(){
        ShoppingOffers test = new ShoppingOffers();
        List<List<Integer>> special = new ArrayList<>();
        special.add(Arrays.asList(1,1,0,4));
        special.add(Arrays.asList(2,2,1,9));
        Assert.assertEquals(11, test.shoppingOffers(Arrays.asList(2,3,4), special, Arrays.asList(1,2,1)));
    }

    @Test
    public void test3(){
        ShoppingOffers test = new ShoppingOffers();
        List<List<Integer>> special = new ArrayList<>();
        special.add(Arrays.asList(1,1,1));
        special.add(Arrays.asList(1,1,2));
        special.add(Arrays.asList(1,1,3));
        special.add(Arrays.asList(1,1,4));
        special.add(Arrays.asList(1,1,5));
        special.add(Arrays.asList(1,1,6));
        special.add(Arrays.asList(1,1,7));
        special.add(Arrays.asList(1,1,8));
        special.add(Arrays.asList(1,1,9));
        special.add(Arrays.asList(1,1,10));
        special.add(Arrays.asList(1,1,11));
        special.add(Arrays.asList(1,1,12));
        special.add(Arrays.asList(1,1,13));
        special.add(Arrays.asList(1,1,14));
        special.add(Arrays.asList(1,1,15));

        Assert.assertEquals(10, test.shoppingOffers(Arrays.asList(2,2), special, Arrays.asList(10,10)));
    }
}
