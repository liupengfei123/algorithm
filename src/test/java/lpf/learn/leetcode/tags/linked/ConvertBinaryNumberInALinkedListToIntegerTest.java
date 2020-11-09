package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.learn.linked_list.SerializeAndDeserializeBinaryLinked;
import org.junit.Assert;
import org.junit.Test;

public class ConvertBinaryNumberInALinkedListToIntegerTest {
    @Test
    public void test1(){
        ConvertBinaryNumberInALinkedListToInteger test = new ConvertBinaryNumberInALinkedListToInteger();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(5, test.getDecimalValue(temp.deserialize("1,0,1")));
    }

    @Test
    public void test2(){
        ConvertBinaryNumberInALinkedListToInteger test = new ConvertBinaryNumberInALinkedListToInteger();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(0, test.getDecimalValue(temp.deserialize("0")));
    }

    @Test
    public void test3(){
        ConvertBinaryNumberInALinkedListToInteger test = new ConvertBinaryNumberInALinkedListToInteger();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(1, test.getDecimalValue(temp.deserialize("1")));
    }

    @Test
    public void test4(){
        ConvertBinaryNumberInALinkedListToInteger test = new ConvertBinaryNumberInALinkedListToInteger();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(18880, test.getDecimalValue(temp.deserialize("1,0,0,1,0,0,1,1,1,0,0,0,0,0,0")));
    }

    @Test
    public void test5(){
        ConvertBinaryNumberInALinkedListToInteger test = new ConvertBinaryNumberInALinkedListToInteger();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(0, test.getDecimalValue(temp.deserialize("0,0,0")));
    }
}
