package lpf.learn.leetcode.entity;

import java.util.Objects;

public class ListNode3 {
    public int val;
    public ListNode3 next;
    public ListNode3 random;

    public ListNode3() {
    }

    public ListNode3(int val) {
        this.val = val;
    }

    public ListNode3(int val, ListNode3 next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode3 listNode3 = (ListNode3) o;
        return val == listNode3.val &&
                next.equals(listNode3.next) &&
                random.equals(listNode3.random);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next, random);
    }
}
