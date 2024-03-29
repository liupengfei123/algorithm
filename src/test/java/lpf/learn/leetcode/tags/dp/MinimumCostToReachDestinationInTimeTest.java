package lpf.learn.leetcode.tags.dp;

import org.junit.Assert;
import org.junit.Test;

public class MinimumCostToReachDestinationInTimeTest {
    @Test
    public void test1(){
        MinimumCostToReachDestinationInTime test = new MinimumCostToReachDestinationInTime();
        Assert.assertEquals(11, test.minCost(30,
                new int[][]{{0,1,10},{1,2,10},{2,5,10},{0,3,1},{3,4,10},{4,5,15}},
                new int[]{5,1,2,20,20,3}));
    }

    @Test
    public void test2(){
        MinimumCostToReachDestinationInTime test = new MinimumCostToReachDestinationInTime();
        Assert.assertEquals(48, test.minCost(29,
                new int[][]{{0,1,10},{1,2,10},{2,5,10},{0,3,1},{3,4,10},{4,5,15}},
                new int[]{5,1,2,20,20,3}));
    }

    @Test
    public void test3(){
        MinimumCostToReachDestinationInTime test = new MinimumCostToReachDestinationInTime();
        Assert.assertEquals(-1, test.minCost(25,
                new int[][]{{0,1,10},{1,2,10},{2,5,10},{0,3,1},{3,4,10},{4,5,15}},
                new int[]{5,1,2,20,20,3}));
    }

    @Test
    public void test4(){
        MinimumCostToReachDestinationInTime test = new MinimumCostToReachDestinationInTime();
        Assert.assertEquals(336, test.minCost(500,
                new int[][]{{9,7,18},{26,3,12},{28,45,33},{47,10,27},{34,18,38},{32,13,39},{32,26,32},{12,0,2},{4,1,7},{5,3,2},{39,25,27},{45,10,34},{3,19,5},{25,32,23},{30,10,47},{37,2,31},{10,32,15},{23,14,19},{22,6,14},{45,39,38},{39,21,30},{42,17,42},{20,17,15},{24,0,27},{2,46,11},{2,24,13},{36,22,30},{2,1,31},{41,35,45},{4,19,20},{32,27,33},{38,46,1},{21,11,15},{33,41,2},{45,18,30},{8,33,50},{37,11,6},{25,17,42},{45,39,33},{7,4,49},{17,42,36},{36,16,9},{46,25,24},{43,4,6},{35,13,28},{1,28,1},{34,35,15},{38,1,15},{16,6,28},{13,0,42},{3,30,24},{43,27,35},{8,0,45},{27,20,47},{6,16,47},{0,34,35},{0,35,3},{40,11,24},{1,0,49},{44,20,32},{26,12,17},{3,2,25},{37,25,42},{27,1,15},{36,25,38},{24,47,33},{33,28,15},{25,43,37},{47,31,47},{29,10,50},{11,1,21},{29,3,48},{1,25,10},{48,17,16},{19,24,22},{30,7,2},{11,22,19},{20,42,41},{27,3,48},{17,0,34},{19,14,32},{49,2,20},{10,3,38},{0,49,13},{6,3,28},{42,23,6},{14,8,1},{35,16,3},{17,7,40},{18,7,49},{36,35,13},{14,40,45},{16,33,11},{31,22,33},{38,15,48},{15,14,25},{37,13,37},{44,32,7},{48,1,31},{33,12,20},{22,26,23},{4,10,11},{43,28,43},{19,8,14},{35,31,33},{28,27,19},{40,11,36},{36,43,28},{22,21,15}},
                new int[]{199,505,107,961,682,400,304,517,512,18,334,627,893,412,922,289,19,161,206,879,336,831,577,802,139,348,440,219,273,691,99,858,389,955,561,353,937,904,858,704,548,497,787,546,241,67,743,42,87,137}));
    }

