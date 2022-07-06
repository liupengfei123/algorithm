package lpf.learn.leetcode.tags.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 736 Lisp 语法解析
 * <p>给你一个类似 Lisp 语句的字符串表达式 <code>expression</code>，求出其计算结果。</p>
 * <p>表达式语法如下所示:</p>
 * <ul>
 * 	<li>表达式可以为整数，<strong>let</strong> 表达式，<strong>add</strong> 表达式，<strong>mult</strong> 表达式，或赋值的变量。表达式的结果总是一个整数。</li>
 * 	<li>(整数可以是正整数、负整数、0)</li>
 * 	<li><strong>let</strong> 表达式采用&nbsp;<code>"(let v<sub>1</sub> e<sub>1</sub> v<sub>2</sub> e<sub>2</sub> ... v<sub>n</sub> e<sub>n</sub> expr)"</code> 的形式，其中&nbsp;<code>let</code> 总是以字符串&nbsp;<code>"let"</code>来表示，接下来会跟随一对或多对交替的变量和表达式，也就是说，第一个变量&nbsp;<code>v<sub>1</sub></code>被分配为表达式&nbsp;<code>e<sub>1</sub></code>&nbsp;的值，第二个变量&nbsp;<code>v<sub>2</sub></code>&nbsp;被分配为表达式&nbsp;<code>e<sub>2</sub></code>&nbsp;的值，<strong>依次类推</strong>；最终 <code>let</code> 表达式的值为&nbsp;<code>expr</code>表达式的值。</li>
 * 	<li><strong>add </strong>表达式表示为&nbsp;<code>"(add e<sub>1</sub> e<sub>2</sub>)"</code> ，其中&nbsp;<code>add</code> 总是以字符串&nbsp;<code>"add"</code> 来表示，该表达式总是包含两个表达式 <code>e<sub>1</sub></code>、<code>e<sub>2</sub></code> ，最终结果是&nbsp;<code>e<sub>1</sub></code> 表达式的值与&nbsp;<code>e<sub>2</sub></code>&nbsp;表达式的值之 <strong>和 </strong>。</li>
 * 	<li><strong>mult</strong> 表达式表示为&nbsp;<code>"(mult e<sub>1</sub> e<sub>2</sub>)"</code>&nbsp;，其中&nbsp;<code>mult</code> 总是以字符串 <code>"mult"</code> 表示，该表达式总是包含两个表达式 <code>e<sub>1</sub></code>、<code>e<sub>2</sub></code>，最终结果是&nbsp;<code>e<sub>1</sub></code> 表达式的值与&nbsp;<code>e<sub>2</sub></code>&nbsp;表达式的值之<strong> 积 </strong>。</li>
 * 	<li>在该题目中，变量名以小写字符开始，之后跟随 0 个或多个小写字符或数字。为了方便，<code>"add"</code> ，<code>"let"</code> ，<code>"mult"</code> 会被定义为 "关键字" ，不会用作变量名。</li>
 * 	<li>最后，要说一下作用域的概念。计算变量名所对应的表达式时，在计算上下文中，首先检查最内层作用域（按括号计），然后按顺序依次检查外部作用域。测试用例中每一个表达式都是合法的。有关作用域的更多详细信息，请参阅示例。</li>
 * </ul>
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>expression = "(let x 2 (mult x (let x 3 y 4 (add x y))))"
 * <strong>输出：</strong>14
 * <strong>解释：</strong>
 * 计算表达式 (add x y), 在检查变量 x 值时，
 * 在变量的上下文中由最内层作用域依次向外检查。
 * 首先找到 x = 3, 所以此处的 x 值是 3 。
 * </pre>
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <strong>输入：</strong>expression = "(let x 3 x 2 x)"
 * <strong>输出：</strong>2
 * <strong>解释：</strong>let 语句中的赋值运算按顺序处理即可。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 * <pre>
 * <strong>输入：</strong>expression = "(let x 1 y 2 x (add x y) (add x y))"
 * <strong>输出：</strong>5
 * <strong>解释：</strong>
 * 第一个 (add x y) 计算结果是 3，并且将此值赋给了 x 。
 * 第二个 (add x y) 计算结果是 3 + 2 = 5 。
 * </pre>
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>1 &lt;= expression.length &lt;= 2000</code></li>
 * 	<li><code>exprssion</code> 中不含前导和尾随空格</li>
 * 	<li><code>expressoin</code> 中的不同部分（token）之间用单个空格进行分隔</li>
 * 	<li>答案和所有中间计算结果都符合 <strong>32-bit</strong> 整数范围</li>
 * 	<li>测试用例中的表达式均为合法的且最终结果为整数</li>
 * </ul>
 */
