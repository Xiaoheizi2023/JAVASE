package chapter4;
    /*
    这是一张关于逻辑运算符的PPT，背景为黑色，字体为白色和黄色。具体内容包括：
    - **基本规则**：
      - **名称**：!非（取反）
      - **语法**：!条件
      - **特点**：如果条件本身成立，结果为false，否则为true
    - **案例演示**：
      - **使用InverseOperator.java**
    - **案例演示**：
      - **a^b**：逻辑异或，当a和b不同时，则结果为true，否则为false
      - **代码示例**：System.out.println((4<1)^(6>3)); //?
     */
public class InverseOperator
{
    public static void main(String[] args)
    {
        //!操作是取反 T->F ，F -> T
        System.out.println(60 > 20); //T
        System.out.println(!(60 > 20)); //F
        //a^b: 叫逻辑异或，当a和b不同时，则结果为true，否则为false
        boolean b=(10>1)^(3>5);
        System.out.println("b="+b);//F
    }

}
