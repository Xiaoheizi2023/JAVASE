package chapter3;
    /*
    关于基本数据类型和String类型的转换
    1.在将String类型转换成基本数据类型时，要确保String类型能够转成有效的数据，
    比如我们可以把"123"，转成一个整数，但是不能把"hello"转成一个整数。
    2.如果格式不正确，就会抛出异常，程序就会终止，这个问题在异常处理章节中，会处理。
     */
public class StringToBasicDetail
{
    //演示字符串转基本数据类型的细节
    public static void main(String[] args)
    {
        //String str = "hello";
        String str = "666";
        //转成int
        int n1 = Integer.parseInt(str);
        System.out.println(n1);
    }
}

