package chapter1;
//1.print为一般输出，同样不能保留精度格式转化，也不能换行输出
//2.printf常用于格式转换，但需要注意不是换行输出，只用于精度转换
//3.println为换行输出，不能用于格式转换
//将个人的基本信息(姓名、性别、住址、爱好)打印到控制台上输出。各条信息分别占一行。
public class day1_2
{
    public static void main(String[] args)
    {
        System.out.printf("小黑子\n");
        System.out.printf("男\n");
        System.out.printf("蔡徐村\n");
        System.out.printf("唱, 跳, Rap, 篮球\n");
        System.out.printf("姓名\t%s\n性别\t%s\n住址\t%s\n爱好\t%s\n", "小黑子", "男", "蔡徐村", "唱, 跳, Rap, 篮球");
    }
}
