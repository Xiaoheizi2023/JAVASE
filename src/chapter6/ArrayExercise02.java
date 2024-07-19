package chapter6;

    /*
    //请求出一个数组int[]的最大值{4,-1,9,10,23}，并得到对应的下标
    //1.定义一个int数组 int[] arr = {4,-1,9,10,23};
    //2.假定max=arr[0] 是最大值，maxIndex=0;
    //3.从下标1开始遍历arr，如果max<当前元素，说明max不是真正的最大值，我们就 max=当前元素；maxIndex=当前元素下标
    //4.当我们遍历这个数组arr后，max就是真正的最大值，maxIndex最大值对应的下标
     */
public class ArrayExercise02 {
    public static void main(String[] args) {
        // 定义一个int数组
        int[] arr = {4, -1, 9, 10, 23};

        // 假定第一个元素为最大值
        int max = arr[0];
        int maxIndex = 0;

        // 从下标1开始遍历数组
        for (int i = 1; i < arr.length; i++) {
            // 如果当前元素大于max，则更新max和maxIndex
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        //当我们遍历这个数组arr后，max就是真正的最大值，maxIndex最大值下标System.out.println("max="+ max +" maxIndex="+ maxIndex);
        // 输出最大值及其下标
        System.out.println("max=" + max + " maxIndex=" + maxIndex);
    }
}