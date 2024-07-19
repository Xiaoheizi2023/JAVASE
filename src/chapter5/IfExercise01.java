package chapter5;

/*
分支控制if else
单分支和双分支练习题
1. 编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。
2. 课后自己练定义两个变量int，判断二者的和，是否能被3又能被5整除，打印提示信息。
3. 判断一个年份是否是闰年，闰年的条件是符合下面二者之一：(1)年份能被4整除，但不能被100整除；(2)能被400整除。
 */
public class IfExercise01
{
    // 编写一个main方法
    public static void main(String[] args)
    {
        // 编写程序，声明2个double型变量并赋值。
        // 判断第一个数大于10.0，且第2个数小于20.0，打印两数之和
        // 思路分析
        double d1 = 33.5;
        double d2 = 2.6;
        if (d1 > 10.0 && d2 < 20.0)
        {
            System.out.println("两个数和=" + (d1 + d2));
        }

        // 课后自己练定义两个变量int，判断二者的和，是否能被3又能被5整除，打印提示信息。
        int a = 10;
        int b = 20;
        if ((a + b) % 3 == 0 && (a + b) % 5 == 0)
        {
            System.out.println("两个数和=" + (a + b));
        }
        //判断一个年份是否是闰年，闰年的条件是符合下面二者之一：(1)年份能被4整除，但不能被100整除；(2)能被400整除。
        int year = 2025;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println(year + "是闰年");
        }
        else
        {
            System.out.println(year + "不是闰年");
        }
    }
}