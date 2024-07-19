package chapter4;

public class LogicOperator02
{
    // 编写一个main方法
    public static void main(String[] args)
    {
        // 短路或 和 |逻辑或 案例演示
        // 规则: 两个条件中只要有一个成立，结果为true,否则为false
        int age = 50;
        if (age > 20 || age < 30)
        {
            System.out.println("ok100");
        }

        // &&逻辑与使用
        if (age > 20 || age < 30)
        {
            System.out.println("ok200");
        }

        // 看看区别
        // （1）||短路或：如果第一个条件为true，
        // 则第二个条件不会判断，最终结果为true，效率高
        int a = 4;
        int b = 9;

        // 示例：短路或
        if (a > 5 || ++b > 10)
        {
            System.out.println("ok300");
        }

        // 输出结果，验证b是否被自增
        System.out.println("a=" + a + " b=" + b);

        // 示例：逻辑或（实际上在Java中，||就是逻辑或，也是短路或）
        if (a < 5 || ++b > 10)
        {
            System.out.println("a=4 b=9");
        }
        // 输出结果，验证b是否被自增
        System.out.println("a=" + a + " b=" + b);
    }
}

