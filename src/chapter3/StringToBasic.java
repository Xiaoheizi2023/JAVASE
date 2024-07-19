package chapter3;
    /*
    基本数据类型和String类型的转换
    在程序开发中，我们经常需要将基本数据类型转成String类型。或者将String类型转成基本数据类型。
    基本类型转String类型
    语法：将基本类型的值+"”即可
    String类型转基本数据类型
    语法：通过基本类型的包装类调用parseXX方法即可
     */
public class StringToBasic
{
    public static void main(String[] args)
    {
    //基本数据类型➡String
    int n1 = 100;
    float f1 = 1.1F;
    double d1 = 4.5;
    boolean b1 = true;
    String s1 = n1 + "";
    String s2 = f1 + "";
    String s3 = d1 + "";
    String s4 = b1 + "";
    System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
    }
}
