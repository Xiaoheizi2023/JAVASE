package chapter5;

public class day5_9
{
    public static void main(String[] args)
    {
        //求1 + (1 + 2） + （1 + 2 + 3) + ... + (1 + 2 + 3 + ... + 100)的和
        int sum = 0;
        int allsum = 0;
        for (int i = 1; i <= 100; i++)
        {
            sum += i;
            allsum = allsum + sum;
        System.out.println(allsum);
        }
    }
}
