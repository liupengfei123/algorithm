package lpf.learn.leetcode.tags.binarysearch;

/** 275 H 指数 II
 <p>给你一个整数数组 <code>citations</code> ，其中 <code>citations[i]</code> 表示研究者的第 <code>i</code> 篇论文被引用的次数，<code>citations</code> 已经按照&nbsp;<strong>升序排列&nbsp;</strong>。计算并返回该研究者的 h<strong><em>&nbsp;</em></strong>指数。</p>
 <p><a href="https://baike.baidu.com/item/h-index/3991452?fr=aladdin" target="_blank">h 指数的定义</a>：h 代表“高引用次数”（high citations），一名科研人员的 <code>h</code> 指数是指他（她）的 （<code>n</code> 篇论文中）<strong>总共</strong>有 <code>h</code> 篇论文分别被引用了<strong>至少</strong> <code>h</code> 次。</p>
 <p>请你设计并实现对数时间复杂度的算法解决此问题。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <strong>输入：</strong><code>citations = [0,1,3,5,6]</code>
 <strong>输出：</strong><code>3</code>
 <strong>解释：</strong>给定数组表示研究者总共有 <code>5</code> 篇论文，每篇论文相应的被引用了 <code>0, 1, 3, 5, 6</code> 次。
 &nbsp;    由于研究者有<code>3</code>篇论文每篇<strong> 至少 </strong>被引用了 <code>3</code> 次，其余两篇论文每篇被引用<strong> 不多于</strong> <code>3</code> 次，所以她的<em> h </em>指数是 <code>3</code> 。</pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong><code>citations = [1,2,100]</code>
 <strong>输出：</strong><code>2</code>
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == citations.length</code></li>
 <li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
 <li><code>0 &lt;= citations[i] &lt;= 1000</code></li>
 <li><code>citations</code> 按 <strong>升序排列</strong></li>
 </ul>
 */
public class HIndexIi {
    public int hIndex(int[] citations) {
        int n = citations.length, l = 0, r = n - 1;
        if (citations[r] == 0) return 0;

        while (l < r) {
            int mid = (l + r) / 2;
            if (citations[mid] >= n - mid) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return n - r;
    }
}
