package cn.itcast.day06.demo02;

/*
成员方法保存的其实是一个地址值
 */
public class Demo01PhoneOne {
    public static void main(String[] args) {
        // 根据Phone类，创建一个名为one的对象
        // 格式： 类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null
        printSplitLine();

        one.brand = "Apple";
        one.price = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand); // Apple
        System.out.println(one.price); // 8388.0
        System.out.println(one.color); // 黑色
        printSplitLine();

        one.call("Jobs");
        one.sendMessage();
    }

    public static void printSplitLine() {
        System.out.println("=======================");
    }
}
