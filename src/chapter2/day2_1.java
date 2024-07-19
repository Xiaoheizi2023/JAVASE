package chapter2;

public class day2_1
{
    public static void main(String[] args)
    {
        System.out.println(100 + 98); // 198
        System.out.println("100" + 98); //10098
        System.out.println(100 + 3 + "hello"); //103hello
        System.out.println("hello" + 3 + 100); //hello1003
        /*
        在Java中，System.out.println 方法会将其参数连接起来输出。当它遇到字符串（如 “hello”）和其它数据类型（如整数）时，它会使用 + 运算符来连接这些值。
        + 运算符在Java中是左结合的，这意味着它从左到右进行计算。
        在表达式 System.out.println("hello" + 3 + 100); 中，首先计算最左边的操作数，即字符串 “hello” 和整数 3 的连接。
        在Java中，当一个字符串与一个非字符串值（这里是整数 3）使用 + 运算符连接时，整数 3 会被自动转换成字符串 “3”，然后与 “hello” 连接，形成新的字符串 “hello3”。
        接下来，这个新字符串 “hello3” 与下一个整数 100 使用 + 运算符连接，同样地，整数 100 会被转换成字符串 “100”，然后与 “hello3” 连接，形成最终的字符串 “hello3100”。
        因此，输出是 “hello3100”，而不是 “hello103”。如果你想要得到 “hello103” 的输出，你需要使用括号来改变运算的顺序，如下所示：
        System.out.println("hello" + (3 + 100));
        这样，首先会计算括号内的表达式 3 + 100，结果是整数 103。然后，字符串 “hello” 与整数 103 连接，整数 103 会被转换成字符串 “103”，最终输出 “hello103”。
        */
        System.out.println("hello" + (3 + 100)); //hello103
    }
}

