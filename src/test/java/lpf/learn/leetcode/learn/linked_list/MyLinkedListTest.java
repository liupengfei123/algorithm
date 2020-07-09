package lpf.learn.leetcode.learn.linked_list;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void test() {


        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(7);
        obj.addAtHead(2);
        obj.addAtHead(1);
        obj.addAtIndex(3,0);
        obj.deleteAtIndex(2);
        obj.addAtHead(6);
        obj.addAtTail(4);
        Assert.assertEquals(4, obj.get(4));
        obj.addAtHead(4);
        obj.addAtIndex(5,0);
        obj.addAtHead(6);
    }


}
