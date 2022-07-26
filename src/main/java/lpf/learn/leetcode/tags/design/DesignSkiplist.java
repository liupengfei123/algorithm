package lpf.learn.leetcode.tags.design;

import java.util.Random;

/**
 * 1206 设计跳表
 * <p>不使用任何库函数，设计一个 <strong>跳表</strong> 。</p>
 *
 * <p><strong>跳表</strong> 是在 <code>O(log(n))</code> 时间内完成增加、删除、搜索操作的数据结构。跳表相比于树堆与红黑树，其功能与性能相当，并且跳表的代码长度相较下更短，其设计思想与链表相似。</p>
 *
 * <p>例如，一个跳表包含 <code>[30, 40, 50, 60, 70, 90]</code> ，然后增加 <code>80</code>、<code>45</code> 到跳表中，以下图的方式操作：</p>
 *
 * <p><img alt="" src="https://assets.leetcode.com/uploads/2019/09/27/1506_skiplist.gif" /><br />
 * <small>Artyom Kalinin [CC BY-SA 3.0], via <a href="https://commons.wikimedia.org/wiki/File:Skip_list_add_element-en.gif" target="_blank" title="Artyom Kalinin [CC BY-SA 3.0 (https://creativecommons.org/licenses/by-sa/3.0)], via Wikimedia Commons">Wikimedia Commons</a></small></p>
 *
 * <p>跳表中有很多层，每一层是一个短的链表。在第一层的作用下，增加、删除和搜索操作的时间复杂度不超过 <code>O(n)</code>。跳表的每一个操作的平均时间复杂度是 <code>O(log(n))</code>，空间复杂度是 <code>O(n)</code>。</p>
 *
 * <p>了解更多 :&nbsp;<a href="https://en.wikipedia.org/wiki/Skip_list" target="_blank">https://en.wikipedia.org/wiki/Skip_list</a></p>
 *
 * <p>在本题中，你的设计应该要包含这些函数：</p>
 *
 * <ul>
 * 	<li><code>bool search(int target)</code> : 返回target是否存在于跳表中。</li>
 * 	<li><code>void add(int num)</code>:&nbsp;插入一个元素到跳表。</li>
 * 	<li><code>bool erase(int num)</code>: 在跳表中删除一个值，如果&nbsp;<code>num</code>&nbsp;不存在，直接返回false. 如果存在多个&nbsp;<code>num</code>&nbsp;，删除其中任意一个即可。</li>
 * </ul>
 *
 * <p>注意，跳表中可能存在多个相同的值，你的代码需要处理这种情况。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <b>输入</b>
 * ["Skiplist", "add", "add", "add", "search", "add", "search", "erase", "erase", "search"]
 * [[], [1], [2], [3], [0], [4], [1], [0], [1], [1]]
 * <strong>输出</strong>
 * [null, null, null, null, false, null, true, false, true, false]
 *
 * <strong>解释</strong>
 * Skiplist skiplist = new Skiplist();
 * skiplist.add(1);
 * skiplist.add(2);
 * skiplist.add(3);
 * skiplist.search(0);   // 返回 false
 * skiplist.add(4);
 * skiplist.search(1);   // 返回 true
 * skiplist.erase(0);    // 返回 false，0 不在跳表中
 * skiplist.erase(1);    // 返回 true
 * skiplist.search(1);   // 返回 false，1 已被擦除
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ul>
 * 	<li><code>0 &lt;= num, target &lt;= 2 * 10<sup>4</sup></code></li>
 * 	<li>调用<code>search</code>, <code>add</code>, &nbsp;<code>erase</code>操作次数不大于&nbsp;<code>5 * 10<sup>4</sup></code>&nbsp;</li>
 * </ul>
 */
public class DesignSkiplist {
    static final int MAX_LEVEL = 15;
    static final double P_FACTOR = 0.25;

    private final static int HeadValue = -1;
    private final static int TailValue = 1000000;

    private final Random random;
    private final Node[][] levels;

    public DesignSkiplist() {
        random = new Random();

        levels = new Node[MAX_LEVEL][2];
        for (int i = 0; i < levels.length; i++) {
            levels[i][0] = new Node(HeadValue);
            levels[i][1] = new Node(TailValue);
            levels[i][0].next = levels[i][1];
            levels[i][1].prev = levels[i][0];

            if (i > 0) {
                levels[i][0].nextLevel = levels[i - 1][0];
                levels[i][1].nextLevel = levels[i - 1][1];
            }
        }
    }

    public boolean search(int target) {
        Node node = searchNode(target);
        return node.value == target;
    }

    public void add(int num) {
        Node node = searchNode(num);
        while (node.nextLevel != null) {
            node = node.nextLevel;
        }
        Node newNode = new Node(num);

        newNode.next = node.next;
        node.next.prev = newNode;

        newNode.prev = node;
        node.next = newNode;

        buildIndex(newNode);
    }

    public boolean erase(int num) {
        Node node = searchNode(num);
        if (node.value != num) {
            return false;
        }
        for (; node.nextLevel != null; node = node.nextLevel) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return true;
    }

    private Node searchNode(int target) {
        Node node = levels[levels.length - 1][0];

        for (int i = levels.length; i > 0; i--) {
            while (node.next.value < target) {
                node = node.next;
            }
            if (node.next.value == target) {
                return node.next;
            }
            node = node.nextLevel == null ? node : node.nextLevel;
        }
        return node;
    }

    private void buildIndex(Node node) {
        for (int i = 1; i <= randomLevel(); i++) {
            Node temp = new Node(node.value);
            Node next = levels[i][1];
            while (next.prev.value > node.value) {
                next = next.prev;
            }
            temp.prev = next.prev;
            next.prev.next = temp;

            temp.next = levels[i][1];
            levels[i][1].prev = temp;

            temp.nextLevel = node;
            node = temp;
        }
    }

    private int randomLevel() {
        int lv = 0; /* 随机生成 lv */
        while (random.nextDouble() < P_FACTOR && lv < MAX_LEVEL - 1) {
            lv++;
        }
        return lv;
    }


    private static class Node {
        private final int value;
        private Node next;
        private Node prev;
        private Node nextLevel;

        public Node(int value) {
            this.value = value;
        }
    }
}
