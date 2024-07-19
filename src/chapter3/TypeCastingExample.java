package chapter3;

public class TypeCastingExample
{
    public static void main(String[] args)
    {
        // 强制类型转换示例：从double转换为int
        double d = 10.99;
        int i = (int)d; // 强制类型转换
        System.out.println("double value: " + d);
        System.out.println("int value after casting: " + i);

        // char类型赋值和转换示例
        char c1 = 'A'; // 正确的赋值
        int i1 = (int)c1; // 将char类型转换为int类型
        System.out.println("char value: " + c1);
        System.out.println("int value of char: " + i1);

        // 错误的char类型赋值示例（假设图片中有这样的示例）
        // char c2 = 'AB'; // 错误的赋值，因为char只能存储一个字符
        // 如果需要存储字符串"AB"，应该使用String类型
        String str = "AB";
        System.out.println("String value: " + str);
    }
}
    /*
    基本数据类型转换—练习题
    判断是否能够通过编译
    1.  short s = 12; /ok
    s = s-9; /错误 int ->short
    2. byte b = 10; /ok
    b=b+11;/错误 int->byte
    b=（byte）（b+11）；/正确，使用强转
    3. char c = 'a'; /ok
    int i = 16; /ok
    float d =.314F; //ok
    double result c+ i+ d; //ok float->double
    4. byte b = 16; /ok
    shorts= 14;//ok
    short t = s + b; /错误 int ->short
     */
