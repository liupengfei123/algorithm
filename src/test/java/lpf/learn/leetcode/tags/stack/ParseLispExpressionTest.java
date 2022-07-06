package lpf.learn.leetcode.tags.stack;


import org.junit.Assert;
import org.junit.Test;

public class ParseLispExpressionTest {

    @Test
    public void test1(){
        ParseLispExpression test = new ParseLispExpression();
        Assert.assertEquals(6, test.evaluate("(let x 2 y 1 (mult x (add x y)))"));
    }


    @Test
    public void test2(){
        ParseLispExpression test = new ParseLispExpression();
        Assert.assertEquals(6, test.evaluate("(let x 2 y 1 (mult (add x y) x))"));
    }

    @Test
    public void test3(){
        ParseLispExpression test = new ParseLispExpression();
        Assert.assertEquals(14, test.evaluate("(let x 2 (mult x (let x 3 y 4 (add x y))))"));
    }

    @Test
    public void test4(){
        ParseLispExpression test = new ParseLispExpression();
        Assert.assertEquals(2, test.evaluate("(let x 3 x 2 x)"));
    }

    @Test
    public void test5(){
        ParseLispExpression test = new ParseLispExpression();
        Assert.assertEquals(5, test.evaluate("(let x 1 y 2 x (add x y) (add x y))"));
    }

    @Test
    public void test6(){
        ParseLispExpression test = new ParseLispExpression();
        Assert.assertEquals(3, test.evaluate("(add 1 2)"));
    }

    @Test
    public void test7(){
        ParseLispExpression test = new ParseLispExpression();
        Assert.assertEquals(22, test.evaluate("(let x 2 y 1 22)"));
    }

    @Test
    public void test8(){
        ParseLispExpression test = new ParseLispExpression();
        Assert.assertEquals(-2, test.evaluate("(let x -2 y x y)"));
    }

    @Test
    public void test9(){
        ParseLispExpression test = new ParseLispExpression();
        Assert.assertEquals(5181, test.evaluate("(let var 78 b 77 (let c 33 (add c (mult var 66))))"));
    }

}
