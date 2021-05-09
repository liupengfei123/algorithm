package lpf.learn.leetcode.game;

import org.junit.Assert;
import org.junit.Test;

public class MaximumPopulationYearTest {
    @Test
    public void test1(){
        MaximumPopulationYear test = new MaximumPopulationYear();
        Assert.assertEquals(1993, test.maximumPopulation(new int[][]{{1993,1999},{2000,2010}}));
    }

    @Test
    public void test2(){
        MaximumPopulationYear test = new MaximumPopulationYear();
        Assert.assertEquals(1960, test.maximumPopulation(new int[][]{{1950,1961},{1960,1971},{1970,1981}}));
    }

    @Test
    public void test3(){
        MaximumPopulationYear test = new MaximumPopulationYear();
        Assert.assertEquals(2011, test.maximumPopulation(new int[][]{{2008,2026},{2004,2008},{2034,2035},{1999,2050},{2049,2050},{2011,2035},{1966,2033},{2044,2049}}));
    }
}
