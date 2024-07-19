package chapter5;

import java.util.Scanner;

public class day5_5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = myScanner.nextInt();

        // 判断输入是否为三位数
        if (num < 100 || num > 999) {
            System.out.println(num + "不是三位数，请输入一个三位数！");
        } else {
            // 计算各个位数的立方和
            int sumOfCubes = cube(num / 100) + cube((num / 10) % 10) + cube(num % 10);

            // 使用if判断，输出对应信息
            if (sumOfCubes == num) {
                System.out.println(num + "是水仙花数");
            } else {
                System.out.println(num + "不是水仙花数");
            }
        }
        myScanner.close();
    }

    // 定义一个方法，用于计算一个整数的立方
    public static int cube(int number) {
        return number * number * number;
    }
}
