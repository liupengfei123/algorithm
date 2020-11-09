package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;
import lpf.learn.leetcode.learn.linked_list.SerializeAndDeserializeBinaryLinked;
import org.junit.Assert;
import org.junit.Test;

public class ReorderListTest {
    @Test
    public void test1(){
        ReorderList test = new ReorderList();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        ListNode deserialize = temp.deserialize("1,2,3,4,5,6,7,8");
        test.reorderList(deserialize);
        Assert.assertEquals(temp.deserialize("1,8,2,7,3,6,4,5"), deserialize);
    }

    @Test
    public void test2(){
        ReorderList test = new ReorderList();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        ListNode deserialize = temp.deserialize("1,2,3,4,5,6,7,8,9");
        test.reorderList(deserialize);
        Assert.assertEquals(temp.deserialize("1,9,2,8,3,7,4,6,5"), deserialize);
    }

    @Test
    public void test3(){
        ReorderList test = new ReorderList();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        ListNode deserialize = temp.deserialize("1");
        test.reorderList(deserialize);
        Assert.assertEquals(temp.deserialize("1"), deserialize);
    }


    @Test
    public void test4(){
        ReorderList test = new ReorderList();
        SerializeAndDeserializeBinaryLinked temp = new SerializeAndDeserializeBinaryLinked();
        ListNode deserialize = null;
        test.reorderList(deserialize);
        Assert.assertNull(deserialize);
    }

}
