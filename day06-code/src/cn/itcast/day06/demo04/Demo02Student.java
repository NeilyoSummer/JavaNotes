package cn.itcast.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("===========================");

        Student stu2 = new Student("赵丽颖", 20);
        System.out.println("姓名：" + stu2.getName());
        System.out.println("年龄：" + stu2.getAge());
        System.out.println("===========================");

        // 如果需要改变对象中的成员变量内容，仍然需要使用setXxxx方法
        stu2.setAge(21);
        System.out.println("姓名：" + stu2.getName());
        System.out.println("年龄：" + stu2.getAge());
    }
}