public class ParseLispExpression {
    Map<String, Deque<Integer>> scope = new HashMap<String, Deque<Integer>>();

    public int evaluate(String expression) {
        Deque<Deque<String>> vars = new ArrayDeque<Deque<String>>();
        int start = 0, n = expression.length();
        Deque<Expr> stack = new ArrayDeque<Expr>();
        Expr cur = new Expr(ExprStatus.VALUE);
        while (start < n) {
            if (expression.charAt(start) == ' ') {
                start++; // 去掉空格
                continue;
            }
            if (expression.charAt(start) == '(') {
                start++; // 去掉左括号
                stack.push(cur);
                cur = new Expr(ExprStatus.NONE);
                continue;
            }
            StringBuffer sb = new StringBuffer();
            if (expression.charAt(start) == ')') { // 本质上是把表达式转成一个 token
                start++; // 去掉右括号
                if (cur.status == ExprStatus.LET2) {
                    sb = new StringBuffer(Integer.toString(cur.value));
                    for (String var : vars.peek()) { // 清除作用域
                        scope.get(var).pop();
                    }
                    vars.pop();
                } else if (cur.status == ExprStatus.ADD2) {
                    sb = new StringBuffer(Integer.toString(cur.e1 + cur.e2));
                } else {
                    sb = new StringBuffer(Integer.toString(cur.e1 * cur.e2));
                }
                cur = stack.pop(); // 获取上层状态
            } else {
                while (start < n && expression.charAt(start) != ' ' && expression.charAt(start) != ')') {
                    sb.append(expression.charAt(start));
                    start++;
                }
            }
            String token = sb.toString();
            switch (cur.status.toString()) {
                case "VALUE":
                    cur.value = Integer.parseInt(token);
                    cur.status = ExprStatus.DONE;
                    break;
                case "NONE":
                    if ("let".equals(token)) {
                        cur.status = ExprStatus.LET;
                        vars.push(new ArrayDeque<String>()); // 记录该层作用域的所有变量, 方便后续的清除
                    } else if ("add".equals(token)) {
                        cur.status = ExprStatus.ADD;
                    } else if ("mult".equals(token)) {
                        cur.status = ExprStatus.MULT;
                    }
                    break;
                case "LET":
                    if (expression.charAt(start) == ')') { // let 表达式的最后一个 expr 表达式
                        cur.value = calculateToken(token);
                        cur.status = ExprStatus.LET2;
                    } else {
                        cur.var = token;
                        vars.peek().push(token); // 记录该层作用域的所有变量, 方便后续的清除
                        cur.status = ExprStatus.LET1;
                    }
                    break;
                case "LET1":
                    scope.putIfAbsent(cur.var, new ArrayDeque<Integer>());
                    scope.get(cur.var).push(calculateToken(token));
                    cur.status = ExprStatus.LET;
                    break;
                case "ADD":
                    cur.e1 = calculateToken(token);
                    cur.status = ExprStatus.ADD1;
                    break;
                case "ADD1":
                    cur.e2 = calculateToken(token);
                    cur.status = ExprStatus.ADD2;
                    break;
                case "MULT":
                    cur.e1 = calculateToken(token);
                    cur.status = ExprStatus.MULT1;
                    break;
                case "MULT1":
                    cur.e2 = calculateToken(token);
                    cur.status = ExprStatus.MULT2;
                    break;
            }
        }
        return cur.value;
    }

    public int calculateToken(String token) {
        if (Character.isLowerCase(token.charAt(0))) {
            return scope.get(token).peek();
        } else {
            return Integer.parseInt(token);
        }
    }
}

enum ExprStatus {
    VALUE,     // 初始状态
    NONE,      // 表达式类型未知
    LET,       // let 表达式
    LET1,      // let 表达式已经解析了 vi 变量
    LET2,      // let 表达式已经解析了最后一个表达式 expr
    ADD,       // add 表达式
    ADD1,      // add 表达式已经解析了 e1 表达式
    ADD2,      // add 表达式已经解析了 e2 表达式
    MULT,      // mult 表达式
    MULT1,     // mult 表达式已经解析了 e1 表达式
    MULT2,     // mult 表达式已经解析了 e2 表达式
    DONE       // 解析完成
}

class Expr {
    ExprStatus status;
    String var; // let 的变量 vi
    int value; // VALUE 状态的数值，或者 LET2 状态最后一个表达式的数值
    int e1, e2; // add 或 mult 表达式的两个表达式 e1 和 e2 的数值

    public Expr(ExprStatus s) {
        status = s;
    }
}
