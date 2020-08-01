package lpf.learn.leetcode.entity;

import java.util.ArrayList;
import java.util.List;

public class NodeQueue {
    public int val;
    public List<NodeQueue> neighbors;

    public NodeQueue() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public NodeQueue(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }

    public NodeQueue(int _val, ArrayList<NodeQueue> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
