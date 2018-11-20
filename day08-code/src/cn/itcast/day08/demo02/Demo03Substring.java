package cn.itcast.day08.demo02;

/*
字符串的截取方法

public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串
public String substring(index begin, int ned)：截取begin开始，一直到end结束，中间的字符串。
备注：[begin, end)，包含左边，不包含右边
 */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);

        System.out.println(str1);// HelloWorld
        System.out.println(str2);// World
        System.out.println("======================");

        String str3 = str1.substring(4, 7);
        System.out.println(str3);
        System.out.println("======================");

        // 下面这种写法，字符串的内容任然是没有改变的
        // 下面两个字符串："Hello","Java"
        // strA当中保存的是地址值
        // 假设本来Hello地址值是0x333
        // 后面Java地址值是0x666
        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);
    }
}
