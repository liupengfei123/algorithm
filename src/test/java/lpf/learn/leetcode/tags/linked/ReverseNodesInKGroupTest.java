package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.learn.linked_list.SerializeAndDeserializeBinaryLinked;
import org.junit.Assert;
import org.junit.Test;

public class ReverseNodesInKGroupTest {
    @Test
    public void test1(){
        ReverseNodesInKGroup test = new ReverseNodesInKGroup();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("2,1,4,3,5"), test.reverseKGroup(temp.deserialize("1,2,3,4,5"), 2));
    }

    @Test
    public void test2(){
        ReverseNodesInKGroup test = new ReverseNodesInKGroup();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("3,2,1,4,5"), test.reverseKGroup(temp.deserialize("1,2,3,4,5"), 3));
    }

    @Test
    public void test3(){
        ReverseNodesInKGroup test = new ReverseNodesInKGroup();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("5,4,3,2,1"), test.reverseKGroup(temp.deserialize("1,2,3,4,5"), 5));
    }

    @Test
    public void test4(){
        ReverseNodesInKGroup test = new ReverseNodesInKGroup();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("1,2,3,4,5"), test.reverseKGroup(temp.deserialize("1,2,3,4,5"), 1));
    }
}
