package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExclusiveTimeOfFunctionsTest {

    @Test
    public void test(){
        ExclusiveTimeOfFunctions test = new ExclusiveTimeOfFunctions();

        List<String> list = new ArrayList<>();
        list.add("0:start:0");
        list.add("1:start:2");
        list.add("1:end:5");
        list.add("2:start:5");
        list.add("2:end:6");
        list.add("0:end:6");
        Assert.assertArrayEquals(new int[]{1,4,2}, test.exclusiveTime(3, list));

    }
}
