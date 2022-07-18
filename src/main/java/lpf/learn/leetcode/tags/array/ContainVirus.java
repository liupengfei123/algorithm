package lpf.learn.leetcode.tags.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/** 749 隔离病毒
 *<p>病毒扩散得很快，现在你的任务是尽可能地通过安装防火墙来隔离病毒。</p>
 * <p>假设世界由&nbsp;<code>m x n</code>&nbsp;的二维矩阵&nbsp;<code>isInfected</code>&nbsp;组成，&nbsp;<code>isInfected[i][j] == 0</code>&nbsp;表示该区域未感染病毒，而 &nbsp;<code>isInfected[i][j] == 1</code>&nbsp;表示该区域已感染病毒。可以在任意 2 个相邻单元之间的共享边界上安装一个防火墙（并且只有一个防火墙）。</p>
 * <p>每天晚上，病毒会从被感染区域向相邻未感染区域扩散，除非被防火墙隔离。现由于资源有限，每天你只能安装一系列防火墙来隔离其中一个被病毒感染的区域（一个区域或连续的一片区域），且该感染区域对未感染区域的威胁最大且 <strong>保证唯一&nbsp;</strong>。</p>
 * <p>你需要努力使得最后有部分区域不被病毒感染，如果可以成功，那么返回需要使用的防火墙个数; 如果无法实现，则返回在世界被病毒全部感染时已安装的防火墙个数。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <p><img src="https://assets.leetcode.com/uploads/2021/06/01/virus11-grid.jpg" style="height: 255px; width: 500px;" /></p>
 * <pre>
 * <strong>输入:</strong> isInfected = [[0,1,0,0,0,0,0,1],[0,1,0,0,0,0,0,1],[0,0,0,0,0,0,0,1],[0,0,0,0,0,0,0,0]]
 * <strong>输出:</strong> 10
 * <strong>解释:</strong>一共有两块被病毒感染的区域。
 * 在第一天，添加 5 墙隔离病毒区域的左侧。病毒传播后的状态是:
 * <img src="653" />
 * 第二天，在右侧添加 5 个墙来隔离病毒区域。此时病毒已经被完全控制住了。
 * <img src="https://assets.leetcode.com/uploads/2021/06/01/virus13edited-grid.jpg" style="height: 261px; width: 500px;" />
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <p><img src="https://assets.leetcode.com/uploads/2021/06/01/virus2-grid.jpg" style="height: 253px; width: 653px;" /></p>
 * <pre>
 * <strong>输入:</strong> isInfected = [[1,1,1],[1,0,1],[1,1,1]]
 * <strong>输出:</strong> 4
 * <strong>解释:</strong> 虽然只保存了一个小区域，但却有四面墙。
 * 注意，防火墙只建立在两个不同区域的共享边界上。
 * </pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 * <pre>
 * <strong>输入:</strong> isInfected = [[1,1,1,0,0,0,0,0,0],[1,0,1,0,1,1,1,1,1],[1,1,1,0,0,0,0,0,0]]
 * <strong>输出:</strong> 13
 * <strong>解释:</strong> 在隔离右边感染区域后，隔离左边病毒区域只需要 2 个防火墙。
 * </pre>
 *
 * <p><strong>提示:</strong></p>
 * <ul>
 * 	<li><code>m ==&nbsp;isInfected.length</code></li>
 * 	<li><code>n ==&nbsp;isInfected[i].length</code></li>
 * 	<li><code>1 &lt;= m, n &lt;= 50</code></li>
 * 	<li><code>isInfected[i][j]</code>&nbsp;is either&nbsp;<code>0</code>&nbsp;or&nbsp;<code>1</code></li>
 * 	<li>在整个描述的过程中，总有一个相邻的病毒区域，它将在下一轮 <strong>严格地感染更多未受污染的方块</strong>&nbsp;</li>
 * </ul>
 */
public class ContainVirus {
    private int[][] isInfected;
    private int m;
    private int n;

    private int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private Set<Integer> used = new HashSet<>();



    public int containVirus(int[][] isInfected) {
        this.m = isInfected.length;
        this.n = isInfected[0].length;
        this.isInfected = isInfected;

        int result = 0;
        while (true) {
            int value = help();
            if (value == 0) {
                break;
            }
            result += value;
        }
        return result;
    }

    private int help() {
        List<Area> list = new ArrayList<>();
        used.clear();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isInfected[i][j] == 0 || isInfected[i][j] == 2) {
                    continue;
                }
                int index = i * n + j;
                if (used.contains(index)) {
                    continue;
                }
                list.add(getArea(index));
            }
        }

        int maxNeighbors = -1;
        Area maxArea = null;

        for (Area area : list) {
            if (maxNeighbors < area.neighbors.size()) {
                maxArea = area;
                maxNeighbors = area.neighbors.size();
            }
        }

        if (maxArea == null) {
            return 0;
        }

        for (Area area : list) {
            if (area != maxArea) {
                for (Integer neighbor : area.neighbors.keySet()) {
                    int x = neighbor / n;
                    int y = neighbor % n;
                    isInfected[x][y] = 1;
                }
            }
        }

        int result = 0;
        for (Integer virus : maxArea.virus) {
            int x = virus / n;
            int y = virus % n;
            isInfected[x][y] = 2;
        }
        for (Integer value : maxArea.neighbors.values()) {
            result += value;
        }

        return result;
    }

    private Area getArea(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);

        Area area = new Area();

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            int x = poll / n;
            int y = poll % n;
            if (used.contains(poll)) {
                continue;
            }

            if (isInfected[x][y] == 2) continue;

            if (isInfected[x][y] == 0) {
                area.neighbors.merge(poll, 1, Integer::sum);
                continue;
            }

            used.add(poll);
            area.virus.add(poll);

            for (int[] dir : dirs) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                    continue;
                }
                int newIndex = nx * n + ny;
                queue.offer(newIndex);
            }
        }
        return area;
    }


    private static class Area {
        Set<Integer> virus = new HashSet<>();
        Map<Integer, Integer> neighbors = new HashMap<>();
    }
}
