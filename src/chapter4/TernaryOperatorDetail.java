package chapter4;

public class TernaryOperatorDetail
{
    public static void main(String[] args)
    {
        int a = 10;  // 声明整型变量a并赋值为10
        int b = 5;   // 声明整型变量b并赋值为5
        int c = a > b ? a : b;  // 使用三元运算符判断a是否大于b，如果是则c赋值为a，否则赋值为b
        double d = c;  // 将整型变量c的值转换为double类型并赋值给d
        System.out.println("The value of d is: " + d);  // 输出变量d的值
    }
}
