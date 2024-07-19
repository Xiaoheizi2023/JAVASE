package chapter5;
import java.util.Scanner;
    /*
    分支控制if-else
    双分支基本语法：
    if (条件表达式)
    {
        执行代码块1;
    }
    else
    {
        执行代码块2;
    }
    说明：当条件表达式成立，即执行代码块1，否则执行代码块2.如果执行代码块只有一条语句，则{}可以省略，否则，不能省略
     */
public class If02
{
    public static void main(String[] args){
    //编写一个程序，可以输入人的年龄，如果该同志年龄大于18岁，
    //则输出 "你年龄大于18，要对自己的行为负责，送入监狱"。否则，输出"你的年龄不大这次放过你了."
    //思路分析
    //1. 接收输入的年龄，应该定义一个Scanner 对象
    //2. 把年龄保存到一个变量 int age
    //3. 使用 if-else| 判断，输出对应信息
    //应该定义一个Scanner对象
    Scanner myScanner = new Scanner(System.in);
    System.out.println("请输入年龄:");
    //把年龄保存到一个变量 int age
    int age = myScanner.nextInt();
    //使用 if-else 判断，输出对应信息
    if(age > 18){
        System.out.println("你年龄大于18，要对自己的行为负责，送入监狱");
    } else {//双分支
        System.out.println("你的年龄不大这次放过你了");
    }
    System.out.println("程序继续...");

    }
}
    /*
    悬空else问题
    else自动与距离最近的if进行组合
        int main()
    {
        int a = 0;
        int b = 2;
        if(a == 1)
            if(b == 2)
                printf("hehe\n");
        else
            printf("haha\n");
        return 0;
    }
什么都没输出
    int main()
    {
        int a = 0;
        int b = 2;
        if(a == 1)
        {
            if(b == 2)
            {
                printf("hehe\n");
            }
            else
            {
                printf("haha\n");
            }
        }
        return 0;
     */