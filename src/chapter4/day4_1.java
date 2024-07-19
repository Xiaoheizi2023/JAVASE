package chapter4;

public class day4_1
{
}
    /*
    **运算符优先级**
    1. 运算符有不同的优先级，所以优先级就是表达式运算中的运算顺序。如右表，上⼀行运算符总优先于下⼀行。
    2. 只有单目运算符，赋值运算符是从右向左运算的。

    **梳理小结:** 小伙伴有一个大致印象，使用多了，就熟悉了
    1. () . [] {} 等
    2. 单目运算符 ++ --
    3. 算术运算符 * / %
    4. 位移运算符 << >>
    5. 比较运算符 < > <= >= instanceof
    6. 逻辑运算符 == !=
    7. 三元运算符 ? :
    8. 赋值运算符 = *= /= %= += -= <<= >>= >>>= &= ^= |=

    **运算符优先级表:**

    | 运算方向   | 运算符                    |
    |----------|---------------------------|
    | R → L    | . () [] {} ; ,            |
    | R → L    | ++ -- ~ ! (data type)     |
    | L → R    | * / %                     |
    | L → R    | + -                       |
    | L → R    | << >> >>> (位移)          |
    | L → R    | < > <= >= instanceof      |
    | L → R    | == !=                     |
    | L → R    | &                         |
    | L → R    | ^                         |
    | L → R    | |                         |
    | L → R    | &&                        |
    | L → R    | ||                        |
    | L → R    | ?:                        |
    | R → L    | = *= /= %= += -= <<= >>=  |
    | R → L    | >>>= &= ^= |=             |
     */