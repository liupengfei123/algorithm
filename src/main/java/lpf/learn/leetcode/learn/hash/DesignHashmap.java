package lpf.learn.leetcode.learn.hash;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/** [817]设计哈希映射
 *  不使用任何内建的哈希表库设计一个哈希映射
 *  具体地说，你的设计应该包含以下的功能
 *
 *  put(key, value)：向哈希映射中插入(键,值)的数值对。如果键对应的值已经存在，更新这个值。
 *  get(key)：返回给定的键所对应的值，如果映射中不包含这个键，返回-1。
 *  remove(key)：如果映射中存在这个键，删除这个数值对。
 *
 * 示例：
 * MyHashMap hashMap = new MyHashMap();
 * hashMap.put(1, 1);          
 * hashMap.put(2, 2);        
 * hashMap.get(1);            // 返回 1
 * hashMap.get(3);            // 返回 -1 (未找到)
 * hashMap.put(2, 1);         // 更新已有的值
 * hashMap.get(2);            // 返回 1
 * hashMap.remove(2);         // 删除键为2的数据
 * hashMap.get(2);            // 返回 -1 (未找到)
 *
 * 注意：
 *  所有的值都在 [0, 1000000]的范围内。
 *  操作的总数目在[1, 10000]范围内。
 *  不要使用内建的哈希库。
 *
 * @author liupf
 * @date 2020-08-15 14:44
 */
public class DesignHashmap {

    private Bucket[] bucketArray;
    private int keyRange;

    /** Initialize your data structure here. */
    public DesignHashmap() {
        this.keyRange = 769;
        this.bucketArray = new Bucket[this.keyRange];
        for (int i = 0; i < this.keyRange; i++) {
            this.bucketArray[i] = new Bucket();
        }
    }


    /** value will always be non-negative. */
    public void put(int key, int value) {
        Bucket bucket = bucketArray[_hash(key)];
        Node node = new Node(key, value);
        bucket.put(node);
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        Bucket bucket = bucketArray[_hash(key)];
        return bucket.get(key);
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        Bucket bucket = bucketArray[_hash(key)];
        bucket.remove(key);
    }

    private int _hash(int key) {
        return key % keyRange;
    }

    class Bucket {
        private List<Node> container = new LinkedList<>();

        public void put(Node node) {
            Iterator<Node> iterator = container.iterator();
            boolean found = false;
            while (iterator.hasNext()) {
                Node next = iterator.next();
                if (next.key == node.key) {
                    next.key = node.value;
                    found = true;
                    break;
                }
            }
            if (!found) {
                container.add(node);
            }
        }

        public int get(int key) {
            int result = -1;
            for (Node next : container) {
                if (next.key == key) {
                    result = next.value;
                    break;
                }
            }
            return result;
        }

        public void remove(int key) {
            Iterator<Node> iterator = container.iterator();
            while (iterator.hasNext()) {
                Node next = iterator.next();
                if (next.key == key) {
                    iterator.remove();
                    break;
                }
            }
        }
    }

    class Node {
        int key;
        int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
