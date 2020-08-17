package lpf.learn.leetcode.learn.hash;


import org.junit.Assert;
import org.junit.Test;

public class MinimumIndexSumOfTwoListsTest {

    @Test
    public void test1(){
        MinimumIndexSumOfTwoLists test = new MinimumIndexSumOfTwoLists();
        Assert.assertArrayEquals(new String[]{"Shogun"}, test.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));
    }

    @Test
    public void test2(){
        MinimumIndexSumOfTwoLists test = new MinimumIndexSumOfTwoLists();
        Assert.assertArrayEquals(new String[]{"Shogun"}, test.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"KFC", "Shogun", "Burger King"}));
    }

    @Test
    public void test3(){
        MinimumIndexSumOfTwoLists test = new MinimumIndexSumOfTwoLists();
        Assert.assertArrayEquals(new String[]{"KFC", "Shogun"}, test.findRestaurant(new String[]{"Shogun", "KFC", "Tapioca Express", "Burger King"}, new String[]{"KFC", "Shogun", "Burger King"}));
    }
}
