package cn.itcast.day05.demo01;

import java.util.Arrays;

/*
直接打印数组名称，得到的是数组对应的：内存地址哈希值。
例如：
    [I@4554617c
    中括号代表这个是数组 I代表这个是整型 @后的是十六进制

二进制：01
十进制：0123456789
十六进制：0123456789abcdef

访问数组元素的格式： 数组名称[索引值]
索引值：
    就是一个int数字，代表数组当中元素的编号。
【注意】
    索引是从0开始，一直到“数组的长度 - 1”为止。
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        // 静态初始化的省略模式
        int[] array = {10, 20, 30};

        System.out.println(array);

        System.out.println(array[0]); // 10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30

        // 也可以将数组当中的某一个单个元素，赋值交给变量
        int num = array[1];
        System.out.println(num); // 20
    }
}
