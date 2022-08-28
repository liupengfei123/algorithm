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

    @Test
    public void test3(){
        MinimumHoursOfTrainingToWinACompetition test = new MinimumHoursOfTrainingToWinACompetition();
        Assert.assertEquals(650, test.minNumberOfHours(94, 70,
                new int[]{58,47,100,71,47,6,92,82,35,16,50,15,42,5,2,45,22},
                new int[]{77,83,99,76,75,66,58,84,44,98,70,41,48,7,10,61,28}));
    }

}
