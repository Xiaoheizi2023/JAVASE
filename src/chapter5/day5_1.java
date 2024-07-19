package chapter5;
import java.util.Scanner;

public class day5_1 {
    public static void main(String[] args) {
        // 声明变量month和age，分别表示月份和年龄
        int month;
        int age;

        // 创建Scanner对象来接收用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要购买门票的月份: ");
        month = scanner.nextInt();
        System.out.print("请输入年龄: ");
        age = scanner.nextInt();

        // 使用if-else语句来判断月份和年龄，根据结果输出不同的信息
        if (month >= 4 && month <= 10) {
            System.out.println("当前季节为旺季");
            if (age >= 18 && age <= 60) {
                System.out.println("成人门票价格为60元");
            } else if (age < 18) {
                System.out.println("儿童门票价格为30元");
            } else { // age > 60
                System.out.println("老人门票价格为20元");
            }
        } else { // month < 4 || month > 10
            System.out.println("当前季节为淡季");
            if (age >= 18 && age <= 60) {
                System.out.println("成人门票价格为40元");
            } else { // age < 18 || age > 60
                System.out.println("儿童老人门票价格为20元");
            }
        }

        // 关闭scanner对象
        scanner.close();
    }
}
