package lpf.learn.leetcode.learn.queue_stack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/** [200]岛屿数量
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 * 示例 1:
 * 输入:
 * 11110
 * 11010
 * 11000
 * 00000
 * 输出: 1
 *
 * 示例 2:
 * 输入:
 * 11000
 * 11000
 * 00100
 * 00011
 * 输出: 3
 * 解释: 每座岛屿只能由水平和/或竖直方向上相邻的陆地连接而成。
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        Set<Point> used = new HashSet<>();
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                Point temp = new Point(i, j);
                if (used.contains(temp)) {
                    continue;
                }
                if ('1' == grid[temp.x][temp.y]) {
                    result = lands(used, temp, grid) ? result + 1 : result;
                } else {
                    sea(used, temp, grid);
                }
            }
        }
        return result;
    }

    //计算一整片的陆地
    private boolean lands(Set<Point> used, Point point, char[][] grid) {
        Queue<Point> queue = new LinkedList<>();
        Set<Point> usedThis = new HashSet<>();
        queue.add(point);
        while (!queue.isEmpty()) {
            Point temp = queue.poll();
            if ('1' == grid[temp.x][temp.y] && !usedThis.contains(temp)) {
                //只要有一个被使用过 就是已经被探测过了
                if (used.contains(temp)) {
                    return false;
                } else {
                    addQueue(temp, queue, grid.length, grid[temp.x].length);
                }
                usedThis.add(temp);
            }
        }
        used.addAll(usedThis);
        return true;
    }

    private void sea(Set<Point> used, Point point, char[][] grid) {
        Queue<Point> queue = new LinkedList<>();
        Set<Point> usedThis = new HashSet<>();
        queue.add(point);
        while (!queue.isEmpty()) {
            Point temp = queue.poll();
            if ('0' == grid[temp.x][temp.y] && !usedThis.contains(temp)) {
                //只要有一个被使用过 就是已经被探测过了
                if (used.contains(temp)) {
                    return;
                } else {
                    addQueue(temp, queue, grid.length, grid[temp.x].length);
                }
                usedThis.add(temp);
            }
        }
        used.addAll(usedThis);
        return;
    }


    private void addQueue(Point point, Queue<Point> queue, int limitX, int limitY) {
        int x = point.x;
        int y = point.y;

        if (x == 0 && x == limitX - 1) {
        } else if (x == 0) {
            queue.add(new Point(x + 1, y));
        } else if (x == limitX - 1) {
            queue.add(new Point(x - 1, y));
        } else {
            queue.add(new Point(x - 1, y));
            queue.add(new Point(x + 1, y));
        }

        if (y == 0 && y == limitY - 1) {
        } else if (y == 0) {
            queue.add(new Point(x, y + 1));
        } else if (y == limitY - 1) {
            queue.add(new Point(x, y - 1));
        } else {
            queue.add(new Point(x, y - 1));
            queue.add(new Point(x, y + 1));
        }
    }


    static class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
