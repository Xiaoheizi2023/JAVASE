package chapter4;

public class LogicOperator01
{
    //编写一个main方法
    public static void main(String[] args)
    {
        //&&短路与 和 & 案例演示
        int age = 50;
        if(age > 20 && age < 90)
        {
            System.out.println("ok100");
        }
        //&逻辑与使用
        if(age > 20 && age < 90)
        {
            System.out.println("ok200");
        }
        //||短路或 和 | 案例演示
        if(age > 20 || age < 90)
        {
            System.out.println("ok400");
        }

        // 区别
        int a = 4;
        int b = 9;
        // 对于&&短路与而言，如果第一个条件为false，后面的条件不再判断
        // 对于&逻辑与而言，如果第一个条件为false，后面的条件仍然会判断
        if (a < 1 && ++b < 50)
        //if (a < 1 & ++b < 50)
        {
            System.out.println("ok300");
        }
        System.out.println("a=" + a + " b=" + b); // 输出结果将是 4 10
    }
}
    /*
    ### 逻辑运算符
    #### `&&` 和 `&` 基本规则
    - **名称**
      - 短路与 `&&`
      - 逻辑与 `&`
    - **语法**
      - `条件1 && 条件2`
      - `条件1 & 条件2`
    - **特点**
      - 对于 `&&`：两个条件都为 `true` 时，结果才为 `true`。
      - 对于 `&`：两个条件都为 `true` 时，结果才为 `true`。
    #### `&&` 和 `&` 案例演示
    案例演示 `&&` 和 `&` 运算符的使用（LogicOperator01.java）。
    #### `&&` 和 `&` 使用区别
    1. **短路与 `&&`：** 如果第一个条件为 `false`，则第二个条件不会判断，最终结果为 `false`，效率高。
    2. **逻辑与 `&`：** 不管第一个条件是否为 `false`，第二个条件都要判断，效率低。
    3. **开发中：** 我们使用的基本是短路与 `&&`，效率高。
    #### 示例代码
    - **示例 1：**
      ```java
      double score = 70;
      if (score >= 60 && score <= 80) {
          System.out.println("yes100");
      }
      if (score >= 60 & score <= 80) {
          System.out.println("yes200");
      }
      ```
    - **示例 2：**
      ```java
      int a = 10;
      int b = 99;
      if (a < 5 && b++ > 100) {
          System.out.println("哈哈哈哈");
      }
      if (a < 5 & b++ > 100) {
          System.out.println("哈哈哈哈");
      }
      System.out.println(a);
      System.out.println(b);
      ```
    ### 总结
    - `&&` 运算符更高效，因为如果第一个条件为 `false`，则不会判断第二个条件。
    - `&` 运算符总是会判断两个条件，不论第一个条件的结果如何。
     */