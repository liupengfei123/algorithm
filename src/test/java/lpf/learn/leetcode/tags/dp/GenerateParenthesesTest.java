package lpf.learn.leetcode.tags.dp;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class GenerateParenthesesTest {
    @Test
    public void test1(){
        String[] expected = {"()"};

        GenerateParentheses test = new GenerateParentheses();
        MatcherAssert.assertThat(test.generateParenthesis(1), Matchers.containsInAnyOrder(expected));
    }

    @Test
    public void test2(){
        String[] expected = {"()()", "(())"};

        GenerateParentheses test = new GenerateParentheses();
        MatcherAssert.assertThat(test.generateParenthesis(2), Matchers.containsInAnyOrder(expected));
    }

    @Test
    public void test3(){
        String[] expected = {"()()()", "()(())", "(()())", "((()))", "(())()"};

        GenerateParentheses test = new GenerateParentheses();
        MatcherAssert.assertThat(test.generateParenthesis(3), Matchers.containsInAnyOrder(expected));
    }

    @Test
    public void test4(){
        String[] expected = {"()()()()", "()()(())", "()(())()", "()(()())", "()((()))", "(())()()", "(())(())", "(()())()", "((()))()", "(()()())", "(()(()))", "((())())", "((()()))", "(((())))"};

        GenerateParentheses test = new GenerateParentheses();
        MatcherAssert.assertThat(test.generateParenthesis(4), Matchers.containsInAnyOrder(expected));
    }
}