    @Test
    public void test5(){
        MinimumCostToReachDestinationInTime test = new MinimumCostToReachDestinationInTime();
        Assert.assertEquals(862, test.minCost(500,
                new int[][]{{36,1,2},{8,41,29},{47,7,50},{33,17,6},{47,37,28},{3,38,2},{27,2,4},{11,30,17},{32,35,48},{12,1,32},{7,27,6},{7,4,25},{15,8,11},{2,17,50},{7,45,14},{40,8,48},{4,22,5},{28,23,20},{20,27,49},{26,34,13},{17,47,40},{47,4,32},{0,30,21},{30,29,8},{15,3,38},{4,3,39},{22,16,46},{47,10,13},{42,23,30},{34,0,13},{12,25,11},{5,2,1},{7,36,48},{44,11,7},{20,47,9},{42,37,49},{42,4,46},{1,39,26},{14,5,25},{32,17,16},{22,7,25},{3,22,36},{49,8,46},{16,20,6},{16,21,32},{26,43,35},{43,19,7},{0,2,35},{35,37,25},{25,48,46},{9,4,28},{24,5,21},{37,30,7},{14,16,40},{25,35,26},{49,38,1},{24,13,36},{27,6,8},{10,3,37},{23,13,26},{31,21,19},{28,1,48},{15,21,18},{17,7,40},{33,12,24},{44,28,11},{46,43,37},{1,26,47},{3,46,17},{28,22,20},{8,34,3},{18,6,2},{38,16,30},{17,38,20},{12,10,26},{21,40,18},{19,2,25},{31,28,25},{41,8,5},{9,3,14},{5,0,8},{3,36,25},{32,23,37},{2,1,11},{49,25,18},{33,24,48},{42,28,25},{4,40,47},{37,11,23},{37,46,45},{9,42,35},{34,1,19},{17,2,17},{15,17,13},{33,20,1},{40,34,13},{25,21,40},{40,9,41},{47,15,41},{3,10,20},{33,35,47},{22,8,37},{35,40,34},{29,38,34},{37,15,17},{28,39,43},{24,37,28},{16,24,8},{37,46,10},{4,44,34},{41,17,20},{25,40,45},{15,18,30},{48,25,16},{16,11,7},{16,1,34},{19,44,11},{37,7,14},{11,49,5},{29,32,3},{17,32,7},{39,18,10},{25,14,9},{1,0,36},{7,28,46},{48,13,44},{46,31,27},{11,0,32},{30,32,24},{27,15,33},{20,19,43},{16,8,6},{28,21,43},{13,33,14},{3,2,45},{20,6,27},{35,17,23},{38,46,48},{46,48,5},{45,43,20},{49,24,14},{45,34,28},{10,32,46},{10,37,29},{39,21,46},{34,25,22},{6,11,3},{0,34,19},{6,20,3},{33,0,44},{4,6,15},{35,13,22},{29,41,20},{6,4,33},{45,15,43},{33,46,40},{45,34,23},{19,27,33},{19,2,9},{21,2,29},{14,25,15},{37,44,34},{16,41,41},{18,3,18},{46,32,13},{43,48,47},{28,13,39},{26,47,46},{13,28,46},{26,19,32},{13,11,41},{17,43,13},{39,47,15},{48,13,37},{29,17,27},{35,33,29},{24,37,19},{43,22,49},{40,5,33},{23,24,34},{38,13,12},{8,2,10},{43,16,44},{2,31,46},{48,10,15},{16,31,11},{3,33,9},{33,10,9},{41,18,41},{41,47,46},{10,44,6},{27,38,45},{42,28,2},{19,9,30},{21,32,26},{48,41,10},{28,42,9},{31,7,42},{0,17,41},{1,0,25},{25,20,32}},
                new int[]{45,308,835,819,667,547,322,428,306,327,362,280,334,767,767,533,514,9,539,125,153,325,937,745,334,804,336,587,71,463,287,492,466,935,373,950,760,994,390,836,911,948,81,945,593,821,58,138,50,537}));
    }
}
