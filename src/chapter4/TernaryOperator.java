package chapter4;

public class TernaryOperator
{
    /*
    三元运算符
    Java 中的三元运算符是条件运算符，也称为三目运算符，使用问号 ? 和冒号 : 表示。
    它可以代替一部分 if-else 语句，使代码更加简洁。
    三元运算符的语法格式如下：
    booleanExpression ? expression1 : expression2
    其中，booleanExpression 是一个布尔表达式，expression1 和 expression2 是两个任意类型的表达式。
    三元运算符的作用是，如果 booleanExpression 为 true，则返回 expression1 的值；否则返回 expression2 的值。
     */
    public static void main(String[] args)
    {

        int a = 10;
        int b = 99;

        //解读
        //1.a>b为false
        //2.返回b–，先返回b的值，然后在b-1
        //3.返回的结果是99

        int result = a > b ? a++ : b--;
        System.out.println("result =" + result);
    }
}
