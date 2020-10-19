[toc]

# StdRandom

随机数静态方法库 API

| 方法名（参数）                    | 返回值  | 说明                           |
| --------------------------------- | ------- | ------------------------------ |
| initialize(long seed)             | void    | 初始化                         |
| random()                          | double  | 0-1之间的实数                  |
| uniform()                         | double  | 0-1之间的实数                  |
| uniform(int n)                    | int     | 0-n之间的整数                  |
| uniform(int a, int b)             | int     | a-b之间的整数                  |
| uniform(double a, double b)       | double  | a-b之间的实数                  |
| bernoulli(double p)               | boolean | 返回真的概率为p                |
| gaussian()                        | double  | 正态分布，期望值为0，标准差为1 |
| gaussian(double mu, double sigma) | double  | 正态分布，期望值为m，标准差为s |
| discrete(double[] probabilities)  | int     | 返回i的概率为a[i]              |
| shuffle(double[] a)               | void    | 将数组a随机排序                |

# StdStats

数据分析静态方法库API

| 方法名（参数）     | 返回值 | 说明       |
| ------------------ | ------ | ---------- |
| max(double[] a)    | double | 最大值     |
| min(double[] a)    | double | 最小值     |
| mean(double[] a)   | double | 平均值     |
| var(double[] a)    | double | 采样方差   |
| stddev(double[] a) | double | 采样标准差 |
| median(double[] a) | double | 中位数     |

# StdIn

标准输入流静态方法库API

| 方法名（参数） | 返回值  | 说明                                              |
| -------------- | ------- | ------------------------------------------------- |
| isEmpty()      | boolean | 如果输入流中没有剩余的值则返回true，否则返回false |
| readInt()      | int     | 读取一个 int 类型的值                             |
| readDouble()   | double  | 读取一个 double 类型的值                          |
| readFloat()    | float   | 读取一个 float 类型的值                           |
| readLong()     | long    | 读取一个 long 类型的值                            |
| readBoolean()  | boolean | 读取一个 boolean 类型的值                         |
| readChar()     | char    | 读取一个 char 类型的值                            |
| readByte()     | byte    | 读取一个 byte 类型的值                            |
| readString()   | string  | 读取一个 string 类型的值                          |
| hasNextLine()  | boolean | 输入流中是否还有下一行                            |
| readLine()     | string  | 读取该行的其余内容                                |
| readAll()      | string  | 读取输入流中的其余内容                            |

# StdDraw

标准绘图库API

| 方法名（参数）                                               | 返回值 | 说明                             |
| ------------------------------------------------------------ | ------ | -------------------------------- |
| line(double x0, double y0, double x1, double y1)             | void   | 线                               |
| point(double x, double y)                                    | void   | 点                               |
| text(double x, double y, String text)                        | void   | 文字                             |
| circle(double x, double y, double radius)                    | void   | 圆                               |
| filledCircle(double x, double y, double radius)              | void   | 填充圆                           |
| ellipse(double x, double y, double semiMajorAxis, double semiMinorAxis) | void   | 椭圆                             |
| filledEllipse(double x, double y, double semiMajorAxis, double semiMinorAxis) | void   | 填充椭圆                         |
| square(double x, double y, double halfLength)                | void   | 正方形                           |
| filledSquare(double x, double y, double halfLength)          | void   | 填充正方形                       |
| rectangle(double x, double y, double halfWidth, double halfHeight) | void   | 长方形                           |
| filledRectangle(double x, double y, double halfWidth, double halfHeight) | void   | 填充长方形                       |
| polygon(double[] x, double[] y)                              | void   | 多边形                           |
| filledPolygon(double[] x, double[] y)                        | void   | 填充多边形                       |
| setXscale(double min, double max)                            | void   | 将x的范围设置为x0，x1            |
| setYscale(double min, double max)                            | void   | 将y的范围设置为y0，y1            |
| setPenRadius(double radius)                                  | void   | 将画笔的粗细半径设置为r          |
| setPenColor(Color color)                                     | void   | 设置画笔的颜色                   |
| setFont(Font font)                                           | void   | 设置文本字体                     |
| setCanvasSize(int canvasWidth, int canvasHeight)             | void   | 将画布窗口宽和高分别设置为w 和 h |
| clear(Color color)                                           | void   | 清空画布并用颜色color填充        |
| show(int t)                                                  | void   | 显示所有图像并暂停t毫秒          |

