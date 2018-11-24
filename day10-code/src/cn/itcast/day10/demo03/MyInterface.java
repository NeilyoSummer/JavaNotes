package cn.itcast.day10.demo03;

/*
这个接口当中有几个方法？
答：
    4个
    methodA         来源于MyInterfaceA接口A
    methodB         来源于MyInterfaceB接口B
    methodCommon    来源于MyInterfaceA接口A和MyInterfaceB接口B
    method          来源于MyInterface接口实现本身
 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {
    public abstract void method();

    @Override
    public default void methodDefault() {
        System.out.println("");
    }
}
