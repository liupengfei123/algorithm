package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1693/B
 */
public class Q1693B {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static int res;

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) out.println(run(sc.nextInt()));

        out.close();
    }

    private static int run(int n) {
        TreeNode[] nodes = new TreeNode[n + 1];

        for (int i = 0; i <= n; i++) nodes[i] = new TreeNode();
        for (int i = 2; i <= n; i++) nodes[sc.nextInt()].child.add(nodes[i]);
        for (int i = 1; i <= n; i++) nodes[i].setVlAndVr(sc.nextInt(), sc.nextInt());

        res = 0;
        dfs(nodes[1]);

        return res;
    }

    private static long dfs(TreeNode node) {
        long sum = 0;
        for (TreeNode child : node.child) {
            sum += dfs(child);
        }

        if (sum < node.vl) {
            res++;
            sum = node.vr;
        } else if (sum > node.vr) {
            sum = node.vr;
        }
        return sum;
    }

    private static class TreeNode {
        long vl, vr;
        List<TreeNode> child = new ArrayList<>();

        public void setVlAndVr(long vl, long vr) {
            this.vl = vl;
            this.vr = vr;
        }
    }
}
