package chapter4;
    /*
    赋值运算符
    介绍
    赋值运算符就是将某个运算后的值，赋给指定的变量。赋值运算符的分类
    基本赋值运算符 =
    复合赋值运算符
    +=，—=，*=，/=，%=等，重点讲解一个+=，其它的使用是一个道理
    a += b；[等价？]
    a —= b；[等价？]
    案例演示
    案例演示赋值运算符的基本使用:
    1）赋值基本案例 [int num1 = 10]
    2)+=的使用案例
    赋值运算符特点:
    1)运算顺序从右往左 int num= a+ b+ c;
    2）赋值运算符的左边只能是变量，右边可以是变量、表达式、常量值
    int num = 20; int num2= 78 * 34- 10; int num3 = a;
    3）复合赋值运算符等价于下面的效果
    比如：a+=3；等价于a=a+3；
    4）复合赋值运算符会进行类型转换。
    byte b = 2； b+=3; b++;
     */
public class AssignOperator
{
    //编写一个main方法
    public static void main(String[] args)
    {
        //基本的赋值运算符
        int i;
        i = 10;
        System.out.println("i = " + i);
        i = 100;
        System.out.println("i = " + i);
        //扩展的赋值运算符
        int x = 10;
        x += 1; //等同于 x = x + 1
        System.out.println("x = " + x); //11
        int y = 10;
        y -= 1; //等同于 y = y - 1
        System.out.println("y = " + y); //9
        int z = 10;
        z *= 2; //等同于 z = z * 2
        System.out.println("z = " + z); //20
        int m = 10;
        m /= 3; //等同于 m = m / 3
        System.out.println("m = " + m); //3
        int n = 10;
        n %= 3; //等同于 n = n % 3
        System.out.println("n = " + n); //1
        //复合赋值运算符会进行类型转换
        byte b = 3;
        b += 2;//等价b = (byte)(b + 2);
        b++;//b = (byte)(b+1);
    }
}
