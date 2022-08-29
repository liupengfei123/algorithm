package lpf.learn.leetcode.game.weekly307;

import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class AmountOfTimeForBinaryTreeToBeInfectedTest {
    @Test
    public void test1(){
        AmountOfTimeForBinaryTreeToBeInfected test = new AmountOfTimeForBinaryTreeToBeInfected();

        SerializeAndDeserializeBinaryTree deserializeBinaryTree = new SerializeAndDeserializeBinaryTree();

        Assert.assertEquals(4, test.amountOfTime(deserializeBinaryTree.deserialize("1,5,3,null,4,10,6,9,2"), 3));
    }

    @Test
    public void test2(){
        AmountOfTimeForBinaryTreeToBeInfected test = new AmountOfTimeForBinaryTreeToBeInfected();

        SerializeAndDeserializeBinaryTree deserializeBinaryTree = new SerializeAndDeserializeBinaryTree();

        Assert.assertEquals(4, test.amountOfTime(deserializeBinaryTree.deserialize("2,13,3,null,6,null,null,9,7,19,4,null,null,null,10,null,null,null,12"), 13));
    }
}
