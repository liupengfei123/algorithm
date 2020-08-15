package lpf.learn.leetcode.learn.hash;

import java.util.ArrayList;
import java.util.List;

/** [816]设计哈希集合
 *
 *  不使用任何内建的哈希表库设计一个哈希集合
 *  具体地说，你的设计应该包含以下的功能
 *
 *  add(value)：向哈希集合中插入一个值。
 *  contains(value) ：返回哈希集合中是否存在这个值。
 *  remove(value)：将给定值从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。
 *
 * 示例:
 *  MyHashSet hashSet = new MyHashSet();
 * hashSet.add(1);        
 * hashSet.add(2);        
 * hashSet.contains(1);    // 返回 true
 * hashSet.contains(3);    // 返回 false (未找到)
 * hashSet.add(2);          
 * hashSet.contains(2);    // 返回 true
 * hashSet.remove(2);          
 * hashSet.contains(2);    // 返回  false (已经被删除)
 *
 * 注意：
 *  所有的值都在 [0, 1000000]的范围内。
 *  操作的总数目在[1, 10000]范围内。
 *  不要使用内建的哈希集合库。
 *
 * @author liupf
 * @date 2020-08-15 14:24
 */
public class DesignHashset {
    private List<Integer>[] arr;
    private int capacity = 10000;
    /** Initialize your data structure here. */
    public DesignHashset() {
        arr = new ArrayList[capacity];
    }

    public void add(int key) {
        int hash = hash(key);
        List<Integer> list = arr[hash];
        if (list == null) {
            list = new ArrayList<>();
            arr[hash] = list;
        }
        if (!contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        int hash = hash(key);
        List<Integer> list = arr[hash];
        if (list != null) {
            list.remove(Integer.valueOf(key));
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hash = hash(key);
        List<Integer> list = arr[hash];
        if (list != null) {
            return list.contains(key);
        }
        return false;
    }

    private int hash(int key) {
        return key % capacity;
    }

}
