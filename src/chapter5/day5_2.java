package chapter5;

import java.util.Scanner;

public class day5_2 {
    public static void main(String[] args) {
        double money = 100000; // 初始金额
        int count = 0; // 经过路口的次数

        while (money > 0) {
            count++; // 经过一个路口，次数加一
            if (money > 50000) {
                // 当现金大于50000时，每次交5%
                money *= 0.95;
            } else {
                // 当现金小于等于50000时，每次交1000
                money -= 1000;
                if (money < 0) {
                    // 如果扣除1000后，现金小于0，则将此次经过不计入总数，并结束循环
                    count--;
                    break;
                }
            }
            System.out.println("经过第 " + count + " 个路口后，剩余现金为: " + money);
        }

        System.out.println("该人可以经过 " + count + " 次路口");
    }
}
