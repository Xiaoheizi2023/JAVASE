package chapter4;

public class TernaryOperatorExercise
{
    public static void main(String[] args)
    {
        int a = 5;   // 声明整型变量a并赋值为3
        int b = 4;   // 声明整型变量b并赋值为4
        int c = 10;   // 声明整型变量c并赋值为5
        int d = a > b ? a : b;  // 使用三元运算符判断a是否大于b，如果是则d赋值为a，否则赋值为b
        int e = c > d ? c : d;  // 使用三元运算符判断c是否大于d，如果是则e赋值为c，否则赋值为d
        System.out.println("三个数字中最大值是: " + e);
        //使用一条语句实现,但效率低
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println("三个数字中最大值是: " + max);
    }
}
