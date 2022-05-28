package lpf.learn.leetcode.game.weekly294;

import org.junit.Assert;
import org.junit.Test;

public class MinimumLinesToRepresentALineChartTest {
    @Test
    public void test1(){
        MinimumLinesToRepresentALineChart test = new MinimumLinesToRepresentALineChart();
        Assert.assertEquals(3, test.minimumLines(new int[][]{{1,7},{2,6},{3,5},{4,4},{5,4},{6,3},{7,2},{8,1}}));
    }

    @Test
    public void test2(){
        MinimumLinesToRepresentALineChart test = new MinimumLinesToRepresentALineChart();
        Assert.assertEquals(1, test.minimumLines(new int[][]{{3,4},{1,2},{7,8},{2,3}}));
    }

    @Test
    public void test3(){
        MinimumLinesToRepresentALineChart test = new MinimumLinesToRepresentALineChart();
        Assert.assertEquals(-1, test.minimumLines(new int[][]{{3,4}}));
    }

    @Test
    public void test4(){
        MinimumLinesToRepresentALineChart test = new MinimumLinesToRepresentALineChart();
        Assert.assertEquals(2, test.minimumLines(new int[][]{{1,1},{2,2},{5,6},{11,14}}));
    }

    @Test
    public void test5(){
        MinimumLinesToRepresentALineChart test = new MinimumLinesToRepresentALineChart();
        Assert.assertEquals(29, test.minimumLines(new int[][]{{813873018,904857415},{641554090,640525407},{839888345,346382881},{163370150,664001837},{826654764,837923427},{337385489,725839870},{413854648,222580242},{784197308,111026277},{82207904,67488071},{115700526,862498575},{622982148,541807320},{427819663,807907536},{44930048,607243566},{510618965,915504287},{703393378,689691294},{15128448,815365989},{106729541,785532643},{28042579,146115401},{988860636,828923701},{197805231,809956091},{345303886,681987464},{127210570,867618627},{993936438,254514274},{274642411,298503169},{776923346,738797260},{907292256,654951651},{659586442,937741267},{441492451,716016539},{649134132,165404221},{615379695,285133527}}));
    }

    @Test
    public void test6(){
        MinimumLinesToRepresentALineChart test = new MinimumLinesToRepresentALineChart();
        Assert.assertEquals(28, test.minimumLines(new int[][]{{7,59},{10,62},{22,62},{26,59},{79,92},{94,81},{57,94},{41,81},{68,44},{100,46},{71,85},{39,75},{85,28},{37,43},{75,10},{40,13},{50,82},{45,3},{52,69},{8,91},{91,45},{88,86},{95,93},{14,19},{1,92},{12,35},{16,35},{53,19},{49,14},{6,68}}));
    }
}
