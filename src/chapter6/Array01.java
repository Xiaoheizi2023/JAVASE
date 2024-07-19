package chapter6;

public class Array01
{
    public static void main(String[] args)
    {
        //一个养鸡场有六只鸡，它们的体重分别是3kg,5kg,6kg,3.4kg,2kg,50kg.请分别输出六只鸡的体重和平均体重。
        double[] hens = {3,5,6,3.4,2,50};
        double sum = 0;
        for (int i = 0; i < hens.length; i++)
        {
            sum += hens[i];
        }
        double average = sum / hens.length;
        System.out.println("总体重" + sum + "kg");
        System.out.println("平均体重" + average + "kg");
    }
}
