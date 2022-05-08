package lpf.learn.leetcode.game.spring2022;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class QO5KpGTest {
    @Test
    public void test1(){
        QO5KpG test = new QO5KpG();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();
        TreeNode root = deserialize.deserialize("4,2,7,1,null,5,null,null,null,null,6");
        Assert.assertEquals(5, test.getNumber(root, new int[][]{{0,2,2},{1,1,5},{0,4,5},{1,5,7}}));



    }

    @Test
    public void test2(){
        UEcfPD test = new UEcfPD();
        Assert.assertEquals(11, test.perfectMenu(new int[]{10,10,10,10,10}, new int[][]{{1,1,1,1,1},{3,3,3,3,3},{10,10,10,10,10}}, new int[][]{{5,5},{6,6},{10,10}}, 1));
    }

    @Test
    public void test3(){
        UEcfPD test = new UEcfPD();
        Assert.assertEquals(-1, test.perfectMenu(new int[]{0,10,10,10,10}, new int[][]{{1,1,1,1,1},{3,3,3,3,3},{10,10,10,10,10}}, new int[][]{{5,5},{6,6},{10,10}}, 1));
    }

    @Test
    public void test4(){
        UEcfPD test = new UEcfPD();
        Assert.assertEquals(5, test.perfectMenu(new int[]{0,10,10,10,10}, new int[][]{{0,1,1,1,1},{3,3,3,3,3},{10,10,10,10,10}}, new int[][]{{5,5},{6,6},{10,10}}, 1));
    }

    @Test
    public void test5(){
        UEcfPD test = new UEcfPD();
        Assert.assertEquals(11, test.perfectMenu(new int[]{10,10,10,10,10}, new int[][]{{1,1,1,1,1},{10,10,10,10,10},{3,3,3,3,3}}, new int[][]{{5,5},{10,10},{6,6}}, 1));
    }

    @Test
    public void test6(){
        UEcfPD test = new UEcfPD();
        Assert.assertEquals(11, test.perfectMenu(new int[]{10,10,10,10,10}, new int[][]{{6,6,6,6,6},{1,1,1,1,1},{4,4,4,4,4}}, new int[][]{{5,5},{1,1},{6,6}}, 1));
    }
}
