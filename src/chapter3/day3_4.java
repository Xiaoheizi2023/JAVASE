package chapter3;
    /*
    4. 编程实现如下效果:
    姓名 年龄 成绩 性别 爱好
    XX XX XX XX XX
    要求:
    1) 用变量将姓名、年龄、成绩、性别、爱好存储
    2) 使用+
    3) 添加适当的注释
    4) 添加转义字符，使用一条语句输出
     */
public class day3_4
{
    public static void main(String[] args)
    {
        String name = "小";
        int age = 25;
        double score = 250;
        char gender = '男';
        String hobby = "篮球";
        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"
                + name + "\t" + age + "\t" + score + "\t" + gender + "\t" + hobby
        );
    }
}
