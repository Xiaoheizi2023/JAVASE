package chapter5;

public class day5_8 {
    public static void main(String[] args) {
        //求出1-1/2+1/3-1/4……1/100的和
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum - 1.0 / i; // 如果是偶数项，则减去
            } else {
                sum = sum + 1.0 / i; // 如果是奇数项，则加上
            }
        }
        System.out.println(sum); // 输出计算结果
    }
}
