package chapter3;

public class Boolean01
{
    //布尔类型：boolean 使用说明：不可以0或非0的整数替代false和true，这点和C语言不同
    public static void main(String[] args)
    {
        //演示判断成绩是否通过的案例
        //定义一个布尔变量
        boolean isPass = true;//
        if(isPass == true)
        {
            System.out.println("考试通过，恭喜");
        }
        else
        {
            System.out.println("考试没有通过，下次努力");
        }
    }
}
