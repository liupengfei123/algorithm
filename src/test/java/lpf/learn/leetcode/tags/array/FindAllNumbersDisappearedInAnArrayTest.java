package lpf.learn.leetcode.tags.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liupf
 * @date 2020-09-07 21:45
 */
public class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void test1(){
        FindAllNumbersDisappearedInAnArray test = new FindAllNumbersDisappearedInAnArray();
        List<Integer> result = new ArrayList<>();
        result.add(5);
        result.add(6);
        Assert.assertEquals(result, test.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    @Test
    public void test2(){
        FindAllNumbersDisappearedInAnArray test = new FindAllNumbersDisappearedInAnArray();
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(5);
        result.add(6);
        Assert.assertEquals(result, test.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,7}));
    }


}
