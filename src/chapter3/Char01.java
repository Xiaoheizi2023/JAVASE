package chapter3;
    /*
    字符类型（char）
    1. 字符常量是用单引号（' '）括起来的单个字符。例如：char c1 = 'a'; char c2 = '中'; char c3 = '9';
    2. Java中还允许使用转义字符'\'来将其后的字符转变为特殊字符型常量。例如：char c3 = '\n'; //'\n'表示换行符
    3. 在java中，char的本质是一个整数，在输出时，是unicode码对应的字符。http://tool.chinaz.com/Tools/Unicode.aspx
    4. 可以直接给char赋一个整数，然后输出时，会按照对应的unicode字符输出[97]
    5. char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码。
     */
public class Char01
{
        //编写一个main方法
        public static void main(String[] args) {
            char c1 = 'a';
            char c2 = '\t';
            char c3 = '韩';
            char c4 = 97; //说明：字符类型可以直接存放一个数字
            //修改快捷键
            //删除当前行的快捷键使用 ctrl+shift+k => ctrl+ k
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(c4); //当输出c4时，会输出97表示的字符 => 编码的概念
        }
}
