package cn.itcast.day06.demo02;

/*
成员方法保存的其实是一个地址值
 */
public class Demo03PhoneSame {
    public static void main(String[] args) {
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

        printSplitLine();

        Phone two = one;
        System.out.println(two.brand); // null
        System.out.println(two.price); // 0.0
        System.out.println(two.color); // null
        printSplitLine();

        two.brand = "SAMSUNG";
        two.price = 5999.0;
        two.color = "蓝色";
        System.out.println(two.brand); // SAMSUNG
        System.out.println(two.price); // 5999.0
        System.out.println(two.color); // 蓝色
        printSplitLine();

        two.call("欧巴");
        two.sendMessage();
    }

    public static void printSplitLine() {
        System.out.println("=======================");
    }
}
