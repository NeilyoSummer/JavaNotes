package cn.itcast.day04.demo02;

/*
题目要求：
    定义一个方法，用来【求出】两个数之和。（你帮我算，算完之后把结果告诉我。）
题目变形：
    定义一个方法，用来【打印】两个数之和。（你来计算，算完之后自己负责显示结果，不用告诉我。）

注意事项：
    对于有返回值的，可以使用单独调用、打印调用或者赋值调用。
    但是对于没有返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        // 我是main方法，我来调用你
        // 我调用你，你来帮我计算一下，算完之后，把结果告诉我的num变量
        int num = getSum(10, 20);
        System.out.println("返回值：" + num);
        System.out.println("=============");
        printSum(100, 200);
        System.out.println("=============");
        System.out.println(getSum(2, 3));
        getSum(3, 5);
        System.out.println("=============");

        // 对于void没有返回值的方法，只能单独使用，不能打印或者赋值。
        // 以下是错误代码：
        // System.out.println(printSum(2, 3));
        // System.out.println(void);

        // int num2 = printSum(10, 20);
        // int num3 = void;
    }

    // 我是一个方法，负责两个数字相加
    // 我有返回值int，谁调用我，我就计算结果告诉谁
    public static int getSum(int a, int b) {
        return a + b;
    }

    // 我是一个方法，我负责两个数字相加
    // 我没有返回值，不会把结果告诉任何人，而是我自己进行打印输出
    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("结果是：" + result);
    }
}
