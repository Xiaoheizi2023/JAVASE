package chapter5;
import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象用于接收用户输入
        System.out.println("请输入一个字符(a-g)：");
        char inputChar = scanner.next().charAt(0); // 读取用户输入的第一个字符
        inputChar = Character.toLowerCase(inputChar); // 将字符转换为小写

        switch (inputChar) {
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入的字符不正确，请输入a-g之间的字符。");
                break;
        }

        scanner.close(); // 关闭Scanner对象
    }
}
