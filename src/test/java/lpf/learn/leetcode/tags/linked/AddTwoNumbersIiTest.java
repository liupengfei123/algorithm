package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.learn.linked_list.SerializeAndDeserializeBinaryLinked;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersIiTest {
    @Test
    public void test1(){
        AddTwoNumbersIi test = new AddTwoNumbersIi();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("7,8,0,7"), test.addTwoNumbers(temp.deserialize("7,2,4,3"), temp.deserialize("5,6,4")));
    }

    @Test
    public void test2(){
        AddTwoNumbersIi test = new AddTwoNumbersIi();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("0"), test.addTwoNumbers(temp.deserialize("0"), temp.deserialize("0")));
    }

    @Test
    public void test3(){
        AddTwoNumbersIi test = new AddTwoNumbersIi();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("1,0,0,9"), test.addTwoNumbers(temp.deserialize("1,0"), temp.deserialize("9,9,9")));
    }
}
