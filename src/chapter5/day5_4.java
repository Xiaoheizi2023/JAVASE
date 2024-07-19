package chapter5;

import java.util.Scanner;
    //判断一个年份是否为闰年
public class day5_4
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = myScanner.nextInt();
        //使用if判断，输出对应信息
        if(year/4 == 0 && year/100 != 0 || year/400 == 0)
        {
            System.out.println("年份" + year + "是闰年");
        }
        else
        {
            System.out.println("年份" + year + "不是闰年");
        }
    }
}
