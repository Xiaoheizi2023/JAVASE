package chapter5;

public class day5_6 {
    public static void main(String[] args) {
        // 输出1-100之间不能被5整除的数，每五个一行
        int a = 1;
        int count = 0; // 用于计数，每5个数换行
        while (a <= 100) {
            if (a % 5 != 0) { // 如果a不能被5整除，则输出
                System.out.print(a + " ");
                count++; // 增加计数器
                if (count == 5) { // 如果计数器达到5，则换行并重置计数器
                    System.out.println();
                    count = 0; // 重置计数器
                }
            }
            a++;
        }
    }
}
