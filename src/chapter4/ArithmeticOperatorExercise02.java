package chapter4;
//1.假如还有59天放假，问:合xx个星期零xx天
//2.定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为:5/9*(华氏温度-100)，请求出华氏温度对应的摄氏温度。[234.5]
public class ArithmeticOperatorExercise02
{
    public static void main(String[] args)
    {
                int dividend = 59; // 被除数
                int divisor = 7;   // 除数

                int quotient = dividend / divisor; // 商
                int remainder = dividend % divisor; // 余数

                System.out.println(dividend + "天 合计: " + quotient + "个星期零" + remainder + "天");

                double fahrenheit = 234.5; // 华氏温度
                double celsius = 5.0 / 9 * (fahrenheit - 100); // 转换为摄氏温度

                System.out.println("华氏温度 " + fahrenheit + " 对应的摄氏温度是: " + celsius);

    }
}
