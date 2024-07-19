package chapter4;
    /*
    | 运算符 | 运算       | 范例       | 结果   |
    |--------|------------|------------|--------|
    | +      | 正号       | +7         | 7      |
    | -      | 负号       | b=11; -b   | -11    |
    | +      | 加法       | 9+9        | 18     |
    | -      | 减法       | 10-8       | 2      |
    | *      | 乘法       | 7*8        | 56     |
    | /      | 除法       | 9/9        | 1      |
    | %      | 取模(取余) | 11%9       | 2      |
    | ++     | 自增（前） | a=2; b=++a | a=3; b=3 |
    | --     | 自减（前） | a=2; b=--a | a=1; b=1 |
    | ++     | 自增（后） | a=2; b=a++ | a=3; b=2 |
    | --     | 自减（后） | a=2; b=a-- | a=1; b=2 |
    | +      | 字符串相加 | "hsp"+"edu" | "hsp edu" |
     */
public class ArithmeticOperator
    {

        public static void main(String[] args)
        {
            // 使用
            System.out.println(10 / 4); // 从数学来看是2.5，java中是2
            System.out.println(10.0 / 4); // java中是2.5
            // 注释快捷键 ctrl + /，再次输入 ctrl + / 取消注释
            double d = 10 / 4; // java中10/4=2，2=>2.0 在这个过程中，Java执行了一个从整数到浮点数的类型转换，这个转换称为“拓宽原始转换”（widening primitive conversion）
            System.out.println(d); // 输出是2.0
            // % 取模，取余
            // 在 % 的本质 看一个公式!!! a % b = a - a / b * b
            // -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
            // 10 % -3 => 10 - 10 / (-3) * (-3) = 10 - 9 = 1
            // -10 % -3 => (-10) - (-10) / (-3) * (-3) = -10 + 9 = -1
            System.out.println(10 % 3); //1
            System.out.println(-10 % 3);//-1
            System.out.println(10 % -3);//1
            System.out.println(-10 % -3);//-1
            //++的使用
            int i = 10;
            i++;//自增 等价于 i = i + 1; => i = 11
            ++i;//自增 等价于 i = i + 1; => i = 12
            System.out.println("i=" + i);//12
            /*
            作为表达式使用
            前++:++i先自增后赋值
            后++:i++先赋值后自增
            */
            int j = 8;
            int k = ++j; //等价 j=j+1;k=j;
            System.out.println("k=" + k + "j=" + j);//9 9
            int h = 8;
            int l = h++; //等价 l=h;h=h+1;
            System.out.println("l=" + l + "h=" + h);//8 9
        }
    }
    /*
    算术运算符
    1. 加号（+）、减号（-）、乘号（*）、除号（/）、百分号（%）、加号（++）和减号（--）。重点讲解了除号（/）和百分号（%），以及它们与加号（++）的关系。
    2. 自增：++
    作为独立的语句使用：
    前++和后++都完全等价于i=i+1；作为表达式使用
    前++：++i先自增后赋值
    后++：i++先赋值后自增
    3. 减号（--）、加号（+）、减号（-）和乘号（*）是一个道理，完全可以通过类推来理解。
     */

    /*
    前缀自增（`++i`）和后缀自增（`i++`）在Java中的主要区别在于它们返回的值以及它们何时增加变量的值。
    以下是前缀自增（`++i`）的步骤：
    1. 变量的值增加 1。
    2. 返回增加后的值。
    这意味着如果你使用 `++i` 在表达式中，返回的值将是变量自增后的新值。
    以下是后缀自增（`i++`）的步骤：
    1. 返回变量的当前值（在自增之前）。
    2. 变量的值增加 1。
    这意味着如果你使用 `i++` 在表达式中，返回的值将是变量自增前的原始值。
    下面是一个示例，展示了这两种自增操作的区别：
    ```java
    int i = 1;
    int j = ++i; // 前缀自增
    // 现在 i = 2, j = 2
    int k = 1;
    int l = k++; // 后缀自增
    // 现在 k = 2, l = 1
    ```
    在这个例子中：
    - `j` 被赋值为 `i` 自增后的值，因此 `j` 是 2。
    - `l` 被赋值为 `k` 自增前的值，因此 `l` 是 1。
    这里的关键点是，如果你在赋值表达式中使用自增运算符，前缀和后缀自增会产生不同的结果。如果你只是单独使用自增运算符（不作为赋值的一部分），那么前缀和后缀自增在执行后的效果是相同的，因为它们都会使变量的值增加 1。例如：
    ```java
    int m = 1;
    m++; // m 现在是 2
    int n = 1;
    ++n; // n 现在也是 2
    ```
    在这两种情况下，`m` 和 `n` 的最终值都是 2，因为自增运算符只是用来增加变量的值，而不是用来赋值。
     */