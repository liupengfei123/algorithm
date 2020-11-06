package lpf.learn.leetcode.tags.hash;

import lpf.learn.leetcode.learn.linked_list.SerializeAndDeserializeBinaryLinked;
import lpf.learn.leetcode.tags.linked.PartitionList;
import org.junit.Assert;
import org.junit.Test;

public class PartitionListTest {
    @Test
    public void test1(){
        PartitionList test = new PartitionList();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("1,2,2,4,3,5"), test.partition(temp.deserialize("1,4,3,2,5,2"), 3));
    }

    @Test
    public void test2(){
        PartitionList test = new PartitionList();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("1,4,3,2,5,2"), test.partition(temp.deserialize("1,4,3,2,5,2"), 1));
    }

    @Test
    public void test3(){
        PartitionList test = new PartitionList();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("1,2,2,4,4,3,5"), test.partition(temp.deserialize("4,1,4,3,2,5,2"), 3));
    }

    @Test
    public void test4(){
        PartitionList test = new PartitionList();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        Assert.assertEquals(temp.deserialize("1,4,4,3,2,5,2"), test.partition(temp.deserialize("4,1,4,3,2,5,2"), 2));
    }


}
