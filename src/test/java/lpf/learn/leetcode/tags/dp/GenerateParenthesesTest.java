package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParenthesesTest {
    @Test
    public void test1(){
        ArrayList<Object> list = new ArrayList<>();
        list.add("()");

        GenerateParentheses test = new GenerateParentheses();
        Assert.assertEquals(list, test.generateParenthesis(1));
    }

    @Test
    public void test2(){
        ArrayList<Object> list = new ArrayList<>();
        list.add("()()");
        list.add("(())");

        GenerateParentheses test = new GenerateParentheses();
        Assert.assertEquals(list, test.generateParenthesis(2));
    }

    @Test
    public void test3(){
        ArrayList<Object> list = new ArrayList<>();
        list.add("()()()");
        list.add("()(())");
        list.add("(()())");
        list.add("((()))");
        list.add("(())()");

        GenerateParentheses test = new GenerateParentheses();
        Assert.assertEquals(list, test.generateParenthesis(3));
    }

    @Test
    public void test4(){
        String[] strings = {"()()()()", "()()(())", "()(())()", "()(()())", "()((()))", "(())()()", "(())(())", "(()())()", "((()))()", "(()()())", "(()(()))", "((())())", "((()()))", "(((())))"};

        List<String> list = Arrays.asList(strings);

        GenerateParentheses test = new GenerateParentheses();
        Assert.assertEquals(list, test.generateParenthesis(4));
    }
}
