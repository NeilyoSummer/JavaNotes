package cn.itcast.day05.demo03;

public class Demo05ArrayMaxAndMin {
    public static void main(String[] args) {
        int[] array = {5, 15, 30, 20, 1000};

        int max = array[0]; // 最大值记录变量

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("数组最大值：" + max);

        System.out.println("==================");

        int min = array[0]; // 最小值记录变量

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("数组最小值：" + min);
    }
}
