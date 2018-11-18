package cn.itcast.day07.demo01;

import java.util.Scanner;

/*
题目：
    键盘输入三个int数字，求出其中最大的值

思路：
    1. 既然是键盘输入，肯定要用到Scanner
    2. 既然是三个数字，那么调用三次nextInt()方法，得到三个int变量
    4. 无法同时判断三个数字谁最大，应该转换成为两个步骤
        4.1 首先判断前两个当中谁最大
        4.2 拿着前两个中的最大值，再和第三个数字比较，得到三个数字当中的最大值
    5. 打印最终结果
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int numA = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int numB = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int numC = sc.nextInt();

        int temp = numA > numB ? numA : numB;
        int max = temp > numC ? temp : numC;

        System.out.println("最大值：" + max);
    }
}
