package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;
import lpf.learn.leetcode.learn.tree.SerializeAndDeserializeBinaryTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrintBinaryTreeTest {

    @Test
    public void test1() {
        PrintBinaryTree temp = new PrintBinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("1,2");

        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("", "1", ""));
        expected.add(Arrays.asList("2", "", ""));

        assertEquals(expected, temp.printTree(root));
    }

    @Test
    public void test2() {
        PrintBinaryTree temp = new PrintBinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("1,2,3,null,4");


        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("","","","1","","",""));
        expected.add(Arrays.asList("","2","","","","3",""));
        expected.add(Arrays.asList("","","4","","","",""));

        assertEquals(expected, temp.printTree(root));
    }

    @Test
    public void test3() {
        PrintBinaryTree temp = new PrintBinaryTree();
        SerializeAndDeserializeBinaryTree deserialize = new SerializeAndDeserializeBinaryTree();

        TreeNode root = deserialize.deserialize("1,2,5,3,null,null,null,4");


        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("","","","","","","","1","","","","","","",""));
        expected.add(Arrays.asList("","","","2","","","","","","","","5","","",""));
        expected.add(Arrays.asList("","3","","","","","","","","","","","","",""));
        expected.add(Arrays.asList("4","","","","","","","","","","","","","",""));

        assertEquals(expected, temp.printTree(root));
    }
}
