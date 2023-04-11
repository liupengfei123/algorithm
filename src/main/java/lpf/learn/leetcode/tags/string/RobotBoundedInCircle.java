package lpf.learn.leetcode.tags.string;


/** 1041 困于环中的机器人
 <p>在无限的平面上，机器人最初位于&nbsp;<code>(0, 0)</code>&nbsp;处，面朝北方。注意:</p>
 <ul>
 <li><strong>北方向</strong> 是y轴的正方向。</li>
 <li><strong>南方向</strong> 是y轴的负方向。</li>
 <li><strong>东方向</strong> 是x轴的正方向。</li>
 <li><strong>西方向</strong> 是x轴的负方向。</li>
 </ul>
 <p>机器人可以接受下列三条指令之一：</p>
 <ul>
 <li><code>"G"</code>：直走 1 个单位</li>
 <li><code>"L"</code>：左转 90 度</li>
 <li><code>"R"</code>：右转 90 度</li>
 </ul>
 <p>机器人按顺序执行指令&nbsp;<code>instructions</code>，并一直重复它们。</p>
 <p>只有在平面中存在环使得机器人永远无法离开时，返回&nbsp;<code>true</code>。否则，返回 <code>false</code>。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>instructions = "GGLLGG"
 <strong>输出：</strong>true
 <strong>解释：</strong>机器人最初在(0,0)处，面向北方。
 “G”:移动一步。位置:(0,1)方向:北。
 “G”:移动一步。位置:(0,2).方向:北。
 “L”:逆时针旋转90度。位置:(0,2).方向:西。
 “L”:逆时针旋转90度。位置:(0,2)方向:南。
 “G”:移动一步。位置:(0,1)方向:南。
 “G”:移动一步。位置:(0,0)方向:南。
 重复指令，机器人进入循环:(0,0)——&gt;(0,1)——&gt;(0,2)——&gt;(0,1)——&gt;(0,0)。
 在此基础上，我们返回true。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>instructions = "GG"
 <strong>输出：</strong>false
 <strong>解释：</strong>机器人最初在(0,0)处，面向北方。
 “G”:移动一步。位置:(0,1)方向:北。
 “G”:移动一步。位置:(0,2).方向:北。
 重复这些指示，继续朝北前进，不会进入循环。
 在此基础上，返回false。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>instructions = "GL"
 <strong>输出：</strong>true
 <strong>解释：</strong>机器人最初在(0,0)处，面向北方。
 “G”:移动一步。位置:(0,1)方向:北。
 “L”:逆时针旋转90度。位置:(0,1).方向:西。
 “G”:移动一步。位置:(- 1,1)方向:西。
 “L”:逆时针旋转90度。位置:(- 1,1)方向:南。
 “G”:移动一步。位置:(- 1,0)方向:南。
 “L”:逆时针旋转90度。位置:(- 1,0)方向:东方。
 “G”:移动一步。位置:(0,0)方向:东方。
 “L”:逆时针旋转90度。位置:(0,0)方向:北。
 重复指令，机器人进入循环:(0,0)——&gt;(0,1)——&gt;(- 1,1)——&gt;(- 1,0)——&gt;(0,0)。
 在此基础上，我们返回true。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= instructions.length &lt;= 100</code></li>
 <li><code>instructions[i]</code>&nbsp;仅包含&nbsp;<code>'G', 'L', 'R'</code></li>
 </ul>
 */
public class RobotBoundedInCircle {

    public boolean isRobotBounded(String instructions) {
        // 0东 1南 2西 3北
        int[][] dicts = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
        char[] chars = instructions.toCharArray();
        int dictIndex = 3;
        int x = 0, y = 0;
        for (char c : chars) {
            if (c == 'G') {
                x += dicts[dictIndex][0];
                y += dicts[dictIndex][1];
            } else if (c == 'L') {
                dictIndex = (dictIndex + 3) % 4;
            } else {
                dictIndex = (dictIndex + 1) % 4;
            }
        }
        return (x == 0 && y == 0) || dictIndex != 3;
    }

}
