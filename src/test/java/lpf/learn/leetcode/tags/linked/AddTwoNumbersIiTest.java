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
        ReverseLinkedListIi test = new ReverseLinkedListIi();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("6,5,4,3,2,1"), test.reverseBetween(temp.deserialize("1,2,3,4,5,6"), 1,6));
    }

    @Test
    public void test3(){
        ReverseLinkedListIi test = new ReverseLinkedListIi();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("1,2,3,4,5,6"), test.reverseBetween(temp.deserialize("1,2,3,4,5,6"), 1,1));
    }

    @Test
    public void test4(){
        PartitionList test = new PartitionList();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("1,4,4,3,2,5,2"), test.partition(temp.deserialize("4,1,4,3,2,5,2"), 2));
    }


}
