package chapter3;
    /*
    2. 使用char类型，分别保存\n\t\r\\123等字符，并打印输出
     */
public class day3_2
{
    public static void main(String[] args)
    {
        char c1 = '\n'; //换行
        char c2 = '\t'; //制表位 ctrl + d
        char c3 = '\r'; //回车
        char c4 = '\\'; //输出\
        char c5 = '1'; //换行
        char c6 = '2'; //换行
        char c7 = '3'; //换行
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
    }
}
