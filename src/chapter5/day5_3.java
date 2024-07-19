package chapter5;
import java.util.Scanner;

public class day5_3
{
    /*
    实现判断一个整数，属于那个范围；大于0；小于0；等于0
    思路：定义int n = 22；使用if -- else if -- else即可
     */
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = myScanner.nextInt();
        //使用if判断，输出对应信息
        if(num > 0)
        {
            System.out.println("这个整数的范围大于0");
        }
        else if(num < 0)
        {
            System.out.println("这个整数的范围小于0");
        }
        else if(num == 0)
        {
            System.out.println("这个整数的范围等于0");
        }
    }
}
