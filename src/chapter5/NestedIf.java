package chapter5;
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        // 声明变量score和gender，分别表示成绩和性别
        double score;
        char gender;

        // 创建Scanner对象来接收用户输入
        Scanner scanner = new Scanner(System.in);

        try {
            // 使用next()方法读取成绩
            System.out.println("请输入成绩：");
            score = scanner.nextDouble();

            // 使用if-else语句来判断成绩是否大于8.0，并根据结果输出不同的信息
            if (score > 8.0) {
                // 使用charAt()方法读取性别
                System.out.println("请输入性别（M/F）：");
                gender = Character.toUpperCase(scanner.next().charAt(0));
                if (gender == 'M') {
                    System.out.println("进入男子组");
                } else if (gender == 'F') {
                    System.out.println("进入女子组");
                } else {
                    System.out.println("性别输入错误");
                }
            }
            else {
                System.out.println("Sorry，你被淘汰了~\"");
            }
        } catch (Exception e) {
            System.out.println("出错了");
        } finally {
            // 关闭Scanner对象
            scanner.close();
        }
    }
}