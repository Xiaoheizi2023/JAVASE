package chapter4;

public class RelationalOperator
{
    public static void main(String[] args)
    {
        //“关系运算符”三个细节说明：
        //1. 关系运算符的结果都是boolean型，也就是要么是true，要么是false。
        //2. 关系运算符组成的表达式，我们称为关系表达式。a>b
        //3. 比较运算符”=="不能误写成"="
        int a = 9; //开发中，不可以使用a,b等简单变量名称
        int b = 8;
        System.out.println(a > b); //T
        System.out.println(a >= b); //T
        System.out.println(a <= b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        boolean flag = a > b;
        System.out.println("flag=" + flag);
    }

}

    /*
    逻辑运算符
    逻辑运算符规则
    1. a&b: &叫逻辑与，规则：当a和b同时为true，则结果为true，否则为false
    2. a&&b: &&叫短路与，规则：当a和b同时为true，则结果为true，否则为false
    3. a|b: |叫逻辑或，规则：当a和b，有一个为true，则结果为true，否则为false
    4. a||b: ||叫短路或，规则：当a和b，有一个为true，则结果为true，否则为false
    5. !a: 叫取反，或者非运算。当a为true，则结果为false，当a为false是，结果为true
    6. a^b: 叫逻辑异或，当a和b不同时，则结果为true，否则为false
    |   a   |   b   |  a&b | a&&b |  a|b | a||b |  !a   | a^b  |
    |:-----:|:-----:|:----:|:----:|:----:|:----:|:-----:|:----:|
    | true  | true  | true | true | true | true | false | false|
    | true  | false | false| false| true | true | false | true |
    | false | true  | false| false| true | true | true  | true |
    | false | false | false| false| false| false| true  | false|
     */