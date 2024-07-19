package chapter6;

public class ArrayExercise01 {
    //编写一个main方法
    public static void main(String[] args){
        /*
        创建一个char类型的26个元素的数组，分别放置'A'-'Z'。使用for循环访问所有元素并打印出来。
        提示: char类型数据运算 'A'+1 -> 'B'
        思路分析
        1.定义一个数组char[ ] chars = new char[26]
        2.因为'A'+1='B'类推，所以老师使用for来赋值
        3.使用for循环访问所有元素
        */
        char[ ] chars = new char[26];
        for(int i = 0;i < chars.length; i++)
        {
            chars[i] = (char)('A' + i); //需要强制转换
        }
        //循环输出
        System.out.println("=====数组chars=====");
        for(int i = 0;i < chars.length; i++)
        {
            System.out.print(chars[i] + " ");
        }
    }
}

