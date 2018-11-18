package cn.itcast.day07.demo01;

import java.util.Scanner;

/*
键盘输入两个int数字，求出和值

思路：
    1. 既然需要键盘输入，那么就用Scanner
    2. Scanner的三个步骤，导包、创建、使用
    3. 需要的是两个数字，所以要调用两次nextInt方法
    4. 将结果打印出来
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int numA = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int numB = sc.nextInt();

        int result = numA + numB;
        System.out.println("结果是：" + result);
    }
}
