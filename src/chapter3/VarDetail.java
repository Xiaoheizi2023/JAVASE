package chapter3;

public class VarDetail
{
    public static void main(String[] args)
    {
        //变量必须先声明，后使用，即有顺序
        //该区域的数据/值可以在同一类型范围内不断变化
        //变量在同一个作用域内不能重名
        //变量=变量名＋值＋数据类型
        int a = 1, b = 2, c = 3; // 声明三个int型整数：a、b、c
        int d = 4, e = 5, f = 6; // 声明三个整数并赋予初值
        byte z = 22; // 声明并初始化 z
        String s = "runoob"; // 声明并初始化字符串 s
        double pi = 3.14159; // 声明了双精度浮点型变量 pi
        char x = 'x'; // 声明变量 x 的值是字符 'x'

        // 打印变量的值，以验证它们已经被正确初始化
        System.out.println("整数值 a, b, c 分别为: " + a + ", " + b + ", " + c);
        System.out.println("整数值 d, e, f 分别为: " + d + ", " + e + ", " + f);
        System.out.println("字节型变量 z 的值为: " + z);
        System.out.println("字符串 s 的值为: " + s);
        System.out.println("双精度浮点型变量 pi 的值为: " + pi);
        System.out.println("字符型变量 x 的值为: " + x);
    }

}
