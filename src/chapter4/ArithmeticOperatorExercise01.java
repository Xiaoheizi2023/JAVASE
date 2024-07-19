package chapter4;
    /*
    题目1
    int i=1;//i->1
    i=i++;//规则使用临时变量: (1) temp=i;(2) i=i+1;(3)i=temp;
    System.out.println(i);//
    问：结果是多少?为什么?
    题目2
    int i=1;
    i=++i;//规则使用临时变量: (1) i=i+1;(2) temp=i;(3)i=temp;
    System.out.println(i);//?
     */
public class ArithmeticOperatorExercise01
{
    //编写一个main方法
    public static void main(String[] args)
    {
        int i = 1;//i->1
        i = i++; //规则使用临时变量: (1) temp=i; (2) i=i+1; (3) i=temp;
        System.out.println(i);//1
        int j=1; j=++j; //规则使用临时变量：(1) i=i+1；(2) temp=i；(3) i=temp；
        System.out.println(j);//2
    }
}
    /*
    在Java中，后缀自增运算符（`i++`）会返回变量的原始值，然后变量的值才会增加。在你提供的代码中，`i = i++;` 这个表达式的执行过程如下：
    1. `i++` 首先返回 `i` 的当前值，这个值是 1。
    2. 然后，`i` 的值增加 1，变为 2。
    3. 但是，返回的原始值 1 被赋值给 `i`。
    这个过程可以分解为以下伪代码：
    ```java
    temp = i;    // temp = 1
    i = i + 1;   // i = 2
    i = temp;    // i = 1
    ```
    所以，尽管 `i` 在 `i++` 之后确实变成了 2，但是这个新的值并没有被赋值给 `i`。相反，原始的值 1 被重新赋值给了 `i`，这就是为什么输出是 1 而不是 2 的原因。
    为了确保 `i` 的值是 2，你应该使用前缀自增运算符（`++i`）：
    ```java
    i = ++i; // 这会将 i 的值增加 1，然后返回新的值
    ```
    或者，你可以简单地写：
    ```java
    i++; // 这会将 i 的值增加 1，但是你需要确保不在同一行中将原始值赋回给 i
    ```
    然后，如果你打印 `i`，它将是 2。
     */