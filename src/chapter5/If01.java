package chapter5;
import java.util.Scanner;
    /*
    分支控制if else
    单分支基本语法
        if(条件表达式){
        执行代码块;(可以有多条语句.)
    }
    说明：当条件表达式为ture时，就会执行{ }的代码。如果为false，就不执行。
    特别说明，如果{ }中只有一条语句，则可以不用 { }
     */
public class If01
{
    public static void main(String[] args)
    {
        /*
        编写一个程序，可以输入人的年龄，如果该同志年龄大于18岁，
        则输出 "你年龄大于18，要对自己的行为负责，送入监狱"
        思路分析
        1.接收输入的年龄，应该定义一个Scanner对象
        2.把年龄保存到一个变量 int age
        3.使用 if 判断，输出对应信息
        */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        //使用if判断，输出对应信息
        if(age > 18)
        {
            System.out.println("你年龄大于18，要对自己的行为负责，送入监狱");
        }
        System.out.println("程序继续...");
    }
}