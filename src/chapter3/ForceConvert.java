package chapter3;

public class ForceConvert {
    /*
    基本数据类型转换
    强制类型转换细节说明
    1.当进行数据的大小从大——>小，就需要使用到强制转换
    2.强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    //int x = (int)10*3.5+6*1.5;
    int y=(int)(10*3.5+6*1.5);
    System.out.println(y);
    3.char类型可以保存 int的常量值，但不能保存int的变量值，需要强转
    char c1 = 100; /ok
    int m = 100; /ok
    char c2=m;/错误
    char c3=(char)m;//ok
    System.out.println(c3);/100对应的字符
    4.byte和short, char 类型在进行运算时，当做int类型处理。
     */
    public static void main(String[] args)
    {
    //演示强制类型转换
        int n1 = (int) 1.9;
        System.out.println("n1 ="+ n1);//1，造成精度损失,这个过程可以理解为取整操作，并且是向零取整（floor），即直接去掉小数部分，而不是四舍五入。
        int n2 = 2000;
        byte b1 = (byte) n2;
        System.out.println("b1 =" + b1);//造成数据溢出
    }
}