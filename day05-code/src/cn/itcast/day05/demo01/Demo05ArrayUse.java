package cn.itcast.day05.demo01;

/*
使用动态初始化数组的时候，其中的元素将自动拥有一个默认值。
规则如下：
    整数类型，默认值为0；
    浮点类型，默认值为0.0；
    字符类型，默认值为'\u0000'；
    布尔类型，默认值为false；
    引用类型，默认值为null；

 注意事项：
    静态初始化其实也有默认值得流程，只不过系统自动马上将默认值替换成为了大括号当中的具体数值。
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        // 动态一个初始化数组
        int[] array = new int[3];

        System.out.println(array); // 内存地址值

        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 0
        System.out.println(array[2]); // 0

        System.out.println("=================");
        array[1] = 123;
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 123
        System.out.println(array[2]); // 0
    }
}
