package lpf.learn.leetcode.game.weekly348;

import org.junit.Assert;
import org.junit.Test;

public class SumOfMatrixAfterQueriesTest {
    @Test
    public void test1(){
        SumOfMatrixAfterQueries test = new SumOfMatrixAfterQueries();
        Assert.assertEquals(23, test.matrixSumQueries(3, new int[][]{{0,0,1},{1,2,2},{0,2,3},{1,0,4}}));
    }


    @Test
    public void test2(){
        SumOfMatrixAfterQueries test = new SumOfMatrixAfterQueries();
        Assert.assertEquals(17, test.matrixSumQueries(3, new int[][]{{0,0,4},{0,1,2},{1,0,1},{0,2,3},{1,2,1}}));
    }

    @Test
    public void test3(){
        SumOfMatrixAfterQueries test = new SumOfMatrixAfterQueries();
        Assert.assertEquals(81413097, test.matrixSumQueries(39, new int[][]{{1,20,7222},{0,14,97313},{0,33,90376},{0,17,89628},{0,10,63603},{1,1,39407},{1,5,68084},{1,17,51801},{0,9,28605},{1,36,87373},{1,18,38086},{1,24,51236},{0,20,57785},{0,35,59081},{1,29,24736},{0,38,29390},{0,21,30828},{1,31,37110},{1,11,82410},{0,29,47444},{1,33,36134},{0,1,39202},{0,3,76956},{1,35,37620},{0,30,92489},{1,8,71949},{1,14,22289},{1,10,91153},{1,9,9954},{0,15,88553},{0,34,26252},{0,28,40440},{0,5,72460},{1,16,60240},{0,31,81277},{0,19,39239},{1,15,56301},{1,37,8620},{1,4,13419},{1,21,20809},{1,3,38434},{0,4,66679},{1,22,34857},{0,0,73735},{1,12,91469},{1,34,19479},{1,6,47752},{0,8,85819},{0,37,56727},{0,11,42986},{0,18,43103},{0,2,76746},{0,13,92609},{1,19,50822},{0,26,695},{1,23,12450},{1,32,35845},{0,24,89680},{1,2,81550},{1,25,61760},{0,32,85529},{0,27,21067},{0,7,30773},{1,7,35378},{1,38,48049},{0,12,92408},{1,30,95792},{1,28,66299},{1,0,88668},{0,25,63681},{0,36,2839},{0,23,69365},{1,13,13017},{0,16,74604},{1,27,57191},{1,26,49753},{0,6,60646},{0,22,41232}}));
    }
}

        